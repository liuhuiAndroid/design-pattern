package com.designpattern.proxyoriginal5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import javax.tools.JavaCompiler.CompilationTask;

import com.designpattern.proxyoriginal5.Moveable;
import com.designpattern.proxyoriginal5.Tank;

public class Proxy {

	/**
	 * 动态代理7这一块比较绕
	 * 
	 * 现在可以随意地生成实现任意接口的代理
	 * 现在有一个很严重的问题是：只能生成时间的代理 不能实现比如说权限这种自定义代理
	 * 任何方法在调用的时间 最好还能够调用别人指定给我的一种处理方式。
	 * 我们现在需要一个可以能动态指定，对某一个方法进行处理的一个东西
	 */
	public static Object newProxyInstance(Class infce,InvocationHandler h) throws Exception{ //JDK1.6 Complier API,CGLib, ASM
		String rt = "\r\n";
		String methodStr = "";
		Method[] methods = infce.getMethods();
		// 这个地方需要改变了
		for(Method m :methods){
			methodStr += "@Override" + rt +
						"public void "+m.getName() +"(){" + rt +
							"try{"+ rt +
							"Method md = " + infce.getName() +".class.getMethod(\"" + m.getName() + "\");" + rt +
							// this 指的是我们的代理对象
							"h.invoke(this,md);" + rt + 
//							"t." + m.getName() + "();"+ rt +
							"}catch(Exception e){"+ rt +
							"e.printStackTrace();"+ rt +
							"}"+ rt +
						"}";
		}
		
		String src = 
				"package com.designpattern.proxyoriginal5;"+ rt +
				"import java.lang.reflect.Method;"+ rt +
				// jdk里面这个类的名字是$Proxy1
				"public class $Proxy1 implements "+ infce.getName()+"{"+ rt +
				
					"public $Proxy1(InvocationHandler h) {"+ rt +
//						"super();"+ rt +
						"this.h = h;"+ rt +
					"}"+ rt +
					"com.designpattern.proxyoriginal5.InvocationHandler h;" + rt +
						
					methodStr + rt +
//					"@Override"+ rt +
//					"public void move() {"+ rt +
//						"long start = System.currentTimeMillis();"+ rt +
//						"t.move();"+ rt +
//						"long end = System.currentTimeMillis();"+ rt +
//						"System.out.println(\"time:\"+(end - start));"+ rt +
//					"}"+ rt +
						
				"}";
		System.out.println("path:"+System.getProperty("user.dir"));
//		String fileName = System.getProperty("user.dir")+
		String fileName = "d:"+
				"/src/com/designpattern/proxyoriginal5/$Proxy1.java";
		
		File f = new File(fileName);
		FileWriter fw = new FileWriter(f);
		fw.write(src);
		fw.flush();
		fw.close();
		
		//生成之后进行编译 compile
		//首先拿到编译器对象
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		System.out.println("compiler:"+compiler.getClass().getName());
		// FileManager用来管理我们生成的文件
		StandardJavaFileManager fileManager =compiler.getStandardFileManager(null, null, null);
		// units是我们要编译的内容
		Iterable units = fileManager.getJavaFileObjects(fileName);
		// 编译任务
		CompilationTask compilationTask = compiler.getTask(null, fileManager, null, null, null, units);
		// 就可以编译完成了
		compilationTask.call();
		fileManager.close();
		//通过show view里面的navigator刷新可以看到硬盘上的真实情况有个.class文件产生
		
		//load into memory and create an instance
		//用classloader来load class的是时候必须得保证class在class path里面，即bin内
		//我们用特殊的classloader
		URL[] urls = new URL[]{new URL("file:/"+"d:/src")};
//		URL[] urls = new URL[]{new URL("file:/"+System.getProperty("user.dir")+"/src")};
		URLClassLoader ul = new URLClassLoader(urls);
		Class c = ul.loadClass("com.designpattern.proxyoriginal5.$Proxy1");
		System.out.println("c = " + c);
		//c = class com.designpattern.proxyoriginal5.TankTimeProxy表示load成功
		
		//反射调用
		//c.newInstance();//会掉用类里面的参数为空的构造方法
		Constructor ctr = c.getConstructor(com.designpattern.proxyoriginal5.InvocationHandler.class);
		Object object = ctr.newInstance(h);
			
		//当我对object调用move的时候，实际上会调用生成代码的h.invoke(this,method)
		//而这个method就是具体我们实现了的InvocationHandler的子类的method
		return object;
		
	}

}

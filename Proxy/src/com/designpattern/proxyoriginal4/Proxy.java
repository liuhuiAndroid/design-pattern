package com.designpattern.proxyoriginal4;

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

import com.designpattern.proxyoriginal4.Moveable;
import com.designpattern.proxyoriginal4.Tank;

public class Proxy {

	/**
	 * 现在可以随意地生成实现任意接口的代理
	 * @return
	 * @throws Exception 
	 */
	public static Object newProxyInstance(Class infce) throws Exception{ //JDK1.6 Complier API,CGLib, ASM
		String rt = "\r\n";
		String methodStr = "";
		Method[] methods = infce.getMethods();
		for(Method m :methods){
			methodStr += "@Override" + rt +
						"public void "+m.getName() +"(){" + rt +
							"long start = System.currentTimeMillis();"+ rt +
							"t." + m.getName() + "();"+ rt +
							"long end = System.currentTimeMillis();"+ rt +
							"System.out.println(\"time:\"+(end - start));"+ rt +
						"}";
		}
		
		String src = 
				"package com.designpattern.proxyoriginal4;"+ rt +
				"public class TankTimeProxy implements "+ infce.getName()+"{"+ rt +
						
					"Moveable t;"+ rt +
				
					"public TankTimeProxy(Moveable t) {"+ rt +
						"super();"+ rt +
						"this.t = t;"+ rt +
					"}"+ rt +
						
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
		String fileName = System.getProperty("user.dir")+
				"/src/com/designpattern/proxyoriginal4/TankTimeProxy.java";
		
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
		URL[] urls = new URL[]{new URL("file:/"+System.getProperty("user.dir")+"/src")};
		URLClassLoader ul = new URLClassLoader(urls);
		Class c = ul.loadClass("com.designpattern.proxyoriginal4.TankTimeProxy");
		System.out.println("c = " + c);
		//c = class com.designpattern.proxyoriginal4.TankTimeProxy表示load成功
		
		//反射调用
		//c.newInstance();//会掉用类里面的参数为空的构造方法
		Constructor ctr = c.getConstructor(Moveable.class);
//		Moveable m = (Moveable) ctr.newInstance(new Tank());
			
		return null;
		
	}

}

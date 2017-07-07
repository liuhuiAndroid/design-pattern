package com.designpattern.compiler.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

public class Test {

	/**
	 * 发现这段代码可以生成文件
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		String rt = "\r\n";
		String src = 
				"package com.designpattern.proxyoriginal3;"+ rt +
				"public class TankTimeProxy implements Moveable{"+ rt +
						
					"Moveable t;"+ rt +
				
					"public TankTimeProxy(Moveable t) {"+ rt +
						"super();"+ rt +
						"this.t = t;"+ rt +
					"}"+ rt +
						
					"@Override"+ rt +
					"public void move() {"+ rt +
						"long start = System.currentTimeMillis();"+ rt +
						"t.move();"+ rt +
						"long end = System.currentTimeMillis();"+ rt +
						"System.out.println(\"time:\"+(end - start));"+ rt +
					"}"+ rt +
						
				"}";
		System.out.println("path:"+System.getProperty("user.dir"));
		String fileName = System.getProperty("user.dir")+
				"/src/com/designpattern/proxyoriginal3/TankTimeProxy.java";
		
		File f = new File(fileName);
		FileWriter fw = new FileWriter(f);
		fw.write(src);
		fw.flush();
		fw.close();
		
		//生成之后进行编译
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
		
	}
	
}

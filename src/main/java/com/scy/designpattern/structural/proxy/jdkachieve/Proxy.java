package com.scy.designpattern.structural.proxy.jdkachieve;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

import org.apache.commons.io.FileUtils;

import com.sun.corba.se.impl.orbutil.closure.Constant;

public class Proxy {

	public static Object newProxyInstance(ClassLoader loader,
										  Class<?>[] interfaces,
										  InvocationHandler h)
			throws Exception {

		//获取路径
		for (int i = 0; i < interfaces.length; i++) {
			Class interfaceClass = interfaces[i];

			System.out.println(interfaceClass.getName());
			Method[] methods = interfaceClass.getMethods();
			for (int j = 0; j < methods.length; j++) {
				Method method = methods[j];
				System.out.println("method.getName()");
				System.out.println(method.getName());

				//h.invoke(null,method,null);
			}
		}




		String str = "package com.scy.designpattern.structural.proxy.jdkachieve;\r\n" +
				"\r\n" + 
				"public class $Proxy0 implements Moveable {\r\n" + 
				"	private Car car;\r\n" + 
				"\r\n" + 
				"	public $Proxy0(Car car) {\r\n" + 
				"		this.car = car;\r\n" + 
				"	}\r\n" + 
				"\r\n" + 
				"	@Override\r\n" + 
				"	public void move() {\r\n" + 
				"		long startTime = System.currentTimeMillis();\r\n" + 
				"		System.out.println(\"汽车开始行驶\");\r\n" + 
				"		car.move();\r\n" + 
				"		long endTime = System.currentTimeMillis();\r\n" + 
				"		System.out.println(\"汽车行驶时间:\" + (endTime - startTime) + \"毫秒!\");\r\n" + 
				"	}\r\n" + 
				"}";
		
		//产生动态代理类的java对象
		String filename = System.getProperty("user.dir") +"/src/main/java/com/scy/designpattern/structural/proxy/jdkachieve/$Proxy0.java";
		File file = new File(filename);
		FileUtils.writeStringToFile(file, str,"utf-8");
		
		//拿到编译器
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		//文件管理者
		StandardJavaFileManager fileMar = compiler.getStandardFileManager(null, null, null);
		//获取文件
		Iterable units = fileMar.getJavaFileObjects(filename);
		
		//编译任务
		CompilationTask t = compiler.getTask(null, fileMar, null, null, null, units);
		//进行编译
		t.call();
		fileMar.close();
		
		//load 到内存
		/*ClassLoader cl = ClassLoader.getSystemClassLoader();
		Class c = cl.loadClass("com.scy.designpattern.structural.proxy.jdkachieve.$Proxy0");
		
		Constructor ctr = c.getConstructor(Car.class);
		return ctr.newInstance(new Car());*/
		Class c = Class.forName("com.scy.designpattern.structural.proxy.jdkachieve.$Proxy0");
		Constructor ctr = c.getConstructor(Car.class);
		return ctr.newInstance(new Car());
	}
	

}

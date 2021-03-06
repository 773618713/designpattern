package com.scy.designpattern.structural.proxy.jdkachieve;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

import org.apache.commons.io.FileUtils;

import com.sun.corba.se.impl.orbutil.closure.Constant;

/**
 * 生成代理类
 * 通过接口对象，拿到接口的名称、方法、方法参数，构建代理类。
 * 代理类中传入InvocationHandler的对象,代理类实现传入的接口。
 * 遍历接口中的方法。构建代理类中的方法。获取方法名，获取方法参数。
 * 调用InvocationHandler.invoke（代理对象,方法,参数）方法
 */
public class Proxy {

	public static Object newProxyInstance(ClassLoader loader,
										  Class<?>[] interfaces,
										  InvocationHandler h)
			throws Exception {


		/**
		 * 遍历接口
		 * 拿到接口名称
		 * 接口中的方法名称
		 * 接口中方法的参数类型
		 */
		String interfaceStr = "";
		String methodsStr = "";
		for (int i = 0; i < interfaces.length; i++) {
			//获取接口的全限定名
			Class interfaceClass = interfaces[i];
			interfaceStr += interfaceClass.getName();
			if (i < interfaces.length-1){
				interfaceStr+=",";
			}

			//获取接口中分方法
			Method[] methods = interfaceClass.getMethods();
			for (int j = 0; j < methods.length; j++) {
				Method method = methods[j];
				String methodStr =
				"	@Override\r\n" +
				"	public void "+method.getName()+"()  throws Throwable{\r\n" +
				"		Method method = interfaces[0].getMethod(\""+method.getName()+"\");\r\n" +
				"		h.invoke(this, method, method.getParameterTypes());\r\n" +
				"	}\r\n";
				methodsStr += methodStr;
				//h.invoke(null,method,method.getParameterTypes());
			}
		}

		//构建代理类的源码
		String str = "package com.scy.designpattern.structural.proxy.jdkachieve;\r\n" +
				"\r\n" +
				"import java.lang.reflect.InvocationHandler;\r\n" +
				"import java.lang.reflect.Method;\r\n" +
				"\r\n" +
				"public class $Proxy0 implements "+interfaceStr+"{\r\n" +
				"	private InvocationHandler h;\r\n" +
				"	private Class<?>[] interfaces;\r\n" +

				"\r\n" +
				"	public $Proxy0(InvocationHandler h, Class<?>[] interfaces) {\r\n" +
				"		this.h = h;\r\n" +
				"		this.interfaces = interfaces;\r\n" +
				"	}\r\n" +
				"\r\n" +
				methodsStr +
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

		//编译应该是异步的，第一次执行会导致类不存在问题。可以多执行几次。
		//Thread.sleep(5000);

		//load 到内存
		ClassLoader cl = ClassLoader.getSystemClassLoader();
		Class c = cl.loadClass("com.scy.designpattern.structural.proxy.jdkachieve.$Proxy0");
		Constructor ctr = c.getConstructor(InvocationHandler.class, interfaces.getClass());
		return ctr.newInstance(h, interfaces);

		/*Class c = Class.forName("com.scy.designpattern.structural.proxy.jdkachieve.$Proxy0");
		Constructor ctr = c.getConstructor(InvocationHandler.class, interfaces.getClass());
		return ctr.newInstance(h, interfaces);*/
	}
	

}

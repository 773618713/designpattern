package com.scy.designpattern.structural.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

public class Test {
	
	/**
	 * JDK动态代理测试类
	 * @param args
	 */
	public static void main(String[] args) throws Throwable {
		Car car = new Car();
		Class<?> cls = car.getClass();
		InvocationHandler h = new TimeHandler(car);
		Moveable m = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), h);
		m.move();

		Moveable2 m2 = (Moveable2) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), h);
		m2.move2();


		/*Class[] i = cls.getInterfaces();
		System.out.println(i[0].getMethod("move"));
		//i[0].getMethod("move").invoke(car);
		h.invoke(null,i[0].getMethod("move"),null);*/
	}
	
}

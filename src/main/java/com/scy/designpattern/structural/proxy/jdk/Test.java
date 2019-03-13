package com.scy.designpattern.structural.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
	
	/**
	 * JDK动态代理测试类
	 * @param args
	 */
	public static void main(String[] args) {
		Car car = new Car();
		Class<?> cls = car.getClass();
		InvocationHandler h = new TimeHandler(car);
		Moveable m = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), h);
		m.move();
	}
	
}

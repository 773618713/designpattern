package com.scy.designpattern.structural.proxy.jdkachieve;

import java.lang.reflect.InvocationHandler;

public class Test2 {
	public static void main(String[] args) throws Throwable {
		try {
			simpleProxyTest();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 代理对象生成测试
	 * @throws Throwable
	 */
	public static void proxyTest() throws Throwable {
		Car car = new Car();
		Class<?> cls = car.getClass();
		InvocationHandler h = new TimeHandler(car);
		Moveable m = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), h);
		m.move();
	}

	/**
	 * 简单代理对象生成 测试
	 * @throws Throwable
	 */
	public static void simpleProxyTest() throws Throwable {
		Car car = new Car();
		Class<?> cls = car.getClass();
		InvocationHandler h = new TimeHandler(car);
		Moveable m = (Moveable) simpleProxy.newProxyInstance();
		m.move();
	}


}

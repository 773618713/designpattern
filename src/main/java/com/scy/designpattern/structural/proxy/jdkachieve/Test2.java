package com.scy.designpattern.structural.proxy.jdkachieve;

import java.lang.reflect.InvocationHandler;

/**
 * 动态代理实现思路
 * 实现功能：通过Proxy的newProxyInstance返回代理对象
 * 1、声名一段源码（动态产生代理）
 * 2、编译源码（JDK Compiler API）,产生新的类（代理类）
 * 3、将这个类load到内存当中，产生一个新的对象（代理对象）
 * 4、return代理对象
 */
public class Test2 {
	public static void main(String[] args) throws Throwable {
		try {
			simpleProxyTest();
			//proxyTest();
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

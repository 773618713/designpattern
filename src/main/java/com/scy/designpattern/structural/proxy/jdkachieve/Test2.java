package com.scy.designpattern.structural.proxy.jdkachieve;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;

public class Test2 {
	public static void main(String[] args) {
		try {
			Car car = new Car();
			Class<?> cls = car.getClass();
			InvocationHandler h = new TimeHandler(car);
			Moveable m = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), h);
			m.move();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

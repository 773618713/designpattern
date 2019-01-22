package com.scy.designpattern.structural.proxy.cglib;

public class Test {
	public static void main(String[] args) {
		Car car = new Car();
		Car proxyCar = (Car) new ProxyFactory(car).getProxyInstance();
		proxyCar.move(260);
	}
}

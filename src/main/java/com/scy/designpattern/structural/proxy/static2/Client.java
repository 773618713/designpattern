package com.scy.designpattern.structural.proxy.static2;

public class Client {
	public static void main(String[] args) {
		Car car = new Car();
		Car3 car3 = new Car3(car);
		car3.move();
	}
}

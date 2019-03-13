package com.scy.designpattern.structural.proxy.static2;

public class Client {
	public static void main(String[] args) {
		Car car = new Car();
		Moveable proxyCar = new ProxyCar(car);
		proxyCar.move();
	}
}

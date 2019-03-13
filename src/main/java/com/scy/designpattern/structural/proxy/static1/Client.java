package com.scy.designpattern.structural.proxy.static1;

public class Client {
	public static void main(String[] args) {
		Moveable proxyCar = new ProxyCar();
		proxyCar.move();
	}
}

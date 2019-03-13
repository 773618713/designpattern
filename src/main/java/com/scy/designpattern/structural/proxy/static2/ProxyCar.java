package com.scy.designpattern.structural.proxy.static2;

public class ProxyCar implements Moveable {
	private Car car;

	public ProxyCar(Car car) {
		this.car = car;
	}

	@Override
	public void move() {
		long startTime = System.currentTimeMillis();
		System.out.println("汽车开始行驶");
		car.move();
		long endTime = System.currentTimeMillis();
		System.out.println("汽车行驶时间:" + (endTime - startTime) + "毫秒!");
	}
}

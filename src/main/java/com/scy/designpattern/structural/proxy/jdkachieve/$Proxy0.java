package com.scy.designpattern.structural.proxy.jdkachieve;

public class $Proxy0 implements Moveable {
	private Car car;

	public $Proxy0(Car car) {
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
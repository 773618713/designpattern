package com.scy.designpattern.structural.proxy.cglib;

public class Car {

	public void move(int time) {
		try {
			Thread.sleep(time);
			System.out.println("汽车行驶中。。。");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

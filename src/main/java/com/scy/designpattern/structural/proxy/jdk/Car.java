package com.scy.designpattern.structural.proxy.jdk;

import java.util.Random;

public class Car implements Moveable,Moveable2{

	@Override
	public void move() {
		
		try {
			Thread.sleep(new Random().nextInt(1000));
			System.out.println("汽车行驶中。。。");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void move2() {
		try {
			Thread.sleep(new Random().nextInt(1000));
			System.out.println("2汽车行驶中。。。");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

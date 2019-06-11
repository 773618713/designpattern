package com.scy.designpattern.structural.proxy.jdkachieve;

import java.io.IOException;

public class Test2 {
	public static void main(String[] args) {
		try {
			Moveable m = (Moveable) Proxy.newProxyInstance();
			m.move();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

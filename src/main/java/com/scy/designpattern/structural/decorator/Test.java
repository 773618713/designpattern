package com.scy.designpattern.structural.decorator;

public class Test {
	public static void main(String[] args) {
		Shape circle = new Circle();
		//circle.draw();
		Shape shapeDecorator = new RedShapeDecorator(circle);
		shapeDecorator.draw();
	}
}

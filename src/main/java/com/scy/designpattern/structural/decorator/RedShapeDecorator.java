package com.scy.designpattern.structural.decorator;

/**
 * 红色形状装饰器
 */
public class RedShapeDecorator extends ShapeDecorator{

	public RedShapeDecorator(Shape decoratorShape) {
		super(decoratorShape);
	}
	
	@Override
	public void draw() {
		super.draw();
		setRedBorder();
	}

	private void setRedBorder() {
		System.out.println("Border Color: Red");
	}
	
}

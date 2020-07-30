package com.scy.designpattern.structural.decorator;

/**
 * 形状装饰器
 */
public abstract class ShapeDecorator implements Shape{
	protected Shape decoratorShape;
	
	public ShapeDecorator(Shape decoratorShape) {
		this.decoratorShape = decoratorShape;
	}
	
	@Override
	public void draw() {
		decoratorShape.draw();
	}
}

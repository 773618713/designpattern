package com.scy.designpattern.structural.proxy;
/**
 * 使用代理模式实现单例
 * @author sun
 *
 */
public class ProxyPatternDemo {

	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jpg");

		// 图像将从磁盘加载
		image.display();
		System.out.println("");
		// 图像不需要从磁盘加载
		image.display();
	}
}
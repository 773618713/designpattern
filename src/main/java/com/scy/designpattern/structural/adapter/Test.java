package com.scy.designpattern.structural.adapter;
/**
 * 
 * <p>Title: Test</p>  
 * <p>Description: </p> 
 * <p>适配器模式</p> 
 * @author sun
 * @date 2019年1月27日
 * @version 1.0.1
 */
public final class Test {
	private Test() {
		
	}
	
	/**
	 * <p>Title: main</p>  
	 * main方法
	 * @param args	参数
	 */
	public static void main(String[] args) {
		/**
		 * 
		 */
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp4", "123.mp4");
	}
	
}

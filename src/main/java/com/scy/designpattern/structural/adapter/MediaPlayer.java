package com.scy.designpattern.structural.adapter;
/**
 * 
 * <p>Title: MediaPlayer</p>  
 * <p>Description: </p> 
 * @author sun
 * @date 2019年1月27日
 * @version 1.0.1
 */
public interface MediaPlayer {
	/**
	 * 
	 * @param type	类型
	 * @param path	地址
	 */
	void play(String type, String path);
}

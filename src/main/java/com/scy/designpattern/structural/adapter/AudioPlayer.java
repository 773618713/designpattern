package com.scy.designpattern.structural.adapter;

/**
 * 
 * <p>Title: AudioPlayer</p>  
 * <p>Description: </p> 
 * 
 * @author sun
 * @date 2019年1月27日
 * @version 1.0.1
 */
public class AudioPlayer implements MediaPlayer {

	AdvancedMediaPlayer advancedMediaPlayer;
	
	@Override
	public void play(String type, String path) {
		if ("mp3".equals(type)) {
			// 原有的支持
			System.out.println("播放MP3音乐");
		} else if ("mp4".equals(type)) {
			// 功能增强
			if (advancedMediaPlayer == null) {
				advancedMediaPlayer = new AdvancedMediaPlayer();
				advancedMediaPlayer.play(type, path);
			}
		}
	}

}

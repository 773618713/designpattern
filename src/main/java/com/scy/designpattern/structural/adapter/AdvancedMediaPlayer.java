package com.scy.designpattern.structural.adapter;
/**
 * 
 * @author sun
 *
 */
public class AdvancedMediaPlayer implements MediaPlayer {

	@Override
	public void play(String type, String path) {
		System.out.printf("%s", "播放MP4视频");
	}

}

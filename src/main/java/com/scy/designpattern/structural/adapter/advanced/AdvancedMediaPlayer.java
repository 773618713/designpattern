package com.scy.designpattern.structural.adapter.advanced;
/**
 * 
 * @author sun
 *
 */
public interface AdvancedMediaPlayer {
	public void playVlc(String fileName);
	public void playMp4(String fileName);

	/*@Override
	public void play(String type, String path) {
		System.out.printf("%s", "播放MP4视频");
	}*/

}

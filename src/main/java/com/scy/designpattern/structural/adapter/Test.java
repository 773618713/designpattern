package com.scy.designpattern.structural.adapter;

/**
 * <p>Title: Test</p>
 * <p>Description: </p>
 * <p>适配器模式</p>
 *
 * @author sun
 * @version 1.0.1
 * @date 2019年1月27日
 */
public final class Test {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }

}

package com.scy.designpattern.structural.adapter;

import com.scy.designpattern.structural.adapter.advanced.AdvancedMediaPlayer;
import com.scy.designpattern.structural.adapter.advanced.Mp4Player;
import com.scy.designpattern.structural.adapter.advanced.VlcPlayer;

/**
 * 媒体适配器
 */
public class MediaAdapter implements MediaPlayer {

    //高级媒体播放器
    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
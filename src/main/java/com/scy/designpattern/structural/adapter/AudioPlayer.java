package com.scy.designpattern.structural.adapter;

/**
 * <p>Title: AudioPlayer 音频播放器</p>
 * <p>Description: </p>
 *
 * @author sun
 * @version 1.0.1
 * @date 2019年1月27日
 */
public class AudioPlayer implements MediaPlayer {

    //媒体适配器
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        //播放 mp3 音乐文件的内置支持
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        }
        //mediaAdapter（媒体适配器） 提供了播放其他文件格式的支持
        else if (audioType.equalsIgnoreCase("vlc")
                || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " +
                    audioType + " format not supported");
        }
    }

}

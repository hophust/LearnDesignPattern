package com.viettel.designpattern.structural.adapter.player;

public class AudioPlayer implements MediaPlayer {
    MediaConverter media;
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: " + fileName);
        }  else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            media = new MediaConverter(audioType);
            media.play(audioType, fileName);
        }  else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}


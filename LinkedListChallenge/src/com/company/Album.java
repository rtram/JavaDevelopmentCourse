package com.company;

import java.util.ArrayList;

public class Album {
    private String title;
    private ArrayList<Song> songs = new ArrayList<Song>();

    public Album(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public boolean addSong(Song song) {
        if (!findSong(song.getTitle())) {
            songs.add(song);
            return true;
        }
        return false;
    }

    public void listSongs() {
        for(int i = 0; i < songs.size(); i++) {
            Song currentSong = songs.get(i);
            System.out.println((i+0) + ". " + currentSong.getTitle() + " - " + currentSong.getDuration());
        }
    }

    private boolean findSong(String songTitle) {
        for(int i = 0; i < songs.size(); i++) {
            Song currentSong = songs.get(i);
            if (currentSong.getTitle().equalsIgnoreCase(songTitle)) {
                return true;
            }
        }
        return false;
    }
}

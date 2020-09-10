package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Spotify {
    private ArrayList<Album> albums;
    private LinkedList<Song> playlist;

    public boolean addAlbum(Album album) {
        if (!findAlbum(album.getTitle())) {
            albums.add(album);
            return true;
        }
        return false;
    }

    private boolean findAlbum(String albumTitle) {
        for(int i = 0; i < albums.size(); i++) {
            Album currentAlbum = albums.get(i);
            if (currentAlbum.getTitle().equalsIgnoreCase(albumTitle)) {
                return true;
            }
        }
        return false;
    }
}

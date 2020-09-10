package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Spotify {
    private ArrayList<Album> albums = new ArrayList<Album>();
    private LinkedList<Song> playlist;

    public void listAllAlbumTitles() {
        for (int i = 0; i < albums.size(); i++) {
            Album currentAlbum = albums.get(i);
            System.out.println((i + 1) + ". " + currentAlbum.getTitle());
        }
    }

    public boolean addAlbum(Album album) {
        if (!findAlbum(album.getTitle())) {
            albums.add(album);
            return true;
        }
        return false;
    }

    public Album findAlbumByIndex(int selection) {
        return albums.get((selection - 1));
    }

    private boolean findAlbum(String albumTitle) {
        for (int i = 0; i < albums.size(); i++) {
            Album currentAlbum = albums.get(i);
            if (currentAlbum.getTitle().equalsIgnoreCase(albumTitle)) {
                return true;
            }
        }
        return false;
    }
}

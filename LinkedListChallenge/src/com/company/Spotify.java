package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Spotify {
    private ArrayList<Album> albums = new ArrayList<Album>();
    private LinkedList<Song> playlist = new LinkedList<Song>();

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public LinkedList<Song> getPlaylist() {
        return playlist;
    }

    public void listPlaylist() {
        for (Iterator<Song> i = playlist.iterator(); i.hasNext();) {
            System.out.println(i.next().getTitle());
        }
    }

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

    public boolean addSongToPlaylist(Song song) {
        if (!isSongInPlaylist(song)) {
            return playlist.add(song);
        }
        return false;
    }

    private boolean isSongInPlaylist(Song song) {
        boolean isFound = false;
        for (Iterator<Song> i = playlist.iterator(); i.hasNext();) {
            Song currentSong = i.next();
            if (currentSong.getTitle() == song.getTitle()) {
                return true;
            }
        }

        return false;
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

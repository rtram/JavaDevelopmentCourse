package com.company;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Spotify spotify = new Spotify();
        seedData(spotify);

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        while(!quit) {
            printMainMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    quit = true;
                    System.out.println("Goodbye!");
                    break;
                case 1:
                    albumsMainMenu(scanner, spotify);
                    break;
                case 2:
                    printPlaylistMenu(scanner, spotify);
                    break;
            }
        }
    }

    public static void albumsMainMenu(Scanner scanner, Spotify spotify) {
        boolean quit = false;

        while(!quit) {
            printAlbumsMainMenu(spotify);
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    quit = true;
                    break;
                default:
                    Album selectedAlbum = spotify.findAlbumByIndex(choice);
                    if(selectedAlbum != null) {
                        albumMenu(scanner, selectedAlbum, spotify);
                    } else {
                        System.out.println("Invalid choice please try again.");
                    }
                    break;
            }
        }
    }

    public static void albumMenu(Scanner scanner, Album selectedAlbum, Spotify spotify) {
        boolean quit = false;

        while(!quit) {
            printAlbumMenu(selectedAlbum);
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    quit = true;
                    break;
                default:
                    Song selectedSong = selectedAlbum.findSongByIndex(choice);
                    if(selectedSong != null) {
                        spotify.addSongToPlaylist(selectedSong);
                    } else {
                        System.out.println("Invalid choice please try again");
                    }
                    break;
            }
        }
    }

    public static void printPlaylistMenu(Scanner scanner, Spotify spotify) {
        boolean back = false;
        boolean goingForward = true;
        ListIterator<Song> playlistIterator = spotify.getPlaylist().listIterator();

        spotify.listPlaylist();
        playlistOptions();

        while(!back) {
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    back = true;
                    break;
                case 1:
                    if(!goingForward) {
                        if(playlistIterator.hasNext()) {
                            playlistIterator.next();
                        }
                        goingForward = true;
                    }
                    if(playlistIterator.hasNext()) {
                        System.out.println("Now Playing " + playlistIterator.next().getTitle());
                    } else {
                        System.out.println("Reached the end of your playlist.");
                    }
                    break;
                case 2:
                    if(goingForward) {
                        if(playlistIterator.hasPrevious()) {
                            playlistIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(playlistIterator.hasPrevious()) {
                        System.out.println("Now Playing " + playlistIterator.previous().getTitle());
                    } else {
                        System.out.println("Reached the beginning of your playlist.");
                    }
                    break;
                case 9:
                    if (spotify.getPlaylist().size() > 0) {
                        playlistIterator.remove();
                        if(playlistIterator.hasNext()) {
                            System.out.println("Now Playing " + playlistIterator.next().getTitle());
                        } else if(playlistIterator.hasPrevious()) {
                            System.out.println("Now Playing " + playlistIterator.previous().getTitle());
                        }
                        break;

                    }
            }
        }
    }

    public static void playlistOptions() {
        System.out.println("----------------------------");
        System.out.println("Please enter number next to the option you want and press enter");
        System.out.println("----------------------------");
        System.out.println("0. Quit");
        System.out.println("1. Next Song");
        System.out.println("2. Previous Song");
        System.out.println("9. Remove current song from your playlist");
        System.out.println("----------------------------");
    }

    public static void printMainMenu() {
        System.out.println("----------------------------");
        System.out.println("Welcome to Spotify!");
        System.out.println("Please enter the number next to the option you want and press enter.");
        System.out.println("----------------------------");
        System.out.println("0. Quit");
        System.out.println("1. Browse Albums");
        System.out.println("2. Playlist Menu");
        System.out.println("----------------------------");
    }

    public static void printAlbumsMainMenu(Spotify spotify) {
        System.out.println("----------------------------");
        System.out.println("Albums Menu");
        System.out.println("Please enter the number next to the album you want to browse and press enter");
        System.out.println("----------------------------");
        System.out.println("0. Return to Main Menu");
        spotify.listAllAlbumTitles();
        System.out.println("----------------------------");
    }

    public static void printAlbumMenu(Album selectedAlbum) {
        System.out.println("----------------------------");
        System.out.println("You have a selected " + selectedAlbum.getTitle() + "!");
        System.out.println("Select a song to add to your playlist.");
        System.out.println("----------------------------");
        System.out.println("0. Return to Albums Menu");
        selectedAlbum.listSongs();
        System.out.println("----------------------------");
    }

    public static void seedData(Spotify spotify) {
        Album detroit2 = new Album("Detroit 2");
        Song whywouldistop = new Song("Why Would I Stop?", "2:32");
        Song luckyMe = new Song("Lucky Me", "4:08");
        Song wolves = new Song("Wolves", "3:20");

        detroit2.addSong(whywouldistop);
        detroit2.addSong(luckyMe);
        detroit2.addSong(wolves);

        Album apromisemade = new Album("A Promise Made");
        Song oath = new Song("Oath", "2:27");
        Song virtualFriends = new Song("Virtual Friends", "3:47");
        Song casualTrouble = new Song("Casual Trouble", "3:12");

        apromisemade.addSong(oath);
        apromisemade.addSong(virtualFriends);
        apromisemade.addSong(casualTrouble);

        spotify.addAlbum(detroit2);
        spotify.addAlbum(apromisemade);
    }
}

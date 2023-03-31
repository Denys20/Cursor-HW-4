package service;

import model.Song;

import java.util.ArrayList;

public class ClassicalMusicPlayer implements Player {
    private ArrayList<Song> songs;

    public ClassicalMusicPlayer(ArrayList<Song> songs) {
        this.songs = songs;
    }

    @Override
    public void play() {
        System.out.println("Грає класична музика: ");

        for (Song song : songs) {
            System.out.println(song.toString());
        }
    }
}

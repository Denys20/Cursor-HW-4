package service;

import model.Song;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class RockMusicPlayer implements Player {
    private ArrayList<Song> songs;

    public RockMusicPlayer(ArrayList<Song> songs) {
        this.songs = songs;
    }

    @Override
    public void play() {
        System.out.println("Грає рок музика: ");

        for (Song song : songs) {
            System.out.println(song.toString());
        }
    }
}

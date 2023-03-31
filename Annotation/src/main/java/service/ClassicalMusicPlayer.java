package service;

import model.Song;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

@Component
public class ClassicalMusicPlayer implements Player {
    private ArrayList<Song> songs;

    public ClassicalMusicPlayer(ArrayList<Song> songs) {
        this.songs = songs;
    }

    @PostConstruct
    public void init() {
        songs = new ArrayList<>();

        songs.add(new Song("Ноктюрн","Микола Лисенко"));
        songs.add(new Song("Реквієм","Вольфганг Амадей Моцарт"));
        songs.add(new Song("Аве Марія","Йоганн Себастьян Бах"));
    }


    @Override
    public void play() {
        System.out.println("Грає класична музика: ");

        for (Song song : songs) {
            System.out.println(song.toString());
        }
    }
}

package service;

import model.Song;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

@Component
public class RockMusicPlayer implements Player {
    private ArrayList<Song> songs;

    public RockMusicPlayer(ArrayList<Song> songs) {
        this.songs = songs;
    }

    @PostConstruct
    public void init() {
        songs = new ArrayList<>();

        songs.add(new Song("Вiдпусти","Океан Ельзи"));
        songs.add(new Song("Кольорова","Скрябін"));
        songs.add(new Song("Чорне сонце","Мертвий півень"));
    }

    @Override
    public void play() {
        System.out.println("Грає рок музика: ");

        for (Song song : songs) {
            System.out.println(song.toString());
        }
    }
}

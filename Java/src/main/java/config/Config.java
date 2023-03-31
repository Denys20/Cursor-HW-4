package config;

import model.Song;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.ClassicalMusicPlayer;
import service.MusicPlayer;
import service.RockMusicPlayer;

import java.util.ArrayList;

@Configuration
public class Config {
    @Bean
    public ClassicalMusicPlayer classicalMusicPlayer() {
        ArrayList<Song> songsClassical = new ArrayList<>();

        songsClassical.add(new Song("Ноктюрн","Микола Лисенко"));
        songsClassical.add(new Song("Реквієм","Вольфганг Амадей Моцарт"));
        songsClassical.add(new Song("Аве Марія","Йоганн Себастьян Бах"));

        return new ClassicalMusicPlayer(songsClassical);
    }

    @Bean
    public RockMusicPlayer rockMusicPlayer() {
        ArrayList<Song> songsRock = new ArrayList<>();

        songsRock.add(new Song("Вiдпусти","Океан Ельзи"));
        songsRock.add(new Song("Кольорова","Скрябін"));
        songsRock.add(new Song("Чорне сонце","Мертвий півень"));

        return new RockMusicPlayer(songsRock);
    }

    @Bean
    public MusicPlayer musicPlayer(ClassicalMusicPlayer classicalMusicPlayer, RockMusicPlayer rockMusicPlayer) {
        return new MusicPlayer(classicalMusicPlayer, rockMusicPlayer);
    }
}

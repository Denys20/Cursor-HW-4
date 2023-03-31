package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private ClassicalMusicPlayer classicalMusicPlayer;
    private RockMusicPlayer rockMusicPlayer;

    @Autowired
    public MusicPlayer(ClassicalMusicPlayer classicalMusicPlayer, RockMusicPlayer rockMusicPlayer) {
        this.classicalMusicPlayer = classicalMusicPlayer;
        this.rockMusicPlayer = rockMusicPlayer;
    }

    public void playClassicMusic() {
        classicalMusicPlayer.play();
    }

    public void playRockMusic() {
        rockMusicPlayer.play();
    }
}

package service;

public class MusicPlayer {
    private ClassicalMusicPlayer classicalMusicPlayer;
    private RockMusicPlayer rockMusicPlayer;

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

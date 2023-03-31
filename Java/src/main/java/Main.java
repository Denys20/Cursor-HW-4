import config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.MusicPlayer;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) throws java.io.UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
        musicPlayer.playClassicMusic();
        musicPlayer.playRockMusic();
        context.close();
    }
}

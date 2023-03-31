import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.MusicPlayer;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) throws java.io.UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
        musicPlayer.playClassicMusic();
        musicPlayer.playRockMusic();
        context.close();
    }
}

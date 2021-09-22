package lvlupcom;

import javazoom.jl.player.Player;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.io.FileInputStream;

public class VK implements Music{
    private String name;
    private String surname;
    private String id;
    private String date;

    public VK(String name, String surname, String id, String date) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.date = date;
    }

    @Override
    public void play(String music) {
        try{
            FileInputStream fileInputStream = new FileInputStream(music);
            Player player = new Player(fileInputStream);
            player.play();
            System.out.println("...");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}

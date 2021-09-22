package lvlupcom;

import javazoom.jl.player.Player;

import java.io.FileInputStream;

public class AppleMusic implements Music{
    private String appleID;
    private String password;

    public AppleMusic(String appleID, String password) {
        this.appleID = appleID;
        this.password = password;
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

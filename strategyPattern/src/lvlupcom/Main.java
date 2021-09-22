package lvlupcom;

public class Main {
    public static void main(String[] args) {
        String music1 = "Корни - С Днём Рождения, Вика.mp3";
        String music2 = "Dr. Alban — It's My Life.mp3";
        String music3 = "Michael Jackson — Billie Jean.mp3";
/*        VK vk = new VK("Yernur", "Kydyrov", "11111", "11/11/11");
        vk.play(music1);*/
        AppleMusic appleMusic = new AppleMusic("1111111","OldButGold");
/*
        appleMusic.play(music2);
*/
        Playlist playlist = new Playlist();
        MusicList musicList = new MusicList(music1);
        playlist.addNewMusic(musicList);
        playlist.play(new AppleMusic("1", "1"));

    }
}

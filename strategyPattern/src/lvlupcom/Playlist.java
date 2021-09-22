package lvlupcom;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    List<MusicList> musicList;

    public Playlist() {
        musicList = new ArrayList<>();
    }

    public void addNewMusic(MusicList list) {
        musicList.add(list);
    }

    public void removeMusic(MusicList list) {
        musicList.remove(list);
    }

    public void play(Music music) {
/*        System.out.println("""
                You want to play music with\s
                1. Apple Music\s
                or\s
                2. VK?""");
        Scanner scanner = new Scanner(System.in);
        switch (Integer.parseInt(scanner.next())){
            case 1 -> {
                System.out.println("""
                        Please, enter your
                        1. Apple ID
                        and
                        2. Password""");
                AppleMusic appleMusic = new AppleMusic(scanner.next(),scanner.next());
                appleMusic.play(String.valueOf(music));
            }
            case 2 -> {
                System.out.println("""
                        Please, enter your
                        1. Name
                        2. Surname
                        3. ID
                        4. Date""");
                VK vk = new VK(scanner.next(), scanner.next(), scanner.next(), scanner.next());
                vk.play(String.valueOf(music));
            }*/


            music.play("Корни - С Днём Рождения, Вика.mp3.mp3");
    }
}

import java.util.ArrayList;

public class CD implements DigitalAlbum {
    private ArrayList<String> songs; 
    private int currentIndex = 0; 

    public CD(ArrayList<String> songs) {
        this.songs = songs; 
    }

    public String playFromBeginning() {
        return songs.get(currentIndex); 
    }

    public String playSong(int num) {
        return songs.get(num);
    }

    public String prevSong() {
        return songs.get(currentIndex - 1);
    }
    public String nextSong() {
        return songs.get(currentIndex + 1);
    }

    public String stop() {
        return "";
    }

    public String pause() {
        return "";
    }

}

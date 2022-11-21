import java.util.ArrayList;

public class CD implements DigitalAlbum {
    private ArrayList<String> songs; 

    private int currentIndex; 

    public CD(ArrayList<String> songs) {
        this.songs = songs; 
    }

    public String playFromBeginning() {
        String song = songs.get(currentIndex); 
        currentIndex += 1;
        return currentIndex + ": " + song; 
    }

    public String playSong(int num) {
        return songs.get(num);
    }

    public String prevSong() {
        currentIndex -= 1; 
        return songs.get(currentIndex);
    }
    public String nextSong() {
        currentIndex += 1; 
        return currentIndex + ": " + songs.get(currentIndex - 1);
    }

    public String stop() {
        return "*********** Stopping ***************";
    }

    public String pause() {
        return "*********** Pause ***************";
    }

}

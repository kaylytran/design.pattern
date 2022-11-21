import java.util.ArrayList;

public class Cassett implements AnalogAlbum{
    private ArrayList<String> songs; 
    private int currentIndex; 
    
    public Cassett(ArrayList<String> songs) {
        this.songs = songs; 
    }

    public String play() {
        String song = songs.get(currentIndex); 
        currentIndex += 1;
        return "Playing song " + currentIndex + ": " + song;
    }

    public String rewind() {
        currentIndex -= 1; 
        return "Rewinding to song " + (currentIndex + 1); 
    }

    public String ffwd() {
        currentIndex += 1;
        return "Forward to song " + (currentIndex + 1); 
    }

    public String pause() {
        return "*********** Pause ***************";
    }

    public String stopEject() {
        return "*********** Ejecting ***************";
    }
}

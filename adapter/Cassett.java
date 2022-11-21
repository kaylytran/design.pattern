import java.util.ArrayList;

public class Cassett implements AnalogAlbum{
    private ArrayList<String> songs; 
    private int currentIndex; 
    
    public Cassett(ArrayList<String> songs) {
        this.songs = songs; 
    }

    public String play() {
        return songs.get(currentIndex);   
    }

    public String rewind() {
        return "Rewinding to song "; 
    }

    public String ffwd() {
        return "Forward to song "; 
    }

    public String pause() {
        return "";
    }

    public String stopEject() {
        return "";
    }
}

/**
 * Cassett implements AnalogAlbum
 * gets the current song and returns the song 
 * when a method is called
 * 
 * @author Kayly Tran 
 */

import java.util.ArrayList;

public class Cassett implements AnalogAlbum{

    /**
     * Private instance variables 
     */
    private ArrayList<String> songs; 
    private int currentIndex; 
    
    /**
     * Parameterized Constructor
     * @param songs
     */
    public Cassett(ArrayList<String> songs) {
        this.songs = songs; 
    }

    /**
     * When the method is called it will do what the method is
     * e.i. play will play the song
     * by taking current index and returning the new index
     * @return String
     */
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

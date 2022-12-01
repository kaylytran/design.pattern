/**
 * CD implements DigitalAlbum
 * gets the current song and returns the song 
 * when a method is called
 * 
 * @author Kayly Tran 
 */


import java.util.ArrayList;

public class CD implements DigitalAlbum {

    /**
     * Private instance variables 
     */
    private ArrayList<String> songs;
    private int currentIndex; 

    /**
     * Parameterized constructor
     * @param songs
     */
    public CD(ArrayList<String> songs) {
        this.songs = songs; 
    }

    /**
     * When the method is called it will do what the method is
     * e.i. play will play the song
     * by taking current index and returning the new index
     * @return String
     */
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
        return songs.get(currentIndex - 1);
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

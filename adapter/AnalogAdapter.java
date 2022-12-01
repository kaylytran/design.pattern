/**
 * AnalogAdapter implements AnalogAlbum
 * creates new album
 * and returns a string when 
 * a method is called used CD methods
 * 
 * @author Kayly Tran
 */

public class AnalogAdapter implements AnalogAlbum{

    /**
     * Private instance variables
     */
    private DigitalAlbum album; 

    /**
     * Parameterized Constructor
     * @param album
     */
    public AnalogAdapter(DigitalAlbum album) {
        this.album = album;  
    }

    /**
     * When the method is called it will do what the method is
     * e.i. play will play the song
     * @return String
     */
    public String play() {
        return "Playing: " + album.playFromBeginning();  
    }

    public String rewind() {
        return "Skipping back and playing: " + album.prevSong(); 
    }

    public String ffwd() {
        return "Playing: " + album.nextSong(); 
    }

    public String pause() {
        return album.pause();
    }

    public String stopEject() {
        return album.stop(); 
    }
}

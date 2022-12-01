/**
 * Interface DigitalAlbum
 */

public interface DigitalAlbum {

    /**
     * public String class
     */
    public String playFromBeginning();
    /**
     * @param num
     */
    public String playSong(int num);
    public String prevSong(); 
    public String nextSong();
    public String stop();
    public String pause(); 
}

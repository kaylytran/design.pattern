public class AnalogAdapter implements AnalogAlbum{
    private DigitalAlbum album; 

    public AnalogAdapter(DigitalAlbum album) {
        this.album = album;  
    }

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

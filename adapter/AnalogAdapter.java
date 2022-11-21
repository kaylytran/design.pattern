public class AnalogAdapter implements AnalogAlbum{
    private DigitalAlbum album; 

    public AnalogAdapter(DigitalAlbum album) {
        this.album = album;  
    }

    public String play() {
        return album.toString();  
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

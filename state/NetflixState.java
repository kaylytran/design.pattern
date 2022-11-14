public class NetflixState implements State{
    
    private TV tv; 
    private String[] movies; 
    private String[] tvShows; 

    public String pressHomeButton() {
        return super.pressHomeButton;
    }

    public String pressNetflixButton() {
        return "TV is already on Netflix";
    }

    public String pressHuluButton() {
        return super.pressHuluButton(); 
    }

    public String pressMovieButton() {
        return super.pressMovieButton(); 
    }

    public String pressTVButton() {
        return super.pressTVButton(); 
    }
}

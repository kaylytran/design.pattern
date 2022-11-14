public class HuluState implements State{

    private TV tv; 
    private String[] movies; 
    private String[] tvShows; 

    public String pressHomeButton() {
        return super.pressHomeButton();
    }

    public String pressNetflixButton() {
        return super.pressNetflixButton();
    }

    public String pressHuluButton() {
        return "TV is already on Hulu"; 
    }

    public String pressMovieButton() {
        return super.pressMovieButton(); 
    }

    public String pressTVButton() {
        return super.pressTVButton(); 
    }
}

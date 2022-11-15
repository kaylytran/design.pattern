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
        String[] movies = new String[] {"- Cars",
                                        "- Cinderella",
                                        "- Wall-E", 
                                        "- ET"};
        return "Hulu Movies:\n" + movies; 
    }

    public String pressTVButton() {
        String[] tvShows = new String[] {"- Seasame Street",
                                         "- Care Bears",
                                         "- Looney Tunes"};
        return "Hulu Movies:\n" + tvShows;; 
    }
}

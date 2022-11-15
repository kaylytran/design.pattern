/** 
 * HuluState implements State
 * Returns a string when a button is 
 * pressed while in HuluState
 * 
 * @author Kayly Tran 
 */
public class HuluState implements State{

    /**
     * Private instance variables 
     */
    private TV tv; 
    private String[] movies = {"- Cars",
                               "- Cinderella",
                               "- Wall-E",
                               "- ET\n"};
    private String[] tvShows = {"- Sesame Street",
                                "- Care Bears",
                                "- Looney Tunes\n"}; 

    /**
     * Parameterized constructor
     * @param tv
     */
    public HuluState(TV tv) {
        this.tv = tv; 
    }

    /**
     * Sets the current state to the new state
     * and/or returns appropriate text for each method
     * @return String 
     */
    public String pressHomeButton() {
        tv.setState(tv.getHomeState());
        return "Loading Home Screen...\n"; 
    }

    public String pressNetflixButton() {
        tv.setState(tv.getNetflixState());
        return "Loading Netflix...\n";
    }

    public String pressHuluButton() {
        return "TV is already on Hulu\n";
    }

    public String pressMovieButton() {
        String movieString = String.join("\n", movies);
        return "Hulu Movies:\n" + movieString; 
    }

    public String pressTVButton() {
        String tvString = String.join("\n", tvShows);
        return "Hulu TV Shows:\n" + tvString; 
    }
    
}

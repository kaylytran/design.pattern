/** 
 * NetflixState implements State
 * Returns a string when a button is 
 * pressed while in NetflixState 
 * 
 * @author Kayly Tran 
 */
public class NetflixState implements State {
    
    /**
     * Private instance variables
     */
    private TV tv; 
    private String[] movies = {"- The Land Before Time",
                               "- Frozen",
                               "- The Little Mermaid",
                               "- Ice Age\n"};
    private String[] tvShows = {"- Peppa Pig",
                                "- My Little Pony",
                                "- Garfield",
                                "- Teenage Mutant Ninja Turtles\n"}; 

    /**
     * Parameterized Constructor
     * @param tv
     */
    public NetflixState(TV tv) {
        this.tv = tv; 
    }

    /**
     * Sets the current state to the new state
     * and/or returns appropriate text for each method
     * @return Sting
     */
    public String pressHomeButton() {
        tv.setState(tv.getHomeState());
        return "Loading Home Screen...\n"; 
    }

    public String pressNetflixButton() {
        return "TV is already on Netflix\n";
    }

    public String pressHuluButton() {
        tv.setState(tv.getHuluState());
        return "Loading Hulu...\n";
    }

    public String pressMovieButton() {
        String movieString = String.join("\n", movies);
        return "Netflic Movies:\n" + movieString; 
    }

    public String pressTVButton() {
        String tvString = String.join("\n", tvShows);
        return "Netflix TV Shows:\n" + tvString; 
    }
    
}

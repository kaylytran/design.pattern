/** 
 * HomeState implements State
 * Returns a string when a button is 
 * pressed while in HomeState
 * 
 * @author Kayly Tran 
 */
public class HomeState implements State{

    /**
     * Private instance variable
     */
    private TV tv; 

    /**
     * Parameterized constructor
     * @param tv
     */
    public HomeState(TV tv) {
        this.tv = tv; 
    }

    /**
     * Sets the current state to the new state 
     * and/or returns appropriate text for each method
     * @return String 
     */
    public String pressHomeButton() {
        return "TV is already on the home screen\n";
    }

    public String pressNetflixButton() {
        tv.setState(tv.getNetflixState());
        return "Loading Netflix...\n";
    }

    public String pressHuluButton() {
        tv.setState(tv.getHuluState());
        return "Loading Hulu...\n";
    }

    public String pressMovieButton() {
        return "Home: You must pick an app to show movies\n";
    }

    public String pressTVButton() {
        return "Home: You must pick an app to show TV shows\n";
    }
    
}

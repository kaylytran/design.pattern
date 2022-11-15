/**
 * sets states,
 * returns new states,
 * and gets state
 * @author Kayly Tran 
 */
public class TV {
    
    /**
     * Private instance variables
     */
    private State HomeState; 
    private State NetflixState; 
    private State HuluState; 
    private State state; 

    /**
     * This method creates new state 
     * and first set the state as HomeState
     */
    public TV() {
        HomeState = new HomeState(this); 
        NetflixState = new NetflixState(this); 
        HuluState = new HuluState(this); 

        state = HomeState; 
    }

    /**
     * These methods returns which action
     * depending on the state
     * @return string: new state
     */
    public String pressHomeButton() {
        return state.pressHomeButton(); 
    }

    public String pressNetflixButton() {
        return state.pressNetflixButton(); 
    }

    public String pressHuluButton() {
        return state.pressHuluButton();
    }

    public String pressMovieButton() {
        return state.pressMovieButton(); 
    }

    public String pressTVButton() {
        return state.pressTVButton(); 
    }

    /**
     * Paramaterized Constructor (setter)
     * @param state 
     */
    public void setState(State state) {
        this.state = state; 
    }

    /**
     * Accessor (getter)
     * @return String: State
     */
    public State getHomeState() {
        return HomeState; 
    }

    public State getNetflixState() {
        return NetflixState; 
    }

    public State getHuluState() {
        return HuluState; 
    }
    
}

public class TV {
    
    private State HomeState; 
    private State NetflixState; 
    private State HuluState; 
    private State state; 

    public TV() {
        HomeState = new HomeState();
        NetflixState = new NetflixState();
        HuluState = new HuluState(); 
    }

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

    public void setState(State state) {
        this.state = state; 
    }

    public State getHomeState() {
        return HomeState(); 
    }

    public State getNetflixState() {
        return NetflixState(); 
    }

    public State getHuluState() {
        return HuluState();
    }
    
}

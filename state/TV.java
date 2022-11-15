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
        TV.HomeState();
        return state.pressHomeButton();
    }

    public String pressNetflixButton() {
        TV.NetflixState(); 
        return state.pressNetflixButton(); 
    }

    public String pressHuluButton() {
        TV.HuluState(); 
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

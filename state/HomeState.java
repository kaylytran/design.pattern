public class HomeState implements State{
    
    private TV tv; 

    public HomeState(TV tv) {
        this.tv = tv; 
    }

    public String pressHomeButton() {
        return "TV is already on the home screen";
    }

    public String pressNetflixButton() {
        tv.setState(tv.getNetflixState());
        return "Loading Netflix...";
    }

    public String pressHuluButton() {
        tv.setState(tv.getHuluState());
        return "Loading Hulu...";
    }

    public String pressMovieButton() {
        return "Home: You must pick an app to show movies";
    }

    public String pressTVButton() {
        return "Home: You must pick an app to show TV shows";
    }
}

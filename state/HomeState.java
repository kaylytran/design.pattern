public class HomeState implements State{
    
    private TV tv; 

    public HomeState(TV tv) {
        this.tv = tv; 
    }

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

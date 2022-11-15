public class HomeState implements State{
    
    private TV tv; 

    public String pressHomeButton() {
        return "TV is already on the home screen";
    }

    public String pressNetflixButton() {
        return super.pressNetflixButton();
    }

    public String pressHuluButton() {
        return super.pressHuluButton(); 
    }

    public String pressMovieButton() {
        return "Home: You must pick an app to show moives,"; 
    }

    public String pressTVButton() {
        return "Home:LK You must pick an app to show tv shows"; 
    }

}

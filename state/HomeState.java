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
        return super.pressMovieButton(); 
    }

    public String pressTVButton() {
        return super.pressTVButton(); 
    }


}

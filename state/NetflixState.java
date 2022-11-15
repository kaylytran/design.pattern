public class NetflixState implements State{
    
    private TV tv; 
    private String[] movies; 
    private String[] tvShows; 

    public String pressHomeButton() {
        return super.pressHomeButton;
    }

    public String pressNetflixButton() {
        return "TV is already on Netflix";
    }

    public String pressHuluButton() {
        return super.pressHuluButton(); 
    }

    public String pressMovieButton() {
        String[] movies = new String[] {"- The Land Before Time",
                                        "- Frozen",
                                        "- The Little Mermaid", 
                                        "- Ice Age"};
        return "Netflix Movies:\n" + movies;  
    }

    public String pressTVButton() {
        String[] tvShows = new String[] {"- Peppa Pig",
                                         "- My Little Pony",
                                         "- Garfield", 
                                         "- Teenage Mutant Nija Turtles"};
        return "Netflix TV Shows:\n" + tvShows;
    }
}

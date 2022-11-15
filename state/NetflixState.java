public class NetflixState implements State {

    private TV tv; 
    private String[] movies = {"- The Land Before Time",
                               "- Frozen",
                               "- The Little Mermaid",
                               "- Ice Age"};
    private String[] tvShows = {"- Peppa Pig",
                                "- My Little Pony",
                                "- Garfield",
                                "- Teenage Mutant Ninja Turtles"}; 

    public NetflixState(TV tv) {
        this.tv = tv; 
    }

    public String pressHomeButton() {
        tv.setState(tv.getHomeState());
        return "Loading Home Screen..."; 
    }

    public String pressNetflixButton() {
        return "TV is already on Netflix";
    }

    public String pressHuluButton() {
        tv.setState(tv.getHuluState());
        return "Loading Hulu...";
    }

    public String pressMovieButton() {
        String movieString = String.join("\n", movies);
        return movieString; 
    }

    public String pressTVButton() {
        String tvString = String.join("\n", tvShows);
        return tvString; 
    }
    
}

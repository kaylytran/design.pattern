public class NetflixState implements State {

    private TV tv; 
    private String[] movies = {"- The Land Before Time",
                               "- Frozen",
                               "- The Little Mermaid",
                               "- Ice Age\n"};
    private String[] tvShows = {"- Peppa Pig",
                                "- My Little Pony",
                                "- Garfield",
                                "- Teenage Mutant Ninja Turtles\n"}; 

    public NetflixState(TV tv) {
        this.tv = tv; 
    }

    public String pressHomeButton() {
        tv.setState(tv.getHomeState());
        return "Loading Home Screen...\n"; 
    }

    public String pressNetflixButton() {
        return "TV is already on Netflix\n";
    }

    public String pressHuluButton() {
        tv.setState(tv.getHuluState());
        return "Loading Hulu...\n";
    }

    public String pressMovieButton() {
        String movieString = String.join("\n", movies);
        return "Netflic Movies:\n" + movieString; 
    }

    public String pressTVButton() {
        String tvString = String.join("\n", tvShows);
        return "Netflix TV Shows:\n" + tvString; 
    }
    
}

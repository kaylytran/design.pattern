public class NetflixState implements State {

    private TV tv; 
    private String[] movies = {"- The Land Before Time\n",
                               "- Frozen\n",
                               "- The Little Mermaid\n",
                               "- Ice Age\n"};
    private String[] tvShows = {"- Peppa Pig\n",
                                "- My Little Pony\n",
                                "- Garfield\n",
                                "- Teenage Mutant Ninja Turtles\n"}; 

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
        tv.setState(tv.pressMovieButton());
        return NetflixState.movies(); 
    }

    public String pressTVButton() {
        tv.setState(tv.pressTVButton());
        return NetflixState.tvShows(); 
    }
    
}

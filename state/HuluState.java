public class HuluState implements State{

    private TV tv; 
    private String[] movies = {"- Cars\n",
                               "- Cinderella\n",
                               "- Wall-E\n",
                               "- ET\n"};
    private String[] tvShows = {"- Sesame Street\n",
                                "- Care Bears\n",
                                "- Looney Tunes\n"}; 

    public HuluState(TV tv) {
        this.tv = tv; 
    }

    public String pressHomeButton() {
        tv.setState(tv.getHomeState());
        return "Loading Home Screen..."; 
    }

    public String pressNetflixButton() {
        tv.setState(tv.getNetflixState());
        return "Loading Netflix...";
    }

    public String pressHuluButton() {
        return "TV is already on Hulu";
    }

    public String pressMovieButton() {
        String movieString = String.join("\n", movies);
        return "Hulu Movies:\n" + movieString; 
    }

    public String pressTVButton() {
        String tvString = String.join("\n", tvShows);
        return "Hulu TV Shows:\n" + tvString; 
    }
}

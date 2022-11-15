public class HuluState implements State{

    private TV tv; 
    private String[] movies = {"- Cars",
                               "- Cinderella",
                               "- Wall-E",
                               "- ET\n"};
    private String[] tvShows = {"- Sesame Street",
                                "- Care Bears",
                                "- Looney Tunes\n"}; 

    public HuluState(TV tv) {
        this.tv = tv; 
    }

    public String pressHomeButton() {
        tv.setState(tv.getHomeState());
        return "Loading Home Screen...\n"; 
    }

    public String pressNetflixButton() {
        tv.setState(tv.getNetflixState());
        return "Loading Netflix...\n";
    }

    public String pressHuluButton() {
        return "TV is already on Hulu\n";
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

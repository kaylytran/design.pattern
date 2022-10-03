import java.util.ArrayList;

public class ClothingItem {
    // private attributes 
    private String name; 
    private ClothingPart part;
    private String color; 
    private ArrayList<Season> seasons; 

    // public operations

    // setting name, part, and color from given parameters
    public ClothingItem(String name, ClothingPart part, String color) {
        this.name = name; 
        this.part = part; 
        this.color = color; 
    }

    // if season matches with any predefined values in Season it will return true
    // else it will return false
    public boolean hasSeason(Season season) {
        if(season == Season.FALL)
            return true;
        else if(season == Season.SPRING)
            return true; 
        else if(season == Season.SUMMER)
            return true; 
        else if(season == Season.WINTER)
            return true; 
        else
            return false;          
    }
    
    // will add the season to the arrayList 
    public void addSeason(Season season) {
        seasons.add(season);
    }

    // returns color, part, and name as a string 
    // with the same outline as output.txt
    public String toString() {
        return "A " + color + " " + part + " " + name; 
    }

}

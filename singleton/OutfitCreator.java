import java.util.ArrayList;
import java.util.Random;

public class OutfitCreator {
    // private attributes

    private ArrayList<ClothingItem> tops;
    private ArrayList<ClothingItem> bottoms; 
    private ArrayList<ClothingItem> whole; 
    private Random rand; 
    private static OutfitCreator outfitCreator; 

    // public operations

    // the tops array list is filled but using the FileReader class
    // same thing with whole and top 
    private OutfitCreator() {
        tops = FileReader.getClothing("bottoms.txt", ClothingPart.BOTTOM);
        bottoms = FileReader.getClothing("tops.txt", ClothingPart.TOP);
        whole = FileReader.getClothing("wholes.txt", ClothingPart.WHOLE);
    }

    // if there is not an OutfitCreator it will make one and then return it
    // if there was already one, it will return it 
    public static OutfitCreator getInstance() {
        if(outfitCreator == null)
            outfitCreator = new OutfitCreator();
        return outfitCreator; 
    }

    // will use rand.nextBoolean to get true or false, which is 50/50
    // if true will return a bottom and top
    // if false will return a whole 
    public String getOutfit(Season season) {
        Random rand = new Random();
        boolean choice = rand.nextBoolean(); 
        if(choice == true)
            return "top and bottom for " + season; 
        else
            return "whole outfit for " + season;
    }   
}

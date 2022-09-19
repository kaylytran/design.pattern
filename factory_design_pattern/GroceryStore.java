import javax.lang.model.util.ElementScanner14;

public class GroceryStore {
    
    public Cereal createCereal(String cereal) {
        if(cereal.equalsIgnoreCase("frosted flakes")) {
            return new FrostedFlakes();
        }
         else if(cereal.equalsIgnoreCase("fruit loops")) {
            return new FruitLoops();
        }
        else if(cereal.equalsIgnoreCase("lucky charms")) {
            return new LuckyCharms();
        }
        return null;
    }

}

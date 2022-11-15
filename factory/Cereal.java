import java.util.ArrayList;

public class Cereal {
    protected String name;
    protected double price;
    protected ArrayList<String> toys = new ArrayList<String>(); 
  

    public Cereal(String name, double price) {
        this.name = name; 
        this.price = price; 
    }

    public String prepare() {
        return "";
    }

    public String boxCereal() {
        return "Boxing the " + name +
                "\n \t -Drawing the fun pictures of " + name + " on the box" +
                "\n \t -Pouring the " + name + " into the box" +
                "\n \t -Adding the suprise" + toys.get(0);
    }

    public String priceCereal() {
        return "\nPutting the price tage of $ " + price + " on the " + name + " box"; 
    }

    
}

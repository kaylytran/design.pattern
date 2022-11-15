public class FruitLoops extends Cereal{
   
    public FruitLoops () {
        super("Fruit Loops", 1.89);
        toys.add("Paw Patrol Stickers");
        toys.add("Bat Man ring");
        toys.add("Silly Putty");
        toys.add("Tiny car");
    } 

    public String prepare() {
        return "Preparing the Fruit Loops" +
                "\n\t- Gather the grain" + 
                "\n\t- Shape into circles" +
                "\n\t- Randonly color circles" +
                "\n\t- Let circles dry";
    }
  
}

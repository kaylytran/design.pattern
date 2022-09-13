import java.util.ArrayList;

public class Ornaments extends TreeDecorator{
   // private Tree tree; 

    Ornaments(ArrayList<String> tree) {
         super(FileReader.getLines("ornaments.txt"));
    }
}
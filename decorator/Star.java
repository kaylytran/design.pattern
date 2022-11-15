import java.util.ArrayList;

public class Star extends TreeDecorator{
   // private Tree tree; 

    Star(ArrayList<String> tree) {
         super(FileReader.getLines("star.txt"));
    }
}

package strategy;
import java.util.ArrayList;

public class CrawlBehavior extends MoveBehavior {
    public void move(ArrayList<String> character) {
        String [] array = new String[0]; 
        array[0] = "++O";
        System.out.print(array);
    }
    
}

package strategy;
import java.util.ArrayList;

public class WalkBehavior extends MoveBehavior{

    public void move(ArrayList<String> character) {
        String [] array = new String[2]; 
        array[0] = " O ";
        array[1] = "-V- ";
        array[2] = "| |";
        System.out.print(array);
    }
}

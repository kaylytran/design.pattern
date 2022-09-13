package strategy;
import java.util.ArrayList;

public class RunBehavior extends MoveBehavior{
 
    public void move(ArrayList<String> character) {
        String [] array = new String[3]; 
        array[0] = "( )"; 
        array[1] = ">|<"; 
        array[2] = " ^ ";
        System.out.print(array);
    }	

}

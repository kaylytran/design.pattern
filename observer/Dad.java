//  package observer; 

import java.util.Random; 

public class Dad implements Observer{
    private Subject baby; 
    private Random rand;

    public Dad(Subject baby) {
        rand = new Random(); 
        this.baby = baby; 
        baby.registerObserver(this); 
    }

    public void update(Cry cry) {
        if(cry.equals(Cry.ANGRY)) {
            System.out.println("Dad puts a pillow over his head");
        } else if(cry.equals(Cry.HUNGRY)) {
            System.out.println("Dad puts a pillow over his head");
        } else if(cry.equals(Cry.WET)) {
            System.out.print("Dad nugges mom");
        }
    }
}

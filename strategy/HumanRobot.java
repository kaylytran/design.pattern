package strategy;

public class HumanRobot extends Robot {
    public HumanRobot(String name) {
        super(name);
        moveBehavior = new CrawlBehavior();
    }

    public String toString() {
        return super.toString();
    }
    
}

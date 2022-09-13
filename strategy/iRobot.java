package strategy;

public class iRobot extends Robot {
    public iRobot(String name) {
        super(name);
        moveBehavior = new CrawlBehavior();
    }

    public String toString() {
        return super.toString();
    }
    
}
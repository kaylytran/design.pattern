package strategy;

public class DogRobot extends Robot{
    public DogRobot(String name) {
        super(name);
        moveBehavior = new CrawlBehavior();
    }

    public String toString() {
        return super.toString();
    }
}

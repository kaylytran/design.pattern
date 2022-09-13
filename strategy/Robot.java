package strategy;

public abstract class Robot {
    protected String name; 
    protected String character; 
    protected MoveBehavior moveBehavior; 

    public Robot(String name) {  //constructor
        this.name = name;
    } 

    public String getName() {
        return this.name; 
    }

    public String toString(String character) {
        return this.character; 
    }
/* 
    public void setMoveBehavior(MoveBehavior moveBehavior) {
        moveBehavior.WalkBehavior; 
        moveBehavior.RunBehavior; 
        moveBehavior.CrawlBEhavior; 
    }
*/
    public void move() {
        System.out.println("moving");
    }
}
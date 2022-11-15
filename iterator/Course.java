import java.util.Iterator;

public class Course {
    // private attributes 
    
    private Assignment[] assignments;
    private int count = 0; 
    private String name; 
    private String title; 

    // public operations 

    // setting name and title from given parameters 
    public Course(String name, String title) {
        this.name = name; 
        this.title = title; 
    }

    // will add assignment to array with given assignment 
    /**
     * @param title
     * @param description
     * @param topic
     */
    
    public void addAssignment(String title, String description, Topic topic) {
        Assignment assignment = new Assignment(title, description, topic);
        if (count >= 5) { // if there is not enough space the array will grow
			growArray(assignments);
            assignments[count] = assignment; // then assign the index with parameter 
		    count = count + 1; // reset the count to next index 
        }
        else {
            assignments[count] = assignment; // then assign the index with parameter 
            count = count + 1;  // reset the count to next index 
        }
    }

    // create assignment iterator
    public Iterator<Assignment> createIterator() { 
        return new AssignmentIterator(assignments);
    }

    // return name and title as a string 
    public String toString() {
        return name + " " + title; 
    }

    //takes the given array, doubles the size, then populates the new array with the give array 
    private Assignment[] growArray(Assignment[] first) {
        int len = first.length;
        Assignment second[] = new Assignment[len * 2];
        second = first; 
        return second;
    }
}

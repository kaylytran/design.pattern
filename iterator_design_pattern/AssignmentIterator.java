import java.util.Iterator;

public class AssignmentIterator implements Iterator<Assignment> {
    // private attributes 
    private Assignment[] assignments; 
    private int position = 0; 
    
    //public operations


    public AssignmentIterator(Assignment[] assignments) {
        this.assignments = assignments;
    }
    
    // if there is a next index it returns true, else false
    public boolean hasNext() {
        if(position >= assignments.length || assignments[position] == null) 
			return false;
        else 
			return true;
    }
    
    // finding next index by getting current and adding one
    public Assignment next() {
        Assignment assignment = assignments[position];
		position = position + 1;
		return assignment;
    }
}

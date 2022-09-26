import java.util.Iterator;

public class AssignmentIterator implements Iterator<Assignment> {
    // private attributes 
    private Assignment[] assignments; 
    private int position = 0; 
    
    //public operations
    public AssignmentIterator(Assignment[] assignments) {
        this.assignments = assignments;
    }
    
    public boolean hasNext() {
        if(position >= assignments.length || assignments[position] == null) 
			return false;
        else 
			return true;
    }
    
    public Assignment next() {
        Assignment assignment = assignments[position];
		position = position + 1;
		return assignment;
    }
}

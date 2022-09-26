public class Assignment {
    // private attributes 
    private String title; 
    private String description;
    private Topic topic; 

    //public operations
    public Assignment(String title, String description, Topic topic) {
        this.title = title; 
        this.description = description;
        this.topic = topic; 
    }

    public boolean hasTopic(Topic topic) {
        if(topic == null) 
            return false;
        else 
            return true;
    }
    public String toString() {
        return title + " " + description + " " + topic; 
    }
}

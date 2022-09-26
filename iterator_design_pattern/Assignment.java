public class Assignment {
    // private attributes 
    private String title; 
    private String description;
    private Topic topic; 

    //public operations

    // seting title, decription and topic from given parameters 
    public Assignment(String title, String description, Topic topic) {
        this.title = title; 
        this.description = description;
        this.topic = topic; 
    }

    // returns false if there is not topic(null) else it returns true
    public boolean hasTopic(Topic topic) {
        if(topic == null) 
            return false;
        else 
            return true;
    }

    // returns title, description and topic as a string
    public String toString() {
        return title + " " + description + " " + topic; 
    }
}

public class School{
    private String name;
    private Address address;
    private PrincipalName principalName;
    private Marks marks;
    
    //default constructor
    public School(){
        
    }
    
    //class constructor
    public School(String name, String Address, String PrincipalName, float marks){
        this.name = name;
        this.address = address;
        this.PrincipalName = PrincipalName;
        this.marks = marks;
    }
    
    //set and get method 
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setPrincipalName(String PrincipalName){
        this.PrincipalName = PrincipalName;
    }
    
    public String getPrincipalName(){
        return PrincipalName;
    }
    
    public void setMarks(float marks){
        this.marks = marks;
    }
    
    public String getMarks(){
        return marks;
    }
    
    //Collecting marks
    public void setNumParticipants(){
        marks = new Marks();
        float avg = marks.average();
        marks.stanDev(avg);
    }
}
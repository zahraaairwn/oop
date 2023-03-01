public class Address{
    private String street;
    private String postcode;
    private String district;
    private String state;
    
    //default constructor
    public Address(){
        
    }
    
    //class constructors
    public Address(String street, String postcode, String district, String state){
        this.street = newStreet;
        this.postcode = newPostcode;
        this.district = newDistrict;
        this.state = newState;
    }
    
    //set and get method 
    public void setStreet(String newStreet){
        this.street = newStreet;
    }
    
    public String getStreet(){
        return street;
    }
    
    public void setPostcode(String newPostcode){
        this.postcode = newPostcode;
    }
    
    public String getPostcode(){
        return postcode;
    }
    
    public void setDistrict(String newDistrict){
        this.district = newDistrict;
    }
    
    public String getDistrict(){
        return district;
    }
    
    public void setState(String newState){
        this.state = newState;
    }
    
    public String getState(){
        return state;
    }

    //String to string method 
    public String toString(){
        return street + " " + postcode + " " + district + " " + state;
    }

}
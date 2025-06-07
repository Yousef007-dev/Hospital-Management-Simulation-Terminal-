
public class Clinic {
    static private int numberOfClinic=0;
    private String name_clinic;
    private int number_clinic;
    
   Clinic(String name){
   name_clinic = name;
   numberOfClinic++;
   number_clinic=numberOfClinic;
}
        
    public String getName_clinic(){
    return name_clinic;
    }
       
    public int getNumber_clinic(){
    return number_clinic;
    } 
}

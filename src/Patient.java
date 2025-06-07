public class Patient {
    static private int numbersOfPatients=0;
    private int patientTreatmentNumber=0;
    private int patientNumber;
    private String patientName;
    private String dateOfBirth;
    private Address patientAddress;

    public Patient(String patientName,
                   String dateOfBirth, String governorate, String city
                    , String streetName, int houseNumber){
        this.patientName=patientName;
        this.dateOfBirth=dateOfBirth;
        numbersOfPatients++;
        patientNumber=numbersOfPatients;

        patientAddress=new Address(governorate,city,streetName,houseNumber);
    }
    public int getPatientNumber(){
        return patientNumber;
    }

    public String getPatientName(){
        return patientName;
    }

    public String getDateOfBirth(){
        return dateOfBirth;
    }

    public int getPatientTreatmentNumber() {
        return patientTreatmentNumber;
    }

    public void addOneToPatientTreatmentNumber() {
        this.patientTreatmentNumber++;
    }
    public void printInfo(){

    }

    public Address getPaitientAddress() {
        return patientAddress;
    }
}

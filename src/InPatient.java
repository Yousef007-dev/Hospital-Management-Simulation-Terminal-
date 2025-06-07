
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class InPatient extends Patient {
    Scanner input =new Scanner(System.in);
     private List<InternalTreatment>internalTreatments=new ArrayList<>();
     private List<ExternalTreatment>externalTreatments=new ArrayList<>();
    private String dischargeDate;


    private boolean disCharge=false;
    public InPatient(String patientName, String dateOfBirth,
                     String governorate, String city, String streetName, int houseNumber,
                     String internalTreatmentDate, double internalTreatmentCost, Section internalTreatmentSection, List<Doctor>doctorsRecord,
                     String externalTreatmentDate, double externalTreatmentCost, Clinic clinicNumber, Doctor doctor){
        super(patientName,dateOfBirth, governorate, city, streetName, houseNumber);
        addOneToPatientTreatmentNumber();
        InternalTreatment firstInternalTreatment=new InternalTreatment(getPatientTreatmentNumber(),internalTreatmentDate
                ,internalTreatmentCost,internalTreatmentSection,doctorsRecord);

        addOneToPatientTreatmentNumber();

        ExternalTreatment firstExternalTreatment=new ExternalTreatment(getPatientTreatmentNumber(),externalTreatmentDate,externalTreatmentCost,clinicNumber,doctor);
        internalTreatments.add(firstInternalTreatment);
        externalTreatments.add(firstExternalTreatment);
    }

      void dischargeOrNot(Boolean choseToDischarge){
        if (choseToDischarge==true){
            System.out.println("Pleas enter the discharge date(DD/MM/YYYY)");
            dischargeDate=input.next();
            disCharge=true;
        }

    }
    public void setInternalTreatments(String treatmentDate, double treatmentCost, Section treatmentSection, List<Doctor>doctorsRecord) {
        addOneToPatientTreatmentNumber();
        InternalTreatment internalTreatment=new InternalTreatment(getPatientTreatmentNumber(),treatmentDate
                ,treatmentCost,treatmentSection,doctorsRecord);
        internalTreatments.add(internalTreatment) ;

    }

    public List<InternalTreatment> getInternalTreatments() {
        return internalTreatments;
    }

    public void setExternalTreatments(String externalTreatmentDate, double externalTreatmentCost, Clinic clinicNumber, Doctor doctor){
        addOneToPatientTreatmentNumber();
        ExternalTreatment externalTreatment=new ExternalTreatment(getPatientTreatmentNumber(),externalTreatmentDate,externalTreatmentCost,clinicNumber,doctor);
        this.externalTreatments.add(externalTreatment);
    }

    public List<ExternalTreatment> getExternalTreatments() {
        return externalTreatments;
    }

    public boolean getDischargeStatement(){
        return disCharge;
    }

    public String getDischargeDate() {
        return dischargeDate;
    }
    public void printInfo(){
        System.out.println("Intern patient Name:"+getPatientName());
        System.out.println("Intern patient date of birth:"+getDateOfBirth());
        System.out.println("Intern governorate:"+getPaitientAddress().getGovernorate());
        System.out.println("Intern City:"+getPaitientAddress().getCity());
        System.out.println("Intern streetName:"+getPaitientAddress().getStreetName());
        System.out.println("Intern houseNumber:"+getPaitientAddress().getHouseNumber());
        System.out.println("Record of the internal treatment:\n");
        for (int i=0;i<internalTreatments.size();i++){
            internalTreatments.get(i).printInfo();
        }
        System.out.println("Record of the external treatment:\n");
        for (int i=0;i<externalTreatments.size();i++)
        {
            externalTreatments.get(i).printInfo();
        }


    }
}

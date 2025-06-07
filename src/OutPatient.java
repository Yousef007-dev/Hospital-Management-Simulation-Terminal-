import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OutPatient extends Patient {


    private List<ExternalTreatment> externalTreatments=new ArrayList<>();
    private boolean admitted;
    private String admissionDate;

    public OutPatient(String patientName, String dateOfBirth,
                      String externalTreatmentDate, double externalTreatmentCost, Clinic clinicNumber, Doctor doctor
            , String governorate, String city, String streetName, int houseNumber
            , boolean admitted, String admissionDate){
        super(patientName,dateOfBirth, governorate, city, streetName, houseNumber);

        addOneToPatientTreatmentNumber();
        ExternalTreatment firstExternalTreatment=new ExternalTreatment(getPatientTreatmentNumber(),externalTreatmentDate,externalTreatmentCost,clinicNumber,doctor);

        externalTreatments.add(firstExternalTreatment);
        this.admitted=admitted;
        this.admissionDate=admissionDate;
    }



    public void setExternalTreatments(String externalTreatmentDate, double externalTreatmentCost, Clinic clinicNumber, Doctor doctor){
        addOneToPatientTreatmentNumber();
        ExternalTreatment externalTreatment=new ExternalTreatment(getPatientTreatmentNumber(),externalTreatmentDate,externalTreatmentCost,clinicNumber,doctor);
        this.externalTreatments.add(externalTreatment);
    }


    public void printInfo(){
        System.out.println("out patient Name:"+getPatientName());
        System.out.println("out patient date of birth:"+getDateOfBirth());
        System.out.println("out governorate:"+getPaitientAddress().getGovernorate());
        System.out.println("out City:"+getPaitientAddress().getCity());
        System.out.println("out streetName:"+getPaitientAddress().getStreetName());
        System.out.println("out houseNumber:"+getPaitientAddress().getHouseNumber());

        System.out.println("Record of the external treatment:\n");
        for (int i=0;i<externalTreatments.size();i++)
        {
            externalTreatments.get(i).printInfo();
        }
    }



}

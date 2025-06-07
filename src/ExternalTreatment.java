public class ExternalTreatment extends TreatmentRecord {
    private Clinic clinicNumber;
    private Doctor doctor;
    public ExternalTreatment(int treatmentNumber, String treatmentDate, double treatmentCost, Clinic clinicNumber, Doctor doctor ){
        super(treatmentNumber,treatmentDate,treatmentCost);
        this.clinicNumber=clinicNumber;
        this.doctor =doctor;
    }
    public int getClinicNumber(){
        return clinicNumber.getNumber_clinic();
    }

    public Doctor getDoctor(){
        return doctor;
    }
    public void printInfo(){
        System.out.println("External treatment Number:"+getTreatmentNumber());
        System.out.println("External treatment Date:"+getTreatmentDate());
        System.out.println("External treatment Cost:"+getTreatmentCost());
        System.out.println("External treatment Clinic Number:"+getClinicNumber());
        System.out.println("External treatment Doctor:");
        Doctor doctor = getDoctor();
        if (doctor instanceof AttendingDoctor){
            AttendingDoctor attendingDoctor= (AttendingDoctor) doctor;
            attendingDoctor.printInfo();
        }
        else if (doctor instanceof InternDoctor){
            InternDoctor internDoctor = (InternDoctor) doctor;
            internDoctor.printInfo();
        }
        else if (doctor instanceof ContractedDoctor){
            ContractedDoctor contractedDoctor= (ContractedDoctor) doctor;
            contractedDoctor.printInfo();
        }
        System.out.println("\n");
    }

}

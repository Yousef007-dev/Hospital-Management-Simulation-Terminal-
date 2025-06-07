import java.util.List;

public class InternalTreatment extends TreatmentRecord {
    private Section treatmentSection;
    private List<Doctor>doctorsRecord;
    public InternalTreatment(int treatmentNumber, String treatmentDate, double treatmentCost, Section treatmentSection, List<Doctor>doctorsRecord){
        super(treatmentNumber,treatmentDate,treatmentCost);
        this.treatmentSection =treatmentSection;
        this.doctorsRecord=doctorsRecord;
    }
    public int getTreatmentSection(){
        return treatmentSection.getNumberOfSection();
    }


    public void printInfo(){
        System.out.println("Intern treatment Number:"+getTreatmentNumber());
        System.out.println("Intern treatment Date:"+getTreatmentDate());
        System.out.println("Intern treatment Cost:"+getTreatmentCost());
        System.out.println("Intern treatment Section:"+getTreatmentSection());
        System.out.println("Doctors who have been involved in this treatment:\n");
        for (int i=0;i<doctorsRecord.size();i++){
            doctorsRecord.get(i).printInfo();
        }
    }


}

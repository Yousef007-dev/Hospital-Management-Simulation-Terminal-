public class TreatmentRecord {
    private int treatmentNumber;
    private String treatmentDate;
    private double treatmentCost;

    public TreatmentRecord(int treatmentNumber, String treatmentDate, double treatmentCost){
        this.treatmentNumber=treatmentNumber;
        this.treatmentDate=treatmentDate;
        this.treatmentCost=treatmentCost;
    }

    public int getTreatmentNumber() {
        return treatmentNumber;
    }


    public String getTreatmentDate() {
        return treatmentDate;
    }


    public double getTreatmentCost() {
        return treatmentCost;
    }
    public void printInfo(){

    }
}

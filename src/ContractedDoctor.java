public class ContractedDoctor extends Doctor{

    static private int numberOfContractedDoctor=0;


    private double contractorDoctorPayment=0;
    private String dateOfContract;

    ContractedDoctor(String doctorName, String doctorBirthday,
                     String governorate, String city,String streetName,
                     int houseNumber,String dateOfContract)
    {
        super( doctorName,doctorBirthday,
                governorate,city,streetName,houseNumber);

        this.dateOfContract=dateOfContract;
        numberOfContractedDoctor++;
    }


    public void setContractorDoctorPayment(double priceOfTreatment)
    {
        contractorDoctorPayment = contractorDoctorPayment+(priceOfTreatment/2);
    }


    public double getContractorDoctorPayment() {
        return contractorDoctorPayment;
    }

    public String getDateOfContract() {
        return dateOfContract;
    }

    public static int getNumberOfContractedDoctor() {
        return numberOfContractedDoctor;
    }

    @Override
    void printInfo() {
        System.out.println("Contracted Doctor's name: "+getDoctorName());
        System.out.println("Contracted Doctor's number: "+getDoctorNumber());
        System.out.println("Contracted Doctor's birthday(DD/MM/YYYY): "+getDoctorBirthday());
        System.out.println("Contracted Doctor's date of contract(DD/MM/YYYY): "+getDateOfContract());
        System.out.println("Contracted Doctor's payment til now: "+getContractorDoctorPayment());
        System.out.println("\n");
    }
}

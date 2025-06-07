
  abstract public class Doctor {
    static private int numberOfDoctors=0;//هون متحول بيحسب العدد الكلي للأطباء

    private final int doctorNumber;
    private final String doctorName;
    private final String doctorBirthday;
    private Address doctorAddress;
    Doctor(String doctorName,String doctorBirthday,
           String governorate,String city,String streetName,int houseNumber)
    {
        this.doctorName=doctorName;
        this.doctorBirthday=doctorBirthday;
        doctorAddress=new Address(governorate,city,streetName,houseNumber);
        numberOfDoctors++;
        doctorNumber=numberOfDoctors;
    }

    public int getDoctorNumber() {
        return doctorNumber;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public static int getNumberOfDoctors() {
        return numberOfDoctors;
    }

    public String getDoctorBirthday() {
        return doctorBirthday;
    }

    public Address getDoctorAddress() {
          return doctorAddress;
      }

    abstract void printInfo();

}

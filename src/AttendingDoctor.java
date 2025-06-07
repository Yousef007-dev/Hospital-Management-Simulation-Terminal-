public class AttendingDoctor extends Doctor{

    static private int numberOfAttendingDoctors=0;


    private Section sectionOfTheAttendingDoctor;
    static private double attendingDoctorSalary=1500000;
    private String workStartingDateOfTheAttendingDoctor;

    AttendingDoctor(Section section,String doctorName,
                    String doctorBirthday, String governorate,
                    String city,String streetName,int houseNumber,String workStartingDateOfTheAttendingDoctor)
    {
        super( doctorName,doctorBirthday,
                governorate,city,streetName,houseNumber);
        this.sectionOfTheAttendingDoctor =section;
        this.workStartingDateOfTheAttendingDoctor=workStartingDateOfTheAttendingDoctor;
        numberOfAttendingDoctors++;
    }


    public static double getAttendingDoctorSalary() {
        return attendingDoctorSalary;
    }

    public static int getNumberOfAttendingDoctors() {
        return numberOfAttendingDoctors;
    }

    public Section getSectionOfTheAttendingDoctor() {
        return sectionOfTheAttendingDoctor;
    }

    public String getWorkStartingDateOfTheAttendingDoctor() {
        return workStartingDateOfTheAttendingDoctor;
    }

    @Override
    void printInfo() {
        System.out.println("Attending Doctor's name: "+getDoctorName());
        System.out.println("Attending Doctor's number: "+getDoctorNumber());
        System.out.println("Attending Doctor's birthday(DD/MM/YYYY): "+getDoctorBirthday());
        System.out.println("Attending Doctor's section name:"+ getSectionOfTheAttendingDoctor().getSectionName());
        System.out.println("Attending Doctor's section number: "+ getSectionOfTheAttendingDoctor().getNumberOfSection());
        System.out.println("Attending Doctor's salary: "+getAttendingDoctorSalary());
        System.out.println("\n");

    }
}

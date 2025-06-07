public class InternDoctor extends Doctor{
    private static int numberOfInternDoctors =0;

    private String trainingStartDate;
    private String trainingEndDate;
    private double internDoctorSalary;

    private boolean reddyToBeAttending=false;


    InternDoctor(String doctorName,String doctorBirthday, String governorate,
                 String city,String streetName,int houseNumber,String todayDate,
                 String trainingStartDate,String trainingEndDate){
        super( doctorName,doctorBirthday,
                governorate,city,streetName, houseNumber);
        this.trainingEndDate=trainingEndDate;
        this.trainingStartDate=trainingStartDate;
        
        StringAndCharAndInt.reminderOfTheCharArray=0;

        char[] trainingStartChar = trainingStartDate.toCharArray();

        char[] trainingStartDateMonth={trainingStartChar[StringAndCharAndInt.reminderOfTheCharArray],trainingStartChar[++StringAndCharAndInt.reminderOfTheCharArray]};
        int trainingStartMonthInt=StringAndCharAndInt.CharToInt(trainingStartDateMonth);
        char[] trainingStartDateYear={trainingStartChar[StringAndCharAndInt.reminderOfTheCharArray],trainingStartChar[++StringAndCharAndInt.reminderOfTheCharArray],
                trainingStartChar[++StringAndCharAndInt.reminderOfTheCharArray],trainingStartChar[++StringAndCharAndInt.reminderOfTheCharArray]};//مصفوفة محارف للسنوات
        int trainingStartYearInt=StringAndCharAndInt.CharToInt(trainingStartDateYear);


        StringAndCharAndInt.reminderOfTheCharArray=0;



        char[] todayDateChar =todayDate.toCharArray();

        char[] todayDateMonth={todayDateChar[StringAndCharAndInt.reminderOfTheCharArray],todayDateChar[++StringAndCharAndInt.reminderOfTheCharArray]};
        int todayDateMonthInt=StringAndCharAndInt.CharToInt(todayDateMonth);
        char[] todayDateYear={todayDateChar[StringAndCharAndInt.reminderOfTheCharArray],todayDateChar[++StringAndCharAndInt.reminderOfTheCharArray],
                todayDateChar[++StringAndCharAndInt.reminderOfTheCharArray],todayDateChar[++StringAndCharAndInt.reminderOfTheCharArray]};
        int todayDateYearInt=StringAndCharAndInt.CharToInt(todayDateYear);

        StringAndCharAndInt.reminderOfTheCharArray=0;




        if (trainingStartYearInt==todayDateYearInt)
        {
            internDoctorSalary=AttendingDoctor.getAttendingDoctorSalary()/2;
        }

        if (todayDateYearInt-trainingStartYearInt==1)
        {
            if(todayDateMonthInt-trainingStartMonthInt >= 0)
            {
                internDoctorSalary= (3*AttendingDoctor.getAttendingDoctorSalary())/4;
            }
            if (todayDateMonthInt-trainingStartMonthInt <0)
            {
                internDoctorSalary=AttendingDoctor.getAttendingDoctorSalary()/2;
            }
        }

        if (todayDateYearInt-trainingStartYearInt >= 2)
        {
            internDoctorSalary= (3*AttendingDoctor.getAttendingDoctorSalary())/4;
            reddyToBeAttending=true;
        }

        numberOfInternDoctors++;
    }
    public double getInternDoctorSalary() {
        return internDoctorSalary;
    }

    public String getTrainingEndDate() {
        return trainingEndDate;
    }

    public String getTrainingStartDate() {
        return trainingStartDate;
    }

    public static int getNumberOfInternDoctors() {
        return numberOfInternDoctors;
    }
    public boolean getReddyToBeAttending(){

        return reddyToBeAttending;
    }
    @Override
    void printInfo() {
        System.out.println("Intern Doctor's name: "+getDoctorName());
        System.out.println("Intern Doctor's number: "+getDoctorNumber());
        System.out.println("Intern Doctor's birthday(DD/MM/YYYY): "+getDoctorBirthday());
        System.out.println("Intern Doctor's training start date(DD/MM//YYYY): "+getTrainingStartDate());
        System.out.println("Intern Doctor's training end date(DD/MM//YYYY): "+getTrainingEndDate());
        System.out.println("Intern Doctor's salary: "+ getInternDoctorSalary());
        System.out.println("\n");

    }



}

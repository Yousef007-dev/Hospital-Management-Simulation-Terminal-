import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        List<Doctor> doctors=new ArrayList<>();
        List <AttendingDoctor> attendingDoctors= new ArrayList<>();//أعطيه للبنات
        List <ContractedDoctor> contractedDoctors=new ArrayList<>();//أعطيه للبنات
        List <InternDoctor> internDoctors =new ArrayList<>();
        List<Section> sectionList=new ArrayList<>();
        List<InPatient> inPatientList = new ArrayList<>();
        List<Clinic> clinicList = new ArrayList<>();
        List<Patient> patientList = new ArrayList<>();
        List<OutPatient> outPatientList=new ArrayList<>();


        //إدخال الأقسام
        Section ophthalmologySection =new Section("Ophthalmology");
        sectionList.add(ophthalmologySection);
        Section ambulanceSection =new Section("Ambulance");
        sectionList.add(ambulanceSection);
        Section pulmonologySection =new Section("Pulmonology");
        sectionList.add(pulmonologySection);
        Section digestSection = new Section("Digest");
        sectionList.add(digestSection);
        Section surgerySection =new Section("Surgery");
        sectionList.add(surgerySection);

        Clinic ophthalmologyClinic = new Clinic("OphthalmologyClinic");
        clinicList.add(ophthalmologyClinic);
        Clinic internalClinic = new Clinic("InternalClinic");
        clinicList.add(internalClinic);
        Clinic digestiveClinic = new Clinic("DigestiveClinic");
        clinicList.add(digestiveClinic);


        int userChoice;
        System.out.println("Good morning,Pleas enter today's date: (DD/MM/YYYY)");
        String todayDate=input.nextLine();


        Doctor doctor1 = new AttendingDoctor(ophthalmologySection, "Dr. Smith", "15/05/1975", "Damascus", "Center", "Main St", 10, "01/01/2005");
        doctors.add(doctor1); attendingDoctors.add((AttendingDoctor) doctor1);

        Doctor doctor2 = new AttendingDoctor(ambulanceSection, "Dr. Johnson", "22/08/1980", "Damascus", "West", "Oak Ave", 25, "15/06/2010");
        doctors.add(doctor2); attendingDoctors.add((AttendingDoctor) doctor2);

        Doctor doctor3 = new AttendingDoctor(pulmonologySection, "Dr. Williams", "10/03/1978", "Damascus", "East", "Pine Rd", 7, "01/07/2012");
        doctors.add(doctor3); attendingDoctors.add((AttendingDoctor) doctor3);

        Doctor doctor4 = new AttendingDoctor(digestSection, "Dr. Brown", "05/12/1982", "Damascus", "North", "Maple Ln", 15, "01/03/2015");
        doctors.add(doctor4); attendingDoctors.add((AttendingDoctor) doctor4);

        Doctor doctor5 = new AttendingDoctor(surgerySection, "Dr. Davis", "18/09/1970", "Damascus", "South", "Elm St", 30, "01/01/2008");
        doctors.add(doctor5); attendingDoctors.add((AttendingDoctor) doctor5);

        Doctor doctor6 = new AttendingDoctor(ophthalmologySection, "Dr. Miller", "25/04/1985", "Damascus", "Center", "Park Ave", 12, "01/05/2018");
        doctors.add(doctor6); attendingDoctors.add((AttendingDoctor) doctor6);

        Doctor doctor7 = new AttendingDoctor(ambulanceSection, "Dr. Wilson", "30/11/1976", "Damascus", "West", "Cedar Blvd", 8, "01/09/2014");
        doctors.add(doctor7); attendingDoctors.add((AttendingDoctor) doctor7);

        // Intern Doctors (6)
        Doctor doctor8 = new InternDoctor("Dr. Taylor", "12/07/1990", "Damascus", "Center", "Main St", 5, todayDate, "01/03/2023", "01/03/2025");
        doctors.add(doctor8); internDoctors.add((InternDoctor) doctor8);

        Doctor doctor9 = new InternDoctor("Dr. Anderson", "08/09/1991", "Damascus", "East", "Oak Ave", 3, todayDate, "01/05/2023", "01/05/2025");
        doctors.add(doctor9); internDoctors.add((InternDoctor) doctor9);

        Doctor doctor10 = new InternDoctor("Dr. Thomas", "14/02/1992", "Damascus", "North", "Pine Rd", 7, todayDate, "01/04/2023", "01/04/2025");
        doctors.add(doctor10); internDoctors.add((InternDoctor) doctor10);

        Doctor doctor11 = new InternDoctor("Dr. Jackson", "20/05/1993", "Damascus", "South", "Maple Ln", 9, todayDate, "01/05/2024", "01/05/2026");
        doctors.add(doctor11); internDoctors.add((InternDoctor) doctor11);

        Doctor doctor12 = new InternDoctor("Dr. White", "03/08/1994", "Damascus", "West", "Elm St", 2, todayDate, "01/04/2024", "01/04/2026");
        doctors.add(doctor12); internDoctors.add((InternDoctor) doctor12);

        Doctor doctor13 = new InternDoctor("Dr. Harris", "17/10/1995", "Damascus", "Center", "Park Ave", 11, todayDate, "01/03/2024", "01/03/2026");
        doctors.add(doctor13); internDoctors.add((InternDoctor) doctor13);

        // Contracted Doctors (7)
        Doctor doctor14 = new ContractedDoctor("Dr. Martin", "01/01/1980", "Damascus", "North", "Cedar Blvd", 4, "01/01/2019");
        doctors.add(doctor14); contractedDoctors.add((ContractedDoctor) doctor14);

        Doctor doctor15 = new ContractedDoctor("Dr. Garcia", "14/02/1981", "Damascus", "East", "Main St", 6, "05/03/2019");
        doctors.add(doctor15); contractedDoctors.add((ContractedDoctor) doctor15);

        Doctor doctor16 = new ContractedDoctor("Dr. Martinez", "13/06/1982", "Damascus", "South", "Oak Ave", 8, "01/05/2020");
        doctors.add(doctor16); contractedDoctors.add((ContractedDoctor) doctor16);

        Doctor doctor17 = new ContractedDoctor("Dr. Robinson", "17/12/1983", "Damascus", "West", "Pine Rd", 10, "11/08/2023");
        doctors.add(doctor17); contractedDoctors.add((ContractedDoctor) doctor17);

        Doctor doctor18 = new ContractedDoctor("Dr. Clark", "29/07/1984", "Damascus", "Center", "Maple Ln", 12, "03/09/2022");
        doctors.add(doctor18); contractedDoctors.add((ContractedDoctor) doctor18);

        Doctor doctor19 = new ContractedDoctor("Dr. Rodriguez", "01/01/1985", "Damascus", "North", "Elm St", 14, "11/08/2023");
        doctors.add(doctor19); contractedDoctors.add((ContractedDoctor) doctor19);

        Doctor doctor20 = new ContractedDoctor("Dr. Lewis", "14/03/1986", "Damascus", "East", "Park Ave", 16, "23/05/2022");
        doctors.add(doctor20); contractedDoctors.add((ContractedDoctor) doctor20);


        while (true)
        {
            System.out.println("Welcome to the main menu \n");
            System.out.println("Press [1] if you want to get access to data about doctors.");
            System.out.println("Press [2] if you want to get access to data about patients. ");
            System.out.println("Press [0] if you want to exit. ");

            userChoice = input.nextInt();

            if(userChoice==1)
            {
                while (true){
                    System.out.println("Press [1] if you want to add a doctor.");
                    System.out.println("Press [2] if you want to remove a doctor.");
                    System.out.println("Press [3] if you want to know the number of the doctors.");
                    System.out.println("Press [4] if you want to know the doctors who are available between tow dates.");
                    System.out.println("Press [5] if you want to tern an intern doctor to an attending doctor.");
                    System.out.println("Press [-1] if you want to go back.");

                    userChoice=input.nextInt();
                    input.nextLine();

                    if (userChoice==1)
                    {
                        System.out.println("enter the doctor's name:");
                        String name=input.nextLine();

                        System.out.println("enter the doctor's birthday:(DD/MM/YYYY)");
                        String birthday=input.nextLine();

                        System.out.println("enter the doctor's governorate:");
                        String governorate=input.nextLine();

                        System.out.println("enter the doctor's city:");
                        String city=input.nextLine();

                        System.out.println("enter the doctor's street name:");
                        String streetName=input.nextLine();

                        System.out.println("enter the doctor's house number:");
                        int houseNumber=input.nextInt();

                        System.out.println("Press [1] if the doctor you're adding is an attending doctor.");
                        System.out.println("Press [2] if the doctor you're adding is a contracted doctor.");
                        System.out.println("Press [3] if the doctor you're adding is a intern doctor.");
                        userChoice=input.nextInt();

                        if (userChoice==1){

                            System.out.println("chose the attending doctor's section;\n");
                            for (int j=0;j<sectionList.size();j++)
                            {
                                System.out.println("["+(j+1)+"] "+ sectionList.get(j).getSectionName());
                            }

                            userChoice=input.nextInt();
                            input.nextLine();

                            System.out.println("enter the doctor's work starting date:(DD/MM/YYYY)");
                            String workStartingDate=input.nextLine();
                            AttendingDoctor attendingDoctor=new AttendingDoctor(sectionList.get(userChoice-1),name,birthday,governorate,
                                        city,streetName,houseNumber,workStartingDate);
                            attendingDoctors.add(attendingDoctor);
                            doctors.add(attendingDoctor);
                            System.out.println("Process adding a doctor is finished.");
                            break;

                        }
                        if (userChoice==2){
                            System.out.println("enter the date of contract:");
                            String dateOfContract=input.nextLine();
                            ContractedDoctor contractedDoctor=new ContractedDoctor(name,birthday,governorate,
                                    city,streetName,houseNumber,dateOfContract);
                            contractedDoctors.add(contractedDoctor);
                            doctors.add(contractedDoctor);
                            System.out.println("Process adding a doctor is finished.");
                            break;
                        }
                        if (userChoice==3){
                            System.out.println("enter the starting date of the training:(DD/MM/YYYY)");
                            String startingDateOfTheTraining=input.nextLine();

                            System.out.println("enter the end date of the training:(DD/MM/YYYY)");
                            String endDateOfTheTraining=input.nextLine();
                            InternDoctor internDoctor=new InternDoctor(name,birthday,governorate,city,streetName,houseNumber
                            ,todayDate,startingDateOfTheTraining,endDateOfTheTraining);

                            internDoctors.add(internDoctor);
                            doctors.add(internDoctor);
                            System.out.println("Process adding a doctor is finished.");
                            break;
                        }
                    }
                    if(userChoice==2)
                    {
                        System.out.println("Pleas enter the number of the doctor that you want to remove:");
                        int  doctorNumber=input.nextInt();

                        int checkerOfFinding=0;
                        for(int i=0;i<doctors.size();i++){
                            if(doctorNumber==doctors.get(i).getDoctorNumber()){
                                doctors.remove(i);
                                System.out.println("Doctor has been removed.\n");
                                checkerOfFinding++;
                                break;
                            }

                        }
                        if (checkerOfFinding==0){
                            System.out.println("The number you have entered is invalid.");
                            break;
                        }
                        userChoice=-1;
                        break;
                    }
                    if(userChoice==3)
                    {
                        System.out.println("Number of all doctors: "+ Doctor.getNumberOfDoctors());
                        System.out.println("Number of the attending doctors: "+  AttendingDoctor.getNumberOfAttendingDoctors());
                        System.out.println("Number of the  intern doctor:"+InternDoctor.getNumberOfInternDoctors());
                        System.out.println("Number of the contracted doctors: "+ContractedDoctor.getNumberOfContractedDoctor());
                        break;
                    }
                    if (userChoice==4)
                    {
                        System.out.println("Enter the first(from) date(DD/MM/YYYY): ");
                        String fromDate=input.nextLine();
                        System.out.println("Enter the second(to) date(DD/MM/YYYY):");
                        String toDate=input.nextLine();

                        int checkerOfFindingPresentDoctors=0;

                        for(int i=0;i<doctors.size();i++)
                        {
                            if (doctors.get(i) instanceof AttendingDoctor)
                            {
                                AttendingDoctor attendingDoctor=(AttendingDoctor) doctors.get(i);

                                if (StringAndCharAndInt.firstIsBiggerThanTheSecond(attendingDoctor.getWorkStartingDateOfTheAttendingDoctor(),fromDate)==true){
                                    if (StringAndCharAndInt.firstIsBiggerThanTheSecond(toDate,attendingDoctor.getWorkStartingDateOfTheAttendingDoctor())==true){
                                        attendingDoctor.printInfo();
                                        checkerOfFindingPresentDoctors++;
                                    }
                                }
                            }
                            if (doctors.get(i) instanceof ContractedDoctor)
                            {
                                ContractedDoctor contractedDoctor=(ContractedDoctor) doctors.get(i);

                                if (StringAndCharAndInt.firstIsBiggerThanTheSecond(contractedDoctor.getDateOfContract(),fromDate)==true){
                                    if (StringAndCharAndInt.firstIsBiggerThanTheSecond(toDate,contractedDoctor.getDateOfContract())==true){
                                        contractedDoctor.printInfo();
                                        checkerOfFindingPresentDoctors++;
                                    }
                                }
                            }
                            if (doctors.get(i) instanceof InternDoctor)
                            {
                                InternDoctor internDoctor=(InternDoctor) doctors.get(i);

                                if (StringAndCharAndInt.firstIsBiggerThanTheSecond(internDoctor.getTrainingStartDate(),fromDate)==true){
                                    if (StringAndCharAndInt.firstIsBiggerThanTheSecond(toDate,internDoctor.getTrainingStartDate())==true){
                                        internDoctor.printInfo();
                                        checkerOfFindingPresentDoctors++;
                                    }
                                }
                            }
                        }

                        if (checkerOfFindingPresentDoctors==0){
                            System.out.println("There are no Doctor available in this period of time.");
                        }
                        break;
                    }
                    if (userChoice==5)
                    {
                        System.out.println("Pleas enter the doctor's number:");
                        int internDoctorNumber=input.nextInt();
                        int reminder=0;
                        for (int i=0;i<internDoctors.size();i++){
                            if (internDoctorNumber==internDoctors.get(i).getDoctorNumber()){
                                reminder++;
                                if (internDoctors.get(i).getReddyToBeAttending()==true){
                                    System.out.println("enter the doctor's section:\n");
                                    for (int j=0;j<sectionList.size();j++)
                                    {
                                        System.out.println("["+(j+1)+"] "+ sectionList.get(j).getSectionName());
                                    }
                                    Address newAddress=internDoctors.get(i).getDoctorAddress();
                                    userChoice=input.nextInt();
                                    AttendingDoctor newAttendingDoctor=new AttendingDoctor(sectionList.get(userChoice-1),internDoctors.get(i).getDoctorName(),
                                            internDoctors.get(i).getDoctorBirthday(),newAddress.getGovernorate(),newAddress.getCity(),newAddress.getStreetName()
                                            ,newAddress.getHouseNumber(),todayDate);
                                    doctors.add(newAttendingDoctor);
                                    internDoctors.remove(i);
                                    for(int k=0;k<doctors.size();k++){
                                        if (doctors.get(k)==internDoctors.get(i)){
                                            doctors.remove(k);
                                            break;
                                        }
                                    }
                                    System.out.println("Doctor have been promoted successfully!");
                                    break;
                                }
                                else
                                {
                                    System.out.println("Doctor has not finished his training years,therefor can't be promoted.");
                                }

                            }

                        }
                        if (reminder==0){
                            System.out.println("Doctor not found.");
                        }
                        break;
                    }
                    if ( userChoice==-1)
                    {
                        break;
                    }
                }
            }
            if(userChoice==2)
            {
                while (true)
                {
                    System.out.println("Press [1] if you want to add a New patient.");
                    System.out.println("press [2] if you want to Discharging a patient.");
                    System.out.println("press [3] if you want to add a treatment to the patient's record.");
                    System.out.println("press [4] if you want the records of all patients who have been treated in all departments of the hospital during a specific period of time.");
                    System.out.println("press [5] if you want all the treatments that a patient have had.");//جميع المعالجات التي خضع لها مريض ما
                    System.out.println("press [6] if you want counting the number of patients in a department during a specific of time.");
                    System.out.println("press [-1] if you want to go back.");
                    userChoice = input.nextInt();
                    input.nextLine();

                    if (userChoice==1){
                        System.out.println("enter the patient's name:");
                        String patientName = input.nextLine();

                        System.out.println("enter the patient's dateOfBirth:");
                        String DateOfBirth = input.nextLine();

                        System.out.println("enter the patient's governorate: ");
                        String governorate = input.nextLine();

                        System.out.println("enter the patient's city: ");
                        String city = input.nextLine();

                        System.out.println("enter the patient's streetName:");
                        String streetName = input.nextLine();

                        System.out.println("enter the patient's houseNumber: ");
                        int houseNumber = input.nextInt();


                        System.out.println("press [1] if you want to add an inpatient.");
                        System.out.println("press [2] if you want to add an outpatient.");
                        userChoice = input.nextInt();
                        input.nextLine();
                        if (userChoice == 1) {
                            System.out.println("enter the patient's internalTreatment:");
                            System.out.println("enter the treatment date:(DD/MM/YYYY)");
                            String internalTreatmentDate = input.nextLine();

                            System.out.println("enter the patient's treatment cost:");
                            double internalTreatmentCost = input.nextDouble();
                            System.out.println("enter the number of the treatment's section:");
                            for (int j=0;j<sectionList.size();j++)
                            {
                                System.out.println("["+(j+1)+"] "+ sectionList.get(j).getSectionName());
                            }
                            int numberOfTheTreatmentSection = input.nextInt();


                            Section treatmentSection = ophthalmologySection;
                            List<Doctor> involvedDoctors = new ArrayList<>();

                            for (int i = 0; i < sectionList.size(); i++) {
                                if (numberOfTheTreatmentSection == sectionList.get(i).getNumberOfSection())
                                {

                                    treatmentSection = sectionList.get(i);
                                    System.out.println("how many doctors were involved in the treatment:");

                                    int numberOfDoctorsInvolved = input.nextInt();
                                    input.nextLine();
                                    for (int k = 0; k < numberOfDoctorsInvolved; k++) {
                                        System.out.println("enter the doctor's name:");
                                        String nameOfTheDoctorInvolved = input.nextLine();
                                        for (int j = 0; j < doctors.size(); j++) {
                                            if (nameOfTheDoctorInvolved == doctors.get(k).getDoctorName()) {
                                                if ((doctors.get(k) instanceof AttendingDoctor) == true) {
                                                    AttendingDoctor tempAttendingDoctor = (AttendingDoctor) doctors.get(k);
                                                    if (treatmentSection == tempAttendingDoctor.getSectionOfTheAttendingDoctor()) {
                                                        involvedDoctors.add(tempAttendingDoctor);

                                                    }
                                                } else if ((doctors.get(k) instanceof ContractedDoctor) == true) {
                                                    ContractedDoctor tempContractedDoctor = (ContractedDoctor) doctors.get(k);
                                                    tempContractedDoctor.setContractorDoctorPayment(internalTreatmentCost);
                                                    involvedDoctors.add(tempContractedDoctor);

                                                } else {
                                                    involvedDoctors.add(doctors.get(k));
                                                }

                                            }

                                        }

                                    }
                                }
                            }


                            System.out.println("enter the patient's externalTreatment:\n");
                            System.out.println("enter the patient's treatmentDate:");
                            String externalTreatmentDate = input.nextLine();
                            System.out.println("enter the patient's treatmentCost:");
                            double externalTreatmentCost = input.nextDouble();
                            System.out.println("enter the number of the treatment clinic:\n");
                            for (int i=0;i<clinicList.size();i++)
                            {
                                System.out.println("["+(i+1)+"] "+clinicList.get(i).getName_clinic());
                            }
                            int clinicNumber = input.nextInt();

                            System.out.println("enter the number of the doctor:");
                            int doctorNumber = input.nextInt();
                            for (int i = 0; i < doctors.size(); i++) {
                                if (doctorNumber == doctors.get(i).getDoctorNumber()) {
                                    if (doctors.get(i) instanceof AttendingDoctor == true) {
                                        System.out.println("this doctor is not serving in the clinics enter the correct number pleas:");
                                        doctorNumber=input.nextInt();
                                        i=-1;
                                        continue;
                                    } else if (doctors.get(i) instanceof ContractedDoctor == true) {
                                        ContractedDoctor tempContractedDoctor = (ContractedDoctor) doctors.get(i);
                                        tempContractedDoctor.setContractorDoctorPayment(internalTreatmentCost);
                                        InPatient patient1 = new InPatient(patientName, DateOfBirth, governorate, city, streetName,
                                                houseNumber, internalTreatmentDate, internalTreatmentCost, treatmentSection, involvedDoctors, externalTreatmentDate,
                                                externalTreatmentCost, clinicList.get(clinicNumber-1), tempContractedDoctor);
                                        patientList.add(patient1);
                                        break;
                                    } else if (doctors.get(i) instanceof InternDoctor) {
                                        InternDoctor tempInternDoctor = (InternDoctor) doctors.get(i);
                                        InPatient patient1 = new InPatient(patientName, DateOfBirth, governorate, city, streetName,
                                                houseNumber, internalTreatmentDate, internalTreatmentCost, treatmentSection, involvedDoctors, externalTreatmentDate,
                                                externalTreatmentCost, clinicList.get(clinicNumber-1), tempInternDoctor);
                                        patientList.add(patient1);
                                        System.out.println("Process finished.\n");
                                        break;
                                    }
                                }


                            }


                        }

                        if (userChoice == 2) {

                            System.out.println("enter the patient's externalTreatment:\n");
                            System.out.println("enter the patient's treatmentDate:");
                            String externalTreatmentDate = input.nextLine();
                            System.out.println("enter the patient's treatmentCost:");
                            double externalTreatmentCost = input.nextDouble();
                            System.out.println("enter the number of the treatment clinic:");
                            for (int i=0;i<clinicList.size();i++)
                            {
                                System.out.println("["+(i+1)+"] "+clinicList.get(i).getName_clinic());
                            }
                            int clinicNumber = input.nextInt();
                            input.nextLine();


                            System.out.println("enter the number of the doctor who treated the patient:");
                            int doctorNumber = input.nextInt();

                            for (int i = 0; i < doctors.size(); i++) {


                                if (doctorNumber == doctors.get(i).getDoctorNumber()) {
                                    if (doctors.get(i) instanceof AttendingDoctor == true) {
                                        System.out.println("this doctor is not serving in clinics,Pleas enter the correct number.");
                                        doctorNumber = input.nextInt();
                                        i=-1;
                                        continue;
                                    } else if (doctors.get(i) instanceof ContractedDoctor == true) {
                                        ContractedDoctor tempContractedDoctor = (ContractedDoctor) doctors.get(i);
                                        tempContractedDoctor.setContractorDoctorPayment(externalTreatmentCost);

                                        System.out.println("enter [1] if the patient has been admitted.");
                                        System.out.println("enter [2] if the patient hasn't been admitted.");
                                        int admittedOrNot=input.nextInt();
                                        if (admittedOrNot==1){
                                            System.out.println("enter the admission date");
                                            String admissionDate=input.nextLine();
                                            OutPatient patient1 = new OutPatient(patientName, DateOfBirth, externalTreatmentDate, externalTreatmentCost,
                                                    clinicList.get(clinicNumber-1), tempContractedDoctor, governorate, city, streetName, houseNumber,true,admissionDate);
                                            patientList.add(patient1);
                                            System.out.println("Process finished.\n");
                                            break;
                                        }
                                        if (admittedOrNot==2){
                                            OutPatient patient1 = new OutPatient(patientName, DateOfBirth, externalTreatmentDate, externalTreatmentCost,
                                                    clinicList.get(clinicNumber-1), tempContractedDoctor, governorate, city, streetName, houseNumber,false,"non");
                                            patientList.add(patient1);
                                            System.out.println("Process finished.\n");
                                            break;
                                        }




                                    }
                                    else if (doctors.get(i) instanceof InternDoctor) {
                                        InternDoctor tempInternDoctor = (InternDoctor) doctors.get(i);
                                        System.out.println("enter [1] if the patient has been admitted.");
                                        System.out.println("enter [2] if the patient hasn't been admitted.");
                                        int admittedOrNot=input.nextInt();
                                        if (admittedOrNot==1){
                                            System.out.println("enter the admission date");
                                            String admissionDate=input.nextLine();
                                            OutPatient patient1 = new OutPatient(patientName, DateOfBirth, externalTreatmentDate, externalTreatmentCost,
                                                    clinicList.get(clinicNumber-1), tempInternDoctor, governorate, city, streetName, houseNumber,true,admissionDate);
                                            patientList.add(patient1);
                                            System.out.println("Process finished.\n");
                                            break;
                                        }
                                        if (admittedOrNot==2){
                                            OutPatient patient1 = new OutPatient(patientName, DateOfBirth, externalTreatmentDate, externalTreatmentCost,
                                                    clinicList.get(clinicNumber-1), tempInternDoctor, governorate, city, streetName, houseNumber,false,"non");
                                            patientList.add(patient1);
                                            System.out.println("Process finished.\n");
                                            break;
                                        }
                                    }
                                }


                            }
                            break;
                        }

                    }
                    if (userChoice==2){
                        int checkerOfFindingThePatient=0;
                        System.out.println("enter the patientNumber: ");
                        int patientNumber = input.nextInt();
                        for (int i = 0; i < inPatientList.size(); i++) {
                            if (patientNumber == inPatientList.get(i).getPatientNumber()) {
                                inPatientList.get(i).dischargeOrNot(true);
                                checkerOfFindingThePatient++;
                                System.out.println("Process finished.\n");
                                break;
                            }

                        }
                        if (checkerOfFindingThePatient==0){
                            System.out.println("The number you have entered is not valid.");
                        }
                        break;
                    }
                    if (userChoice==3){
                        System.out.println("enter the patientName:");
                        String patientName = input.nextLine();
                        System.out.println("enter the patientNumber:");
                        int patientNumber = input.nextInt();
                        input.nextLine();
                        for (int i = 0; i < patientList.size(); i++) {
                            if (patientNumber == patientList.get(i).getPatientNumber()) {

                                if ((patientList.get(i) instanceof InPatient) == true) {
                                    InPatient tempInpatient = (InPatient) patientList.get(i);
                                    System.out.println("enter the patient's treatment Date:");
                                    String treatmentDate = input.nextLine();
                                    System.out.println("enter the treatment Cost");
                                    double treatmentCost = input.nextDouble();
                                    System.out.println("press [1] if you want add an internalTreatment.");
                                    System.out.println("press [2] if you want add an externalTreatment.");
                                    userChoice=input.nextInt();
                                    if (userChoice == 1) {
                                        System.out.println("enter the patient's internalTreatment:");

                                        System.out.println("enter the number of the treatment's section:\n");
                                        for (int b=0;b<sectionList.size();b++){
                                            System.out.println("["+(b+1)+"] "+sectionList.get(b).getSectionName());
                                        }
                                        int numberOfTheTreatmentSection = input.nextInt();

                                        List<Doctor> involvedDoctors = new ArrayList<>();
                                        System.out.println("how many doctors were involved in the treatment:");
                                        int numberOfDoctorsInvolved = input.nextInt();
                                        input.nextLine();
                                                for (int k = 0; k < numberOfDoctorsInvolved; k++) {
                                                    System.out.println("enter the doctor's name:");
                                                    String nameOfTheDoctorInvolved = input.nextLine();
                                                    for (int j = 0; j < doctors.size(); j++) {
                                                        if (nameOfTheDoctorInvolved == doctors.get(k).getDoctorName()) {
                                                            if ((doctors.get(k) instanceof AttendingDoctor) == true) {
                                                                AttendingDoctor tempAttendingDoctor = (AttendingDoctor) doctors.get(k);
                                                                if (sectionList.get(i) == tempAttendingDoctor.getSectionOfTheAttendingDoctor()) {
                                                                    involvedDoctors.add(tempAttendingDoctor);

                                                                }
                                                            } else if ((doctors.get(k) instanceof ContractedDoctor) == true) {
                                                                ContractedDoctor tempContractedDoctor = (ContractedDoctor) doctors.get(k);
                                                                tempContractedDoctor.setContractorDoctorPayment(treatmentCost);
                                                                involvedDoctors.add(tempContractedDoctor);

                                                            } else {
                                                                involvedDoctors.add(doctors.get(k));
                                                            }

                                                        }


                                                    }

                                                }
                                        tempInpatient.setInternalTreatments(treatmentDate, treatmentCost, sectionList.get(numberOfTheTreatmentSection-1), involvedDoctors);
                                        inPatientList.remove(patientList.get(i));
                                        patientList.remove(i);
                                        patientList.add(tempInpatient);
                                        inPatientList.add(tempInpatient);
                                        System.out.println("Process finished.\n");
                                        break;
                                    }
                                    if (userChoice == 2) {
                                        System.out.println("enter the patient's externalTreatment:");

                                        System.out.println("enter the number of the treatment clinic:\n");
                                        for (int l=0;l<clinicList.size();l++){
                                            System.out.println("["+(l+1)+"] "+clinicList.get(l).getName_clinic());
                                        }
                                        int clinicNumber = input.nextInt();


                                        System.out.println("enter the number of the doctor who has been in the treatment course:");
                                        int doctorNumber = input.nextInt();
                                        input.nextLine();

                                        for (int n = 0; n < doctors.size(); n++) {


                                            if (doctorNumber == doctors.get(n).getDoctorNumber()) {
                                                if (doctors.get(n) instanceof AttendingDoctor == true) {
                                                    System.out.println("this doctor is not serving in clinics,Pleas enter the correct number.");
                                                    doctorNumber = input.nextInt();
                                                    n=-1;
                                                    continue;
                                                } else if (doctors.get(n) instanceof ContractedDoctor == true) {
                                                    ContractedDoctor tempContractedDoctor = (ContractedDoctor) doctors.get(n);
                                                    tempContractedDoctor.setContractorDoctorPayment(treatmentCost);
                                                    tempInpatient.setExternalTreatments(treatmentDate,treatmentCost,clinicList.get(clinicNumber-1),tempContractedDoctor);
                                                    inPatientList.remove(patientList.get(i));
                                                    patientList.remove(i);
                                                    patientList.add(tempInpatient);
                                                    inPatientList.add(tempInpatient);
                                                    System.out.println("Process finished.\n");
                                                    break;
                                                }


                                            }
                                            else if (doctors.get(i) instanceof InternDoctor) {
                                                InternDoctor tempInternDoctor = (InternDoctor) doctors.get(i);
                                                tempInpatient.setExternalTreatments(treatmentDate,treatmentCost,clinicList.get(clinicNumber-1),tempInternDoctor);
                                                inPatientList.remove(patientList.get(i));
                                                patientList.remove(i);
                                                patientList.add(tempInpatient);
                                                inPatientList.add(tempInpatient);
                                                System.out.println("Process finished.\n");
                                                break;
                                            }

                                        }
                                        break;
                                    }
                                }
                                if ((patientList.get(i) instanceof  OutPatient)==true){
                                    OutPatient tempOutPatient = (OutPatient) patientList.get(i);
                                    System.out.println("enter the patient's treatment Date:");
                                    String treatmentDate = input.nextLine();
                                    System.out.println("enter the treatment Cost");
                                    double treatmentCost = input.nextDouble();
                                    System.out.println("enter the patient's externalTreatment:");

                                    System.out.println("enter the number of the treatment clinic:\n");
                                    for (int l=0;l<clinicList.size();l++){
                                        System.out.println("["+(l+1)+"] "+clinicList.get(l).getName_clinic());
                                    }
                                    int clinicNumber = input.nextInt();


                                    System.out.println("enter the number of the doctor who has been in the treatment course:");
                                    int doctorNumber = input.nextInt();
                                    input.nextLine();

                                    for (int n = 0; n < doctors.size(); n++) {


                                        if (doctorNumber == doctors.get(n).getDoctorNumber()) {
                                            if (doctors.get(n) instanceof AttendingDoctor == true) {
                                                System.out.println("this doctor is not serving in clinics,Pleas enter the correct number.");
                                                doctorNumber = input.nextInt();
                                                n=-1;
                                                continue;
                                            } else if (doctors.get(n) instanceof ContractedDoctor == true) {
                                                ContractedDoctor tempContractedDoctor = (ContractedDoctor) doctors.get(n);
                                                tempContractedDoctor.setContractorDoctorPayment(treatmentCost);
                                                tempOutPatient.setExternalTreatments(treatmentDate,treatmentCost,clinicList.get(clinicNumber-1),tempContractedDoctor);
                                                inPatientList.remove(patientList.get(i));
                                                patientList.remove(i);
                                                patientList.add(tempOutPatient);
                                                outPatientList.add(tempOutPatient);
                                                System.out.println("Process finished.\n");
                                                break;
                                            }


                                        }
                                        else if (doctors.get(i) instanceof InternDoctor) {
                                            InternDoctor tempInternDoctor = (InternDoctor) doctors.get(i);
                                            tempOutPatient.setExternalTreatments(treatmentDate,treatmentCost,clinicList.get(clinicNumber-1),tempInternDoctor);
                                            inPatientList.remove(patientList.get(i));
                                            patientList.remove(i);
                                            patientList.add(tempOutPatient);
                                            outPatientList.add(tempOutPatient);
                                            System.out.println("Process finished.\n");
                                            break;
                                        }

                                    }
                                    break;
                                }
                            }

                        }

                    }
                    if (userChoice==4){
                        System.out.println("enter the first date(DD/MM/YYYY): ");
                        String firstDate=input.nextLine();
                        System.out.println("enter the second date(DD/MM/YYYY): ");
                        String secondDate=input.nextLine();
                        int printedOrNot=0;
                        for(int i=0;i<inPatientList.size();i++){
                            List<InternalTreatment>tempInternalTreatment=inPatientList.get(i).getInternalTreatments();
                            for(int j=0;j<tempInternalTreatment.size();j++){
                                if (StringAndCharAndInt.firstIsBiggerThanTheSecond(tempInternalTreatment.get(j).getTreatmentDate(),firstDate)==true)
                                {
                                    if (StringAndCharAndInt.firstIsBiggerThanTheSecond(secondDate,tempInternalTreatment.get(j).getTreatmentDate())==true)
                                    {
                                        inPatientList.get(i).printInfo();
                                        printedOrNot++;
                                    }

                                }

                                else
                                {
                                    if (inPatientList.get(i).getDischargeStatement()==false){
                                        inPatientList.get(i).printInfo();
                                        printedOrNot++;
                                    }
                                    else
                                    {
                                        if (StringAndCharAndInt.firstIsBiggerThanTheSecond(inPatientList.get(i).getDischargeDate(),firstDate))
                                        {
                                            if (StringAndCharAndInt.firstIsBiggerThanTheSecond(secondDate,inPatientList.get(i).getDischargeDate())==true){
                                                inPatientList.get(i).printInfo();
                                                printedOrNot++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (printedOrNot==0){
                            System.out.println("there are no patients in this period of time.");
                        }
                    }
                    if (userChoice==5){

                        System.out.println("enter the patientNumber:");
                        int patientNumber = input.nextInt();

                        for (int i = 0; i < patientList.size(); i++) {
                            if (patientNumber == patientList.get(i).getPatientNumber()) {
                                if ((patientList.get(i) instanceof InPatient)==true){
                                    InPatient tempInPatient= (InPatient) patientList.get(i);
                                    List<ExternalTreatment> tempExternalTreatmentList = tempInPatient.getExternalTreatments();
                                    List<InternalTreatment> tempInternalTreatmentList = tempInPatient.getInternalTreatments();
                                    System.out.println("internal treatment record:");
                                    for (int n=0;n<tempInternalTreatmentList.size();n++){
                                        tempInternalTreatmentList.get(n).printInfo();
                                    }
                                    System.out.println("external treatment record:");
                                    for (int y=0;y<tempExternalTreatmentList.size();y++){
                                        tempExternalTreatmentList.get(y).printInfo();
                                    }

                                }
                            }
                        }
                        break;
                    }
                    if (userChoice==6){
                        System.out.println("enter the first Date(DD/MM/YYYY):");
                        String firstDate=input.nextLine();
                        System.out.println("enter the second date(DD/MM/YYYY):");
                        String secondDate=input.nextLine();
                        System.out.println("enter the section number:\n");
                        for (int i=0;i<sectionList.size();i++){
                            System.out.println("["+(i+1)+"] "+ sectionList.get(i).getSectionName());
                        }
                        userChoice=input.nextInt();
                        int numberOfPresentPatients=0;
                        for(int i=0;i<inPatientList.size();i++){
                            List<InternalTreatment>tempInternalTreatment=inPatientList.get(i).getInternalTreatments();
                            for(int j=0;j<tempInternalTreatment.size();j++){
                                if (StringAndCharAndInt.firstIsBiggerThanTheSecond(tempInternalTreatment.get(j).getTreatmentDate(),firstDate)==true)
                                {
                                    if (StringAndCharAndInt.firstIsBiggerThanTheSecond(secondDate,tempInternalTreatment.get(j).getTreatmentDate())==true)
                                    {

                                        if ((sectionList.get(userChoice-1).getNumberOfSection()==tempInternalTreatment.get(j).getTreatmentSection())==true){
                                            numberOfPresentPatients++;
                                        }
                                    }

                                }

                                else
                                {
                                    if (inPatientList.get(i).getDischargeStatement()==false){
                                        if ((sectionList.get(userChoice-1).getNumberOfSection()==tempInternalTreatment.get(j).getTreatmentSection())==true){
                                            numberOfPresentPatients++;
                                        }
                                    }
                                    else
                                    {
                                        if (StringAndCharAndInt.firstIsBiggerThanTheSecond(inPatientList.get(i).getDischargeDate(),firstDate))
                                        {
                                            if (StringAndCharAndInt.firstIsBiggerThanTheSecond(secondDate,inPatientList.get(i).getDischargeDate())==true){
                                                if ((sectionList.get(userChoice-1).getNumberOfSection()==tempInternalTreatment.get(i).getTreatmentSection())==true){
                                                    numberOfPresentPatients++;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }

                        System.out.println("number of present patients = " + numberOfPresentPatients);
                        System.out.println("Process finished.\n");
                        break;
                    }
                    if (userChoice==-1){
                        break;
                    }


                }



            }
            if(userChoice==0)
            {
                break;
            }
        }
    }
}
# Hospital-Management-Simulation-Terminal
# Hospital Management System (Terminal-Based)

![Java](https://img.shields.io/badge/Java-17%2B-blue)
![License](https://img.shields.io/badge/License-MIT-green)
![Status](https://img.shields.io/badge/Status-Production%20Ready-brightgreen)

A comprehensive terminal-based hospital management system developed in Java, featuring patient records, treatment tracking, and staff management.

## Key Features

- **Dual Patient Management**:
  - In-patient admission/discharge system
  - Out-patient appointment tracking
- **Staff Hierarchy**:
  - Attending doctors
  - Intern doctors
  - Contracted physicians
- **Treatment System**:
  - Internal treatments (by department)
  - External treatments (clinics)
- **Advanced Date Handling**:
  - Custom date comparison algorithms
  - Treatment period validation

## Class Structure


classDiagram
    Patient <|-- InPatient
    Patient <|-- OutPatient
    TreatmentRecord <|-- InternalTreatment
    TreatmentRecord <|-- ExternalTreatment
    Doctor <|-- AttendingDoctor
    Doctor <|-- InternDoctor
    Doctor <|-- ContractedDoctor
    
    Patient "1" *-- "1" Address
    InPatient "1" *-- "*" InternalTreatment
    InPatient "1" *-- "*" ExternalTreatment
    OutPatient "1" *-- "*" ExternalTreatment
    InternalTreatment "1" *-- "1" Section
    ExternalTreatment "1" *-- "1" Clinic
Technical Highlights
Custom Date Parser: Advanced string-to-date conversion (StringAndCharAndInt.java)

Polymorphic Design: Shared interfaces for doctors/patients with specialized implementations

State Tracking:

Patient admission status

Doctor employment types

Treatment completion states

Installation & Usage
Requirements:

Java 17+ JDK

Maven (for building)

Running the System:


git clone https://github.com/Yousef007-dev/hospital-management.git
cd hospital-management
mvn package
java -jar target/hospital-management.jar
Sample Workflow

1. Add new patient (in/out-patient)
2. Record treatments
3. Discharge in-patients
4. Generate reports:
   - Patient treatment history
   - Department occupancy
   - Doctor schedules
Contributors
Yousef Kolijan

License
MIT License - See LICENSE for details.


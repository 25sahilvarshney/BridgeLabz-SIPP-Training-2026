package samplePrograms;

public class HospitalManagementSystem {
    static class Patient {
        private static String hospitalName = "Bridge Hospital";
        private static int totalPatients = 0;
        private final String patientID;
        private String name;
        private int age;
        private String ailment;

        public Patient(String name, int age, String ailment, String patientID) {
            this.name = name;
            this.age = age;
            this.ailment = ailment;
            this.patientID = patientID;
            totalPatients++;
        }

        public static int getTotalPatients() {
            return totalPatients;
        }

        public void displayDetails() {
            if (!(this instanceof Patient)) {
                System.out.println("Object is not a Patient");
                return;
            }
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("Maya", 34, "Fever", "P1001");
        Patient p2 = new Patient("Amit", 45, "Back Pain", "P1002");
        p1.displayDetails();
        p2.displayDetails();
        System.out.println("Total patients: " + Patient.getTotalPatients());
    }
}

package samplePrograms;

public class VehicleRegistrationSystem {
    static class Vehicle {
        private static double registrationFee = 1500.00;
        private final String registrationNumber;
        private String ownerName;
        private String vehicleType;

        public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
            this.ownerName = ownerName;
            this.vehicleType = vehicleType;
            this.registrationNumber = registrationNumber;
        }

        public static void updateRegistrationFee(double newFee) {
            registrationFee = newFee;
        }

        public void displayDetails() {
            if (!(this instanceof Vehicle)) {
                System.out.println("Object is not a Vehicle");
                return;
            }
            System.out.println("Owner: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration No: " + registrationNumber);
            System.out.println("Registration Fee: Rs." + String.format("%.2f", registrationFee));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Sonal", "Car", "REG1234");
        Vehicle v2 = new Vehicle("Ravi", "Motorcycle", "REG5678");
        v1.displayDetails();
        v2.displayDetails();
        Vehicle.updateRegistrationFee(1800.00);
        System.out.println("Registration fee updated to Rs.1800.00\n");
        v1.displayDetails();
        v2.displayDetails();
    }
}

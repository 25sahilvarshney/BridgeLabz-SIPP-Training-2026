package SamplePrograms;

public class VehicleRegistrationSystem {
    static class Vehicle {
        private static double registrationFee = 500.00;
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
        Vehicle v1 = new Vehicle("Rohit", "Car", "V1001");
        Vehicle v2 = new Vehicle("Leena", "Bike", "V1002");
        v1.displayDetails();
        v2.displayDetails();
        Vehicle.updateRegistrationFee(600.00);
        System.out.println("Registration fee updated to Rs.600.00\n");
        v1.displayDetails();
        v2.displayDetails();
    }
}

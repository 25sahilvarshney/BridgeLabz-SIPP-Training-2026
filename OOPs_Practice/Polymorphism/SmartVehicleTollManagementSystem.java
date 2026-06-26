class Vehicle {
    String vehicleNumber;
    String ownerName;

    Vehicle(String vehicleNumber, String ownerName) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
    }

    double calculateToll() {
        return 0;
    }

    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Owner Name: " + ownerName);
    }
}

class Car extends Vehicle {

    Car(String vehicleNumber, String ownerName) {
        super(vehicleNumber, ownerName);
    }

    @Override
    double calculateToll() {
        return 100;
    }
}

class Bus extends Vehicle {

    Bus(String vehicleNumber, String ownerName) {
        super(vehicleNumber, ownerName);
    }

    @Override
    double calculateToll() {
        return 250;
    }
}

class Truck extends Vehicle {

    Truck(String vehicleNumber, String ownerName) {
        super(vehicleNumber, ownerName);
    }

    @Override
    double calculateToll() {
        return 400;
    }
}

public class SmartVehicleTollManagementSystem {

    static double calculateTotalRevenue(Vehicle[] vehicles) {
        double totalRevenue = 0;

        for (Vehicle vehicle : vehicles) {
            totalRevenue += vehicle.calculateToll();
        }

        return totalRevenue;
    }

    static void searchVehicle(Vehicle[] vehicles, String vehicleNumber) {
        boolean found = false;

        for (Vehicle vehicle : vehicles) {
            if (vehicle.vehicleNumber.equals(vehicleNumber)) {
                System.out.println("\nVehicle Found:");
                vehicle.displayDetails();
                System.out.println("Toll Paid: Rs. " + vehicle.calculateToll());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nVehicle not found.");
        }
    }

    static void displayHighestTollVehicle(Vehicle[] vehicles) {
        Vehicle highest = vehicles[0];

        for (Vehicle vehicle : vehicles) {
            if (vehicle.calculateToll() > highest.calculateToll()) {
                highest = vehicle;
            }
        }

        System.out.println("\nVehicle Paying Highest Toll:");
        highest.displayDetails();
        System.out.println("Highest Toll: Rs. " + highest.calculateToll());
    }

    static void countVehicleTypes(Vehicle[] vehicles) {
        int carCount = 0;
        int busCount = 0;
        int truckCount = 0;

        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car) {
                carCount++;
            } else if (vehicle instanceof Bus) {
                busCount++;
            } else if (vehicle instanceof Truck) {
                truckCount++;
            }
        }

        System.out.println("\nVehicle Count by Type:");
        System.out.println("Cars   : " + carCount);
        System.out.println("Buses  : " + busCount);
        System.out.println("Trucks : " + truckCount);
    }

    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Car("UP80AB1234", "Sahil"),
                new Bus("UP32CD5678", "Rahul Travels"),
                new Truck("RJ14EF9012", "Sharma Logistics"),
                new Car("DL01GH3456", "Priya"),
                new Truck("HR26JK7890", "Verma Transport")
        };

        System.out.println("Vehicle Toll Details:\n");

        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
            System.out.println("Toll Paid: Rs. " + vehicle.calculateToll());
            System.out.println();
        }

        System.out.println("Total Revenue: Rs. "
                + calculateTotalRevenue(vehicles));

        searchVehicle(vehicles, "RJ14EF9012");

        displayHighestTollVehicle(vehicles);

        countVehicleTypes(vehicles);
    }
}
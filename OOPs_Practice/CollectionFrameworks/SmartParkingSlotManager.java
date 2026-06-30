import java.util.ArrayList;

public class SmartParkingSlotManager {

    static ArrayList<String> vehicles = new ArrayList<>();

    public static void vehicleEnter(String regNo) {
        vehicles.add(regNo);
        System.out.println(regNo + " Entered Parking.");
    }

    public static void vehicleExit(String regNo) {
        if (vehicles.remove(regNo))
            System.out.println(regNo + " Exited Parking.");
        else
            System.out.println("Vehicle Not Found.");
    }

    public static void searchVehicle(String regNo) {
        if (vehicles.contains(regNo))
            System.out.println("Vehicle is Parked.");
        else
            System.out.println("Vehicle Not Found.");
    }

    public static void displayVehicles() {
        System.out.println("\nParked Vehicles:");
        for (String v : vehicles) {
            System.out.println(v);
        }

        System.out.println("Total Occupied Slots: " + vehicles.size());
    }

    public static void main(String[] args) {

        vehicleEnter("UP80AB1234");
        vehicleEnter("DL01XY5678");
        vehicleEnter("HR26CD9999");

        searchVehicle("DL01XY5678");

        vehicleExit("UP80AB1234");

        displayVehicles();
    }
}
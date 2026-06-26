
abstract class Vehicle {

    
    private String vehicleNumber;
    private String vehicleType;

    
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }


    public abstract double calculateRentalCost(int days);


    public void displayVehicleInfo() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Vehicle Type   : " + vehicleType);
    }
}

class Car extends Vehicle {
    private double dailyRate;

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}


class Bike extends Vehicle {
    private double dailyRate;

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

class Truck extends Vehicle {
    private double dailyRate;
    private double loadingCharge;

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public double getLoadingCharge() {
        return loadingCharge;
    }

    public void setLoadingCharge(double loadingCharge) {
        this.loadingCharge = loadingCharge;
    }

    @Override
    public double calculateRentalCost(int days) {
        return (days * dailyRate) + loadingCharge;
    }
}


public class VehicleRentalSystem {

    public static void main(String[] args) {

        int rentalDays = 5;

        Car car = new Car();
        car.setVehicleNumber("UP80AB1234");
        car.setVehicleType("Car");
        car.setDailyRate(1500);

        
        Bike bike = new Bike();
        bike.setVehicleNumber("UP80CD5678");
        bike.setVehicleType("Bike");
        bike.setDailyRate(500);

        Truck truck = new Truck();
        truck.setVehicleNumber("UP80TR9999");
        truck.setVehicleType("Truck");
        truck.setDailyRate(3000);
        truck.setLoadingCharge(2000);

    
        System.out.println("===== Car Details =====");
        car.displayVehicleInfo();
        System.out.println("Rental Cost for " + rentalDays +
                " days : ₹" + car.calculateRentalCost(rentalDays));

        
        System.out.println("\n===== Bike Details =====");
        bike.displayVehicleInfo();
        System.out.println("Rental Cost for " + rentalDays +
                " days : ₹" + bike.calculateRentalCost(rentalDays));

        
        System.out.println("\n===== Truck Details =====");
        truck.displayVehicleInfo();
        System.out.println("Rental Cost for " + rentalDays +
                " days : ₹" + truck.calculateRentalCost(rentalDays));
    }
}
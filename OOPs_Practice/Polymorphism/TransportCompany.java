
class Vehicle {
    String vehicleName;

    Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public double fuelCost(double km) {
        return 0;
    }
}

class Car extends Vehicle {

    Car(String vehicleName) {
        super(vehicleName);
    }

    @Override
    public double fuelCost(double km) {
        return km * 8;
    }
}

class Bus extends Vehicle {

    Bus(String vehicleName) {
        super(vehicleName);
    }

    @Override
    public double fuelCost(double km) {
        return km * 15; // Rs. 15 per km
    }
}

class Bike extends Vehicle {

    Bike(String vehicleName) {
        super(vehicleName);
    }

    @Override
    public double fuelCost(double km) {
        return km * 3;
    }
}

class ElectricCar extends Vehicle {

    ElectricCar(String vehicleName) {
        super(vehicleName);
    }

    @Override
    public double fuelCost(double km) {
        return km * 2;
    }
}

public class TransportCompany {
    public static void main(String[] args) {

        Vehicle[] fleet = {
                new Car("Honda City"),
                new Bus("Volvo Bus"),
                new Bike("Royal Enfield"),
                new ElectricCar("Tesla Model 3")
        };

        double distance = 100;

        for (Vehicle v : fleet) {

            System.out.println("\nVehicle: " + v.vehicleName);

            System.out.println("Fuel Cost for " + distance +
                    " km = Rs. " + v.fuelCost(distance));
            if (v instanceof Car) {
                Car c = (Car) v;
                System.out.println("This is a Car.");
            } else if (v instanceof Bus) {
                Bus b = (Bus) v;
                System.out.println("This is a Bus.");
            } else if (v instanceof Bike) {
                Bike bk = (Bike) v;
                System.out.println("This is a Bike.");
            } else if (v instanceof ElectricCar) {
                ElectricCar ec = (ElectricCar) v;
                System.out.println("This is an Electric Car.");
            }
        }
    }
}
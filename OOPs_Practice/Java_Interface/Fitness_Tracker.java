interface Trackable {
    void logActivity();

    default void resetData() {
        System.out.println("Fitness data has been reset.");
    }
}

interface Reportable {
    void generateReport();
}

interface Notifiable {
    void sendAlert();
}

class FitnessDevice implements Trackable, Reportable, Notifiable {

    @Override
    public void logActivity() {
        System.out.println("Activity Logged: 5000 steps completed.");
    }

    @Override
    public void generateReport() {
        System.out.println("Fitness Report Generated.");
    }

    @Override
    public void sendAlert() {
        System.out.println("Alert Sent: Time for your workout!");
    }
}

public class Fitness_Tracker {
    public static void main(String[] args) {

        FitnessDevice device = new FitnessDevice();

        device.logActivity();
        device.generateReport();
        device.sendAlert();
        device.resetData(); 

        System.out.println("\nFitnessDevice implements multiple interfaces:");
        System.out.println("Trackable, Reportable, and Notifiable");
        System.out.println("This demonstrates multiple inheritance through interfaces.");
    }
}
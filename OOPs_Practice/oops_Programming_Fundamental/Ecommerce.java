
class Package {
    
    private final String trackingId;
    private double weight;

    public Package(String trackingId, double weight) {
        this.trackingId = trackingId;

        if (weight > 0.0) {
            this.weight = weight;
        } else {
            System.out.println("Error: Weight must be greater than 0.");
            this.weight = 1.0; 
        }
    }

    
    public String getTrackingId() {
        return trackingId;
    }

    public double getWeight() {
        return weight;
    }

    
    public void setWeight(double weight) {
        if (weight > 0.0) {
            this.weight = weight;
        } else {
            System.out.println("Validation Error: Weight must be greater than 0.");
        }
    }
}


class ExpressPackage extends Package {
    private String priorityLevel;

    public ExpressPackage(String trackingId, double weight, String priorityLevel) {
        super(trackingId, weight);
        this.priorityLevel = priorityLevel;
    }

    
    public String getPriorityLevel() {
        return priorityLevel;
    }

    
    public void printDetails() {
        System.out.println("===== Express Package Details =====");
        System.out.println("Tracking ID   : " + getTrackingId());
        System.out.println("Weight        : " + getWeight());
        System.out.println("Priority Level: " + priorityLevel);
    }
}


public class Ecommerce{
    public static void main(String[] args) {

        
        ExpressPackage pkg =
                new ExpressPackage("EXP101", 2.5, "Critical");

        pkg.printDetails();

        System.out.println("\nTrying to set invalid weight (-1.5)...");
        pkg.setWeight(-1.5);

        System.out.println("\nTrying to set invalid weight (0.0)...");
        pkg.setWeight(0.0);

        System.out.println("\nWeight after invalid updates: "
                + pkg.getWeight());

        System.out.println("\nSetting valid weight (3.8)...");
        pkg.setWeight(3.8);

        System.out.println("Updated Weight: " + pkg.getWeight());
    }
}
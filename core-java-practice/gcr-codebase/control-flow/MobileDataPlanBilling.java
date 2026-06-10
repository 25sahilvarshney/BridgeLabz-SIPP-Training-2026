import java.util.Scanner;
public class MobileDataPlanBilling{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your monthly base plan cost: ");
        double basePlan = sc.nextDouble();
        System.out.print("Enter your data limit (in GB): ");
        double dataLimit = sc.nextDouble();
        System.out.print("Enter your data used this month (in GB): ");
        double dataUsed = sc.nextDouble();
        System.out.print("Enter extra charge per GB beyond limit: ");
        double extraChargePerGB = sc.nextDouble();
        double totalBill = basePlan;
        if (dataUsed > dataLimit) {
            double extraData = dataUsed - dataLimit;
            totalBill += extraData * extraChargePerGB;
        }
        System.out.println("\n--- Billing Summary ---");
        System.out.println("Base Plan Cost: ₹" + basePlan);
        System.out.println("Data Limit: " + dataLimit + " GB");
        System.out.println("Data Used: " + dataUsed + " GB");
        if (dataUsed > dataLimit) {
            System.out.println("Extra Data: " + (dataUsed - dataLimit) + " GB");
            System.out.println("Extra Charges: ₹" + (dataUsed - dataLimit) * extraChargePerGB);
        } else {
            System.out.println("No extra charges.");
        }
        System.out.println("Total Bill: ₹" + totalBill);
    }
    
}
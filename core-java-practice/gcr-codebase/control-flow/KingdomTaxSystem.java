import java.util.*;
public class KingdomTaxSystem{
    static double getTaxRate(double income){
        if(income <= 10000){
            return 0.05;
        } else if(income <= 50000){
            return 0.15;
        } else {
            return 0.30;
        }
    }
    static String getTaxBucket(double income){
        if(income <= 10000){
            return "Low Income";
        } else if(income <= 50000){
            return "Middle Income";
        } else {
            return "High Income";
        }
    }
    static void printcitizenTax(int id , double income){
        double tax = income * getTaxRate(income);
        System.out.printf("Citizen ID: %d, Income: %.2f, Tax Rate: %.2f%%, Tax Amount: %.2f, Tax Bucket: %s%n",
        id, income, getTaxRate(income) * 100, tax, getTaxBucket(income));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of citizens: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.printf("Enter income for citizen %d: ", i);
            double income = sc.nextDouble();
            printcitizenTax(i, income);
        }
        sc.close();

    }
}
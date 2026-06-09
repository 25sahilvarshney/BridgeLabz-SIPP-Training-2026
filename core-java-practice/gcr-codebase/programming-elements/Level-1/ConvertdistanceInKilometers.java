import java.util.Scanner;
public class ConvertdistanceInKilometers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the diatance in km");
        double km = input.nextInt();
        double miles = km * 1.6;
        System.out.println("the total miles is " + miles + " for the given distance in km " + km);
        input.close();
    }
    
}

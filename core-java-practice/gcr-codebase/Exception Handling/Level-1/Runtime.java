
import java.util.Scanner;
import java.util.InputMismatchException;
public class Runtime{
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the first number:");
            int n = sc.nextInt();
            System.out.print("Enter the second number:");
            int m = sc.nextInt();
            int result = n / m;
            System.out.print("division result:" + result);

        }
        catch (ArithmeticException e){
            System.out.println("An Arithmetic Exception Occured:");
            
        }
        catch (InputMismatchException e){
            System.out.println("An InputMismatchException Occured:");
        }
    }

}

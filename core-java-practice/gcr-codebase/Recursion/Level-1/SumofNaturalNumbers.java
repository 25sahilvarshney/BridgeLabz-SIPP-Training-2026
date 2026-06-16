import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static int sum(int n){
        if(n == 0){
            return 0;
        }
        return n + sum(n - 1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        int result = sum(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + result);
    }
}
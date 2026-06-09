import java.util.Scanner;

public class ReduceAnumberToZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int num  = sc.nextInt();
        while(num > 0){
            if(num % 2 == 0){
                num = num / 2;
            } else {
                num = num - 1;
            }
        }
        System.out.println("The number has been reduced to zero.");
    }
    
}

import java.util.Scanner;
public class AddTwoNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("the first numebr is:"+a);
        int b = sc.nextInt();
        System.out.println("the second number is:"+b);
        int sum = a + b;
        System.out.println("the sum of add two numbers is:"+sum);
        sc.close();
    }
}
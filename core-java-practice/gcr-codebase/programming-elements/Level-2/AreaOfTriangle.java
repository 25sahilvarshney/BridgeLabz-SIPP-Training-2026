import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args){
        Scanner input  =new Scanner(System.in);
        System.out.print("enter the base:");
        int base = input.nextInt();
        System.out.print("enter the height:");
        int height = input.nextInt();
        double area  = 0.5 * base * height;
        System.out.printf("The area of triangle is %.2f",area);
    }
    
}

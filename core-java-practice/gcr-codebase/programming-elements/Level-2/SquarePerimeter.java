import java.util.Scanner;
public class SquarePerimeter {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        System.out.print("enter the side of a square:");
        int side = input.nextInt();
        int perimeter = 4 * side;
        System.out.printf("The length of the side  is %d whose perimeter is %d",side,perimeter);
    }
    
}

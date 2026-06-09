import java.util.Scanner;
public class BasicCalculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the first number: ");
        int a = input.nextInt();
        System.out.print("enter the second number: ");
        int b = input.nextInt();
        int sum = a + b;
        int subtract = a - b;
        int multiply = a * b;
        float divide = (float) (a / b);
        System.out.printf("The addition, subtraction, multiplication, and division value of 2 numbers %d, %d is %d, %d, %d, and %.2f respectively", a, b, sum, subtract, multiply, divide);
    }
}

import java.util.Scanner;
public class SubtractTheProduct {
    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n /= 10;
        }
        return product - sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = subtractProductAndSum(n);
        System.out.println("subtracting the sum of digits from the product of digits: " + result);
        sc.close();
    }
}
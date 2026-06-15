import java.util.Scanner;
public class MathWizard {
    static void isPrime(int n){
        if(n <=1){
            System.out.println(n + "is not prime number");
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                System.out.println(n + "is not prime number");
                return;
            }
        }
        System.out.println(n + "is prime number");
    }
    static void factorial(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact=fact*i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }
    static void fibonacci(int n){
        int a=0, b=1;
        System.out.print("Fibonacci series up to " + n + ": ");
        while(a<=n){
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println(); 
    }
    static int gcd(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    static void lcm(int a, int b){
        int lcm=(a*b)/ gcd(a,b);
        System.out.println("LCM is: " + lcm);
    }
    static void power(int base, int exponent){
        int result=1;
        for(int i=1; i<=exponent; i++){
            result=result*base;
        }
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        isPrime(a);
        factorial(a);
        fibonacci(a);
        lcm(a,b);
        power(a,b);

    }
}

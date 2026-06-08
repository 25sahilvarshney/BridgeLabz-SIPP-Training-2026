import java.util.Scanner;
public class CelsiusToFahrenheitConversion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int celsius = 30;
        float fahrenheit = (float)(celsius * 9/5) + 32;
        System.out.println("the fahrenheit value is:"+fahrenheit);
        sc.close();
    }
}
import java.util.Scanner;
public class ReverseString {
    public static String reverse(String str){
        if(str.isEmpty()){
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String str = sc.nextLine();
        String result = reverse(str);
        System.out.println("Reversed string is: " + result);
    }
}
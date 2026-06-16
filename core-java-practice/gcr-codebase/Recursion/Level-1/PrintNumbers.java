import java.util.Scanner;
public class PrintNumbers {
    public static void printnumbers(int n){
        if(n == 0){
            return ;
        }
        System.out.print(n + " ");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printnumbers(n);    
    }


}
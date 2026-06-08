import java.util.Scanner;
public class AreaOfACircle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of the circle:");
        int radius = sc.nextInt();
        float area = (float)(22/7 * radius * radius);
        System.out.println("the area of the circle is:"+area);
        sc.close();
    }
}
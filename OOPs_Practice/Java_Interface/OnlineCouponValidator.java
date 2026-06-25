import java.util.Scanner;

interface CouponValidator {

    
    boolean validateCoupon(String code);

    static boolean isLengthValid(String code) {
        return code.length() >= 5 && code.length() <= 10;
    }
}

class ShoppingCart implements CouponValidator {

    @Override
    public boolean validateCoupon(String code) {
        return CouponValidator.isLengthValid(code);
    }
}

public class OnlineCouponValidator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of coupon codes: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] coupons = new String[n];

        System.out.println("Enter coupon codes:");
        for (int i = 0; i < n; i++) {
            coupons[i] = sc.nextLine();
        }

        ShoppingCart cart = new ShoppingCart();

        System.out.println("\nCoupon Validation Results:");
        for (String coupon : coupons) {
            if (cart.validateCoupon(coupon)) {
                System.out.println(coupon + " -> Valid Coupon");
            } else {
                System.out.println(coupon + " -> Invalid Coupon");
            }
        }

        sc.close();
    }
}
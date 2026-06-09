public class DiscountAmount {
    public static void main(String[] args){
        int namedFee = 125000;
        int discount = 10;
        int Finaldiscountamount =  namedFee - discount;
        double discountamount = namedFee - ((double)(discount / 100.0) * namedFee);
        System.out.printf("The discount amount is INR " + discountamount + "and the final discounted amount is INR "+ Finaldiscountamount);
    }
    
}

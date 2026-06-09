public class CalculateProfitLoss {
    public static void main(String[] args){
        int costPrice = 129;
        int sellingPrice = 191;
        int profit = sellingPrice - costPrice;
        int loss = costPrice - sellingPrice;
        double ProfitPercentage = ((double)(profit / (double)costPrice)) *100;
        System.out.printf("The costPrice is  INR " + costPrice + " and sellingPrice is INR " + sellingPrice + "%n" +
        "The Profit is INR " + profit + " and the ProfitPercentage is " + ProfitPercentage);
    }
    
}

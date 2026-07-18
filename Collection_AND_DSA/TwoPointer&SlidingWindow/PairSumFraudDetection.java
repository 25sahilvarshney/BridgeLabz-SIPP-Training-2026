package Collection_AND_DSA.TwoPointer_SlidingWindow;

public class PairSumFraudDetection {
    public static void findPair(int[] transactions, int target) {
        int left = 0;
        int right = transactions.length - 1;

        while (left < right) {
            int sum = transactions[left] + transactions[right];

            if (sum == target) {
                System.out.println("Pair found: " +
                        transactions[left] + " and " +
                        transactions[right]);
                System.out.println("Indices: " +
                        left + ", " + right);
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("No pair found");
    }

    public static void main(String[] args) {
        int[] transactions = {5000, 8000, 12000, 18000, 25000};
        int target = 30000;

        findPair(transactions, target);
    }
}
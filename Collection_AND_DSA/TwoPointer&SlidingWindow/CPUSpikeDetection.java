package Collection_AND_DSA.TwoPointer_SlidingWindow;

public class CPUSpikeDetection {

    public static int maxWindowSum(int[] cpu, int k) {

        if (cpu.length < k) {
            return -1;
        }

        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += cpu[i];
        }

        int maxSum = windowSum;

        for (int i = k; i < cpu.length; i++) {

            windowSum = windowSum
                      - cpu[i - k]
                      + cpu[i];

            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] cpu = {20, 35, 40, 15, 50, 45, 30};
        int k = 5;

        System.out.println(
                "Maximum CPU load = "
                + maxWindowSum(cpu, k)
        );
    }
}
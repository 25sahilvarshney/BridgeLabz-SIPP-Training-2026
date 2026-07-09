import java.util.Arrays;

public class BubbleSortSports {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 96, 88, 91, 75, 89};

        int swaps = 0;
        boolean sorted;

        for (int i = 0; i < scores.length - 1; i++) {
            sorted = true;

            for (int j = 0; j < scores.length - i - 1; j++) {
                if (scores[j] > scores[j + 1]) {
                    int temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;

                    swaps++;
                    sorted = false;
                }
            }

            if (sorted) {
                System.out.println("Already Sorted (Best Case)");
                break;
            }
        }

        System.out.println("Sorted Scores: " + Arrays.toString(scores));
        System.out.println("Total Swaps: " + swaps);

        System.out.println("Top 3 Medalists:");
        for (int i = scores.length - 1; i >= scores.length - 3; i--) {
            System.out.println(scores[i]);
        }
    }
}
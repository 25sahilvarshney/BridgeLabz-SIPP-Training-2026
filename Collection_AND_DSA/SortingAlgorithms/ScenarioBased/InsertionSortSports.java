package Collection_AND_DSA.SortingAlgorithms.ScenarioBased;

import java.util.Arrays;

public class InsertionSortSports {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 96, 88, 91, 75, 89};

        int shifts = 0;

        for (int i = 1; i < scores.length; i++) {
            int key = scores[i];
            int j = i - 1;

            while (j >= 0 && scores[j] > key) {
                scores[j + 1] = scores[j];
                j--;
                shifts++;
            }

            scores[j + 1] = key;
        }

        System.out.println("Sorted Scores: " + Arrays.toString(scores));
        System.out.println("Total Shifts: " + shifts);

        System.out.println("Top 3 Medalists:");
        for (int i = scores.length - 1; i >= scores.length - 3; i--) {
            System.out.println(scores[i]);
        }
    }
}
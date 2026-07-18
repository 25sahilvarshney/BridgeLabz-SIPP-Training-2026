import java.util.Arrays;

public class SelectionSortScores {
    public static void main(String[] args) {
        int[] scores = {70, 95, 60, 88, 75};

        for (int i = 0; i < scores.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = scores[i];
            scores[i] = scores[minIndex];
            scores[minIndex] = temp;
        }

        System.out.println(Arrays.toString(scores));
    }
}
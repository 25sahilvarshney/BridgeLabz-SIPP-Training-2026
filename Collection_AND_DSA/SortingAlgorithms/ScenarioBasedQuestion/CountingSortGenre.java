import java.util.*;

public class CountingSortGenre {

    static void countingSort(int[] arr) {
        int[] count = new int[21];

        for (int num : arr)
            count[num]++;

        int index = 0;

        for (int i = 1; i <= 20; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] genres = {5, 2, 8, 2, 20, 1, 5, 10};

        countingSort(genres);

        System.out.println(Arrays.toString(genres));
    }
}
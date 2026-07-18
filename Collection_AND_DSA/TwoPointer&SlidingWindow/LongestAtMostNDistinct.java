import java.util.*;

public class LongestAtMostNDistinct {

    public static int longestSubarray(int[] apiKeys, int N) {

        Map<Integer, Integer> freq = new HashMap<>();

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < apiKeys.length; right++) {

            freq.put(apiKeys[right],
                    freq.getOrDefault(apiKeys[right], 0) + 1);

            while (freq.size() > N) {

                int key = apiKeys[left];

                freq.put(key, freq.get(key) - 1);

                if (freq.get(key) == 0) {
                    freq.remove(key);
                }

                left++;
            }

            maxLen = Math.max(maxLen,
                    right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {

        int[] apiKeys = {1, 2, 1, 3, 4, 2, 3};
        int N = 2;

        System.out.println(
                longestSubarray(apiKeys, N)
        );
    }
}

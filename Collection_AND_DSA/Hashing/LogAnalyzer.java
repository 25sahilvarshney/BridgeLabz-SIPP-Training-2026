package Collection_AND_DSA.Hashing;

import java.util.HashMap;
import java.util.Map;

public class LogAnalyzer {
    public int mostFrequentErrorCode(int[] codes) {
        if (codes == null || codes.length == 0) {
            throw new IllegalArgumentException("Input array cannot be null or empty");
        }

        Map<Integer, Integer> freq = new HashMap<>();
        int bestCode = codes[0];
        int bestCount = 0;

        for (int code : codes) {
            int count = freq.merge(code, 1, Integer::sum);
            if (count > bestCount) {
                bestCount = count;
                bestCode = code;
            }
        }
        return bestCode;
    }
}
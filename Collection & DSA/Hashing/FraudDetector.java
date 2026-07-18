import java.util.HashMap;
import java.util.Map;

public class FraudDetector {
    public int[] findFraudPair(int[] amounts, int target) {
        if (amounts == null || amounts.length < 2) {
            return new int[]{-1, -1};
        }

        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < amounts.length; i++) {
            int complement = target - amounts[i];
            if (seen.containsKey(complement)) {
                return new int[]{seen.get(complement), i};
            }
            seen.put(amounts[i], i);
        }
        return new int[]{-1, -1};
    }
}
package Collection_AND_DSA.Hashing;

import java.util.HashMap;
import java.util.Map;

public class RevenueAnalyzer {
    public int subarraySumEqualsK(int[] revenueChanges, int k) {
        if (revenueChanges == null || revenueChanges.length == 0) {
            return 0;
        }

        Map<Integer, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0, 1);
        
        int runningSum = 0;
        int answer = 0;

        for (int change : revenueChanges) {
            runningSum += change;
            answer += prefixCount.getOrDefault(runningSum - k, 0);
            prefixCount.merge(runningSum, 1, Integer::sum);
        }
        return answer;
    }
}
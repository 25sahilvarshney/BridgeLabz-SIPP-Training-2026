package Collection_AND_DSA.Recursion_Backtracking;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShiftScheduler {

    public List<List<String>> generateSchedules(String[] engineers) {
        Arrays.sort(engineers); 
        List<List<String>> result = new ArrayList<>();
        boolean[] used = new boolean[engineers.length];
        backtrack(engineers, used, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String[] engineers, boolean[] used, List<String> current, List<List<String>> result) {
        if (current.size() == engineers.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < engineers.length; i++) {
            if (used[i]) continue;

        
            if (i > 0 && engineers[i].equals(engineers[i - 1]) && !used[i - 1]) {
                continue;
            }

            used[i] = true;
            current.add(engineers[i]);

            backtrack(engineers, used, current, result);

            current.remove(current.size() - 1); 
            used[i] = false;
        }
    }
}
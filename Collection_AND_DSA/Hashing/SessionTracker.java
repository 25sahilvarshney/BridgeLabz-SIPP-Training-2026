import java.util.HashSet;
import java.util.Set;

public class SessionTracker {
    public boolean hasDuplicateToken(String[] tokens) {
        if (tokens == null || tokens.length == 0) {
            return false;
        }
        
        Set<String> seen = new HashSet<>();
        for (String token : tokens) {
            if (!seen.add(token)) {
                return true;
            }
        }
        return false;
    }
}
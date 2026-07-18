import java.util.ArrayDeque;
import java.util.Deque;

class NetworkMonitor {
    public int[] maxThroughputWindow(int[] readings, int k) {
        if (readings == null || readings.length == 0 || k <= 0) {
            return new int[0];
        }

        int n = readings.length;
        int[] result = new int[n - k + 1];
        
        
        Deque<Integer> deque = new ArrayDeque<>(); 

        for (int i = 0; i < n; i++) {

            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

    
            while (!deque.isEmpty() && readings[deque.peekLast()] <= readings[i]) {
                deque.pollLast();
            }

            
            deque.offerLast(i);

            
            if (i >= k - 1) {
                result[i - k + 1] = readings[deque.peekFirst()];
            }
        }
        
        return result;
    }
}
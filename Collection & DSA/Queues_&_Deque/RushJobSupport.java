import java.util.ArrayDeque;
import java.util.Deque;

class PrintServer {
    private Deque<Integer> printQueue = new ArrayDeque<>();

    public void submitJob(int jobId) {
        printQueue.addLast(jobId); 
    }
    public void submitUrgentJob(int jobId) {
        printQueue.addFirst(jobId); 
    }

    public int printNextJob() {
        if (printQueue.isEmpty()) {
            throw new RuntimeException("No print jobs waiting");
        }
        return printQueue.removeFirst(); 
    }
}
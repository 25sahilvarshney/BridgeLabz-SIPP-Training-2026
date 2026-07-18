package Collection_AND_DSA.Queues_Deque;

import java.util.PriorityQueue;

class Patient {
    int priority; 
    String name;

    public Patient(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }
}

class TriageSystem {

    private PriorityQueue<Patient> triageQueue = 
        new PriorityQueue<>((patientA, patientB) -> patientA.priority - patientB.priority);

    public void admitPatient(Patient p) {
        triageQueue.offer(p);
    }

    public Patient callNextPatient() {
    
        return triageQueue.poll(); 
    }
}
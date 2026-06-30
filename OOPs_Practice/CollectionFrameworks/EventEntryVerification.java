import java.util.HashSet;

public class EventEntryVerification {

    static HashSet<String> participants = new HashSet<>();

    public static void registerParticipant(String email) {

        if (participants.add(email))
            System.out.println("Registration Successful: " + email);
        else
            System.out.println("Duplicate Registration Rejected: " + email);
    }

    public static void displayParticipants() {

        System.out.println("\nRegistered Participants:");

        for (String email : participants) {
            System.out.println(email);
        }

        System.out.println("Total Attendees: " + participants.size());
    }

    public static void main(String[] args) {

        registerParticipant("sahil@gmail.com");
        registerParticipant("aman@gmail.com");
        registerParticipant("riya@gmail.com");
        registerParticipant("aryan@gmail.com");

        displayParticipants();
    }
}
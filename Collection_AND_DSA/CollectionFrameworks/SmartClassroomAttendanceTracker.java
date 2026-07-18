import java.util.ArrayList;
import java.util.HashMap;

public class SmartClassroomAttendanceTracker {

    static HashMap<String, ArrayList<String>> attendance =
            new HashMap<>();

    public static void markAttendance(String subject,
                                      String student) {

        attendance.putIfAbsent(subject,
                new ArrayList<>());

        ArrayList<String> students =
                attendance.get(subject);

        if (!students.contains(student)) {
            students.add(student);
            System.out.println(student +
                    " marked present in " + subject);
        } else {
            System.out.println("Duplicate attendance not allowed for "
                    + student + " in " + subject);
        }
    }

    public static void displayAttendance() {

        System.out.println("\nAttendance Record:");

        for (String subject : attendance.keySet()) {

            ArrayList<String> students =
                    attendance.get(subject);

            System.out.println("\nSubject: " + subject);

            for (String student : students) {
                System.out.println(student);
            }

            System.out.println("Total Students: "
                    + students.size());
        }
    }

    public static void main(String[] args) {

        markAttendance("Java", "Sahil");
        markAttendance("Java", "Aman");
        markAttendance("Java", "Sahil");

        markAttendance("DBMS", "Riya");
        markAttendance("DBMS", "Aman");

        displayAttendance();
    }
}
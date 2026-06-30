

public class UniversityStudentManagement {
    static class Student {
        private static String universityName = "Bridge University";
        private static int totalStudents = 0;
        private final int rollNumber;
        private String name;
        private String grade;

        public Student(String name, int rollNumber, String grade) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.grade = grade;
            totalStudents++;
        }

        public static void displayTotalStudents() {
            System.out.println("Total students: " + totalStudents);
        }

        public void displayDetails() {
            if (!(this instanceof Student)) {
                System.out.println("Object is not a Student");
                return;
            }
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + rollNumber);
            System.out.println("Grade: " + grade);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Riya", 301, "A");
        Student s2 = new Student("Karan", 302, "B+");
        s1.displayDetails();
        s2.displayDetails();
        Student.displayTotalStudents();
    }
}

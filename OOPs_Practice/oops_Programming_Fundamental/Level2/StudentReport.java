package Level2;

public class StudentReport {
    static class Student {
        private String name;
        private int rollNumber;
        private int marks; // 0-100

        public Student(String name, int rollNumber, int marks) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.marks = marks;
        }

        public String calculateGrade() {
            if (marks >= 90) return "A+";
            if (marks >= 80) return "A";
            if (marks >= 70) return "B";
            if (marks >= 60) return "C";
            if (marks >= 50) return "D";
            return "F";
        }

        public void display() {
            System.out.println("Student Report");
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + rollNumber);
            System.out.println("Marks: " + marks);
            System.out.println("Grade: " + calculateGrade());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Asha", 1, 92);
        Student s2 = new Student("Vikram", 2, 76);
        s1.display();
        s2.display();
    }
}

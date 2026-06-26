
class Person {
    protected String name;
    protected int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    @Override
    public String toString() {
        return "Person [Name = " + name + ", Age = " + age + "]";
    }
}

class Student extends Person {
    private final String studentId; 
    protected double gpa;

    
    public Student(String name, int age, String studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Student [Student ID = " + studentId +
                ", GPA = " + gpa + "]";
    }
}

class GradStudent extends Student {
    private String thesis;

    
    public GradStudent(String name, int age, String studentId,
                       double gpa, String thesis) {
        super(name, age, studentId, gpa);
        this.thesis = thesis;
    }

    
    @Override
    public String toString() {
        return super.toString() +
                ", GradStudent [Thesis = " + thesis + "]";
    }
}

public class UniversitySystem {
    public static void main(String[] args) {

        GradStudent gs = new GradStudent(
                "Sahil Varshney",
                22,
                "GLA101",
                8.7,
                "Artificial Intelligence in Education"
        );

        System.out.println("GradStudent Object:");
        System.out.println(gs);

        
        Student s = gs;  
        Person p = gs;    

        System.out.println("\nIS-A Relationship Demonstration:");
        System.out.println("GradStudent IS-A Student : " + (s instanceof Student));
        System.out.println("GradStudent IS-A Person  : " + (p instanceof Person));
        System.out.println("Student IS-A Person      : " + (s instanceof Person));
    }
}
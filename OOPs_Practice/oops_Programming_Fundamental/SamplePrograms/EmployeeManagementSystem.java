package SamplePrograms;

public class EmployeeManagementSystem {
    static class Employee {
        private static String companyName = "BridgeTech";
        private static int totalEmployees = 0;
        private final int id;
        private String name;
        private String designation;

        public Employee(String name, int id, String designation) {
            this.name = name;
            this.id = id;
            this.designation = designation;
            totalEmployees++;
        }

        public static void displayTotalEmployees() {
            System.out.println("Total employees: " + totalEmployees);
        }

        public void displayDetails() {
            if (!(this instanceof Employee)) {
                System.out.println("Object is not an Employee");
                return;
            }
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Priya", 201, "Developer");
        Employee e2 = new Employee("Sam", 202, "Tester");
        e1.displayDetails();
        e2.displayDetails();
        Employee.displayTotalEmployees();
    }
}

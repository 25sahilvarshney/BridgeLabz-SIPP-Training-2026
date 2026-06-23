

class EmployeeDetails {
    private String name;
    private int id;
    private double salary;

    public EmployeeDetails(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: Rs." + String.format("%.2f", salary));
        System.out.println();
    }

    public static void main(String[] args) {
        EmployeeDetails emp = new EmployeeDetails("Rahul", 101, 55000.00);
        emp.displayDetails();
    }
}

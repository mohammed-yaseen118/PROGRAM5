public class Employee {
    private String name;
    private int id;
    private double salary;
    private String department;
    public Employee(String name, int id, double salary, String department) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
    }
    public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
    public static void main(String[] args) {
        Employee emp = new Employee("darshan ", 071, 50000.0, "Engineering");
        emp.display();
    }
}

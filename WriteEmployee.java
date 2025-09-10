import java.util.Scanner;
class Employee{
    private int empId;
    private String empName;
    private double salary;

    public Employee(int empId, String empName, double salary){
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }
    public int getEmpId() {
        return empId;
    }
    public String getEmpName() {
        return empName;
    }
    public double getSalary() {
        return salary;
    }
}

public class WriteEmployee {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID:");
        int id = sc.nextInt();
        System.out.println("Enter Employee Name:");
        String name = sc.next();
        System.out.println("Enter Employee Salary:");
        double sal = sc.nextDouble();

        Employee emp = new Employee(id, name, sal);
        System.out.println("Employee Details:");
        System.out.println("ID: " + emp.getEmpId());
        System.out.println("Name: " + emp.getEmpName());
        System.out.println("Salary: " + emp.getSalary());
    }
}

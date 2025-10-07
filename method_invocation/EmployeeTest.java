class Employee {
    String name;
    double basicPay;
    double da; // dearness allowance

    public void calculateDA() {
        da = 0.1 * basicPay; // 10% of basicPay
    }

    public void calculateSalary() {
        calculateDA();  // call another method
        double total = basicPay + da;
        System.out.println("Total Salary of " + name + ": " + total);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Bob";
        emp.basicPay = 50000;
        emp.calculateSalary();  // calls calculateDA internally
    }
}

/**
 * A driver class to test the functionality of Employee and Manager classes.
 * This class corresponds to Problem 1 of the assignment.
 *
 * @author Natthawat Charoensuk
 * @version 1.0, 23/01/2026
 * @Student_ID 683040410-1
 * @Section 2
 */
package charoensuk.natthawat.lab6;

public class EmployeeManagerTest {
    public static void main(String[] args) {
        System.out.println("=== Testing Employee ===");
        Employee emp = new Employee("E001", "Alice", 25000.0);
        System.out.println("Details: " + emp.toString());
        System.out.println("Payment: " + emp.calculateMonthlyPayment());

        System.out.println("\n=== Testing Manager ===");
        Manager mgr = new Manager("M001", "Bob", 50000.0, 15000.0);
        System.out.println("Details: " + mgr.toString());
        System.out.println("Payment: " + mgr.calculateMonthlyPayment());

        // Test Setter
        mgr.setBonus(20000.0);
        System.out.println("New Payment (after bonus increase): " + mgr.calculateMonthlyPayment());
    }

}

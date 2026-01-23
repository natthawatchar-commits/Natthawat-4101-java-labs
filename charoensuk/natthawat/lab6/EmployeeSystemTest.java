/**
 * A driver class to test the Employee Management System.
 * This class demonstrates Polymorphism by managing a mixed list of
 * Employees, Managers, and SalesPersons.
 *
 * @author Natthawat Charoensuk
 * @version 1.0, 23/01/2026
 * @Student_ID 683040410-1
 * @Section 2
 */
package charoensuk.natthawat.lab6;

public class EmployeeSystemTest {

    /**
     * The main method to execute the system test.
     * It creates various employee types, adds them to the system,
     * and generates reports.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        System.out.println("=== Testing Employee System ===");
        EmployeeSystem system = new EmployeeSystem();

        // 1. Create different types of employees
        Employee emp = new Employee("E001", "Alice", 20000.0);
        Manager mgr = new Manager("M001", "Bob", 50000.0, 10000.0);
        SalesPerson sp = new SalesPerson("S001", "Charlie", 15000.0, 0.05);

        // 2. Specific record sale for SalesPerson
        // We must record sales before adding to the generic list if we want to reflect
        // it immediately,
        // or cast it back later. Here we do it before.
        sp.recordSales(50000.0);

        // 3. Add them all to the system (Polymorphism)
        // Adding subclasses (Manager, SalesPerson) to a list of the superclass
        // (Employee)
        system.addEmployee(emp);
        system.addEmployee(mgr);
        system.addEmployee(sp);

        // 4. Generate Reports
        system.displayAllStaff();
        system.calculateAllPayments();
    }
}

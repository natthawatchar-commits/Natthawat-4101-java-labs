/**
 * Manages a collection of employees in the company.
 * This class demonstrates polymorphism by storing different types of
 * employees in a single ArrayList and processing them uniformly.
 *
 * @author Natthawat Charoensuk
 * @version 1.0, 23/01/2026
 * @Student_ID 683040410-1
 * @Section 2
 */
package charoensuk.natthawat.lab6;

import java.util.ArrayList;

public class EmployeeSystem {

    /** A list to store all employees (including Managers and SalesPersons). */
    private ArrayList<Employee> employees;

    /**
     * Constructs a new EmployeeSystem with an empty list of employees.
     */
    public EmployeeSystem() {
        this.employees = new ArrayList<>();
    }

    /**
     * Adds an employee to the system.
     * Due to polymorphism, this method accepts Employee objects as well as
     * any of its subclasses (Manager, SalesPerson).
     *
     * @param e The employee object to add.
     */
    public void addEmployee(Employee e) {
        employees.add(e);
    }

    /**
     * Displays the details of all staff members in the system.
     * Iterates through the list and calls the toString() method of each object.
     */
    public void displayAllStaff() {
        System.out.println("=== All Staff Details ===");
        for (Employee e : employees) {
            // Polymorphism: Calls the specific toString() of the actual object type
            System.out.println(e.toString());
        }
    }

    /**
     * Calculates and displays the monthly payment for all employees.
     * Iterates through the list and calls calculateMonthlyPayment() for each
     * person.
     */
    public void calculateAllPayments() {
        System.out.println("\n=== Payroll Report ===");
        for (Employee e : employees) {
            // Polymorphism: Calls the specific calculation logic for each type
            double payment = e.calculateMonthlyPayment();

            // Requires getId() and getName() in Employee class
            System.out.printf("ID: %s, Name: %s, Payment: %.2f%n",
                    e.getId(), e.getName(), payment);
        }
    }
}
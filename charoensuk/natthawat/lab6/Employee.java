/**
 * Represents a generic Employee in the system.
 * This class serves as the base class for other specific types of employees
 * such as Manager and SalesPerson.
 *
 * @author Natthawat Charoensuk
 * @version 1.0, 23/01/2026
 * @Student_ID 683040410-1
 * @Section 2
 */

package charoensuk.natthawat.lab6;

/**
 * Constructs a new Employee with the specified details.
 *
 * @param id         The unique ID of the employee (e.g., "E001").
 * @param name       The full name of the employee.
 * @param baseSalary The fixed monthly salary amount.
 */
public class Employee {
    protected String id;
    protected String name;
    protected double baseSalary;

    public Employee(String id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    /**
     * Gets the employee's ID.
     *
     * @return The unique identifier of the employee.
     */
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the employee's name.
     *
     * @return The full name of the employee.
     */
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the base salary.
     *
     * @return The fixed monthly base salary.
     */
    public double getBaseSalary() {
        return this.baseSalary;
    }

    public void setBaseSalary(double salary) {
        this.baseSalary = salary;
    }

    /**
     * Calculates the total monthly payment for the employee.
     * For a standard employee, this is simply the base salary.
     * This method is intended to be overridden by subclasses.
     *
     * @return The total monthly payment amount.
     */
    public double calculateMonthlyPayment() {
        return baseSalary;
    }

    /**
     * Returns a string representation of the Employee object.
     * Includes the ID, name, and salary formatted to 1 decimal place.
     *
     * @return A formatted string containing employee details.
     */
    @Override
    public String toString() {
        return String.format("Employee [id=%s, name=%s, salary=%.1f]", id, name, baseSalary);
    }
}

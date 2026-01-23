/**
 * Represents a Manager, which is a specialized type of Employee.
 * A manager has a base salary plus an additional bonus.
 *
 * @author Natthawat Charoensuk
 * @version 1.0, 23/01/2026
 * @Student_ID 683040410-1
 * @Section 2
 */
package charoensuk.natthawat.lab6;

public class Manager extends Employee {

    /** The additional bonus amount for the manager. */
    private double bonus;

    /**
     * Constructs a new Manager with the specified details.
     *
     * @param id         The unique ID of the manager.
     * @param name       The full name of the manager.
     * @param baseSalary The fixed monthly base salary.
     * @param bonus      The additional bonus amount.
     */
    public Manager(String id, String name, double baseSalary, double bonus) {
        // Pass base attributes to the superclass (Employee) constructor
        super(id, name, baseSalary);
        this.bonus = bonus;
    }

    /**
     * Gets the current bonus amount.
     *
     * @return The bonus amount.
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * Sets a new bonus amount.
     *
     * @param bonus The new bonus amount to set.
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    /**
     * Calculates the total monthly payment for the manager.
     * The payment is the sum of the base salary and the bonus.
     *
     * @return The total monthly payment (base salary + bonus).
     */
    @Override
    public double calculateMonthlyPayment() {
        return baseSalary + bonus;
    }

    /**
     * Returns a string representation of the Manager object.
     * Appends the bonus information to the standard Employee details.
     *
     * @return A formatted string containing manager details.
     */
    @Override
    public String toString() {
        return super.toString() + " Manager [bonus=" + bonus + "]";
    }
}

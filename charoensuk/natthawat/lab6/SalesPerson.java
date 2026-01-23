/**
 * Represents a SalesPerson, which is a specialized type of Employee.
 * A SalesPerson earns a base salary plus a commission calculated from their total sales.
 *
 * @author Natthawat Charoensuk
 * @version 1.0, 23/01/2026
 * @Student_ID 683040410-1
 * @Section 2
 */
package charoensuk.natthawat.lab6;

public class SalesPerson extends Employee {

    /** The total accumulated sales amount for the salesperson. */
    private double totalSales;

    /** The commission rate (e.g., 0.10 for 10%) applied to total sales. */
    private double commissionRate;

    /**
     * Constructs a new SalesPerson with the specified details.
     * The total sales are initialized to 0.0 by default.
     *
     * @param id         The unique ID of the salesperson.
     * @param name       The full name of the salesperson.
     * @param baseSalary The fixed monthly base salary.
     * @param rate       The commission rate (as a decimal, e.g., 0.05).
     */
    public SalesPerson(String id, String name, double baseSalary, double rate) {
        // Call the superclass (Employee) constructor
        super(id, name, baseSalary);
        this.commissionRate = rate;
        this.totalSales = 0.0; // Initialized to 0.0 by default
    }

    /**
     * Gets the total accumulated sales.
     *
     * @return The total sales amount.
     */
    public double getTotalSales() {
        return totalSales;
    }

    /**
     * Sets the total sales amount manually.
     *
     * @param totalSales The new total sales amount to set.
     */
    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    /**
     * Gets the current commission rate.
     *
     * @return The commission rate.
     */
    public double getCommissionRate() {
        return commissionRate;
    }

    /**
     * Sets a new commission rate.
     *
     * @param commissionRate The new commission rate to set.
     */
    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    /**
     * Records a new sale transaction.
     * Adds the specified amount to the salesperson's total accumulated sales.
     *
     * @param amount The amount of the sale to add.
     */
    public void recordSales(double amount) {
        this.totalSales += amount;
    }

    /**
     * Calculates the total monthly payment for the salesperson.
     * Formula: Base Salary + (Total Sales * Commission Rate).
     *
     * @return The total monthly payment.
     */
    @Override
    public double calculateMonthlyPayment() {
        return baseSalary + (totalSales * commissionRate);
    }

    /**
     * Returns a string representation of the SalesPerson object.
     * Appends sales and commission rate details to the standard Employee
     * information.
     *
     * @return A formatted string containing salesperson details.
     */
    @Override
    public String toString() {
        return super.toString() + " SalesPerson [sales=" + totalSales + ", rate=" + commissionRate + "]";
    }
}

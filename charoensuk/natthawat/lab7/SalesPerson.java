/**
 * Represents a SalesPerson, which is a specialized type of Employee.
 * A SalesPerson earns a base salary plus a commission calculated from their total sales.
 *
 * @author Natthawat Charoensuk
 * @version 1.0, 06/02/2026
 * @Student_ID 683040410-1
 * @Section 2
 */
package charoensuk.natthawat.lab7;

public class SalesPerson extends Employee implements Payable {
    private double totalSales = 0;
    private double commissionRate;

    public SalesPerson(String id, String name, double baseSalary, double commissionRate) {
        super(id, name, baseSalary);
        this.commissionRate = commissionRate;
    }

    public void recordSales(double amount) {
        if (amount > 0) { // Validates positive input
            this.totalSales += amount;
        }

    }

    @Override
    public double calculateYearEndBonus() {
        return totalSales * 0.01; // 1% of annual sales
    }

    @Override
    public double calculateMonthlyPayment() {
        return baseSalary + (totalSales * commissionRate); // Base salary plus commission
    }

    @Override
    public String getRole() {
        return "Sales Person";
    }
}
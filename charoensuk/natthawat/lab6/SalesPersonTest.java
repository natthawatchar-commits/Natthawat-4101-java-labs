/**
 * A driver class to test the functionality of the SalesPerson class.
 * This class verifies the inheritance, sales recording, and commission calculation logic.
 * corresponds to Problem 2 of the assignment.
 *
 * @author Natthawat Charoensuk
 * @version 1.0, 23/01/2026
 * @Student_ID 683040410-1
 * @Section 2
 */
package charoensuk.natthawat.lab6;

public class SalesPersonTest {

    /**
     * The main method to execute the SalesPerson test.
     * It simulates the workflow of a salesperson: creating the profile,
     * recording sales, and calculating the final payment including commission.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        System.out.println("\n=== Testing SalesPerson ===");

        // Create a SalesPerson object
        SalesPerson sp = new SalesPerson("S001", "Charlie", 15000.0, 0.05);

        // Record sales transactions (accumulating total sales)
        sp.recordSales(50000.0);
        sp.recordSales(25000.0);

        // Display details (tests the overridden toString method)
        System.out.println("Details: " + sp.toString());

        // Calculate monthly payment (tests the overridden calculateMonthlyPayment
        // method)
        System.out.println("Payment: " + sp.calculateMonthlyPayment());

        // Test Setter: Change commission rate and recalculate
        sp.setCommissionRate(0.10);
        System.out.println("New Payment (after rate increase): " + sp.calculateMonthlyPayment());
    }
}
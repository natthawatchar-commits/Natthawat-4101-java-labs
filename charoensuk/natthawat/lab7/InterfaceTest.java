package charoensuk.natthawat.lab7;

public class InterfaceTest {
    public static void main(String[] args) {
       System.out.println("=== Testing Interfaces ===");
       // Test Trainable with Intern
       Intern intern = new Intern("I001", "Eve", 18000.0, 6, "KKU");
       intern.attendTraining("Java Programming");
       intern.attendTraining("Database Design");
       System.out.println("Total training hours: " + intern.getTrainingHours());
       // Test Evaluable and Payable on Manager
       Manager mgr = new Manager("M001", "Frank", 60000.0, 15000.0);
       System.out.println("\nBefore evaluation: " + mgr.getPerformanceRating());
       mgr.performEvaluation();
       System.out.println("After evaluation: " + mgr.getPerformanceRating());
       System.out.printf("Year-end bonus: %.2f%n", mgr.calculateYearEndBonus());
       // Test Payable on SalesPerson
       SalesPerson sp = new SalesPerson("S001", "Grace", 20000.0, 0.08);
       sp.recordSales(500000.0);
       System.out.printf("\nSalesPerson year-end bonus: %.2f%n", sp.calculateYearEndBonus());
       // Demonstrate interface as type
       System.out.println("\n--- Using Interface as Type ---");
       Payable[] bonusReceivers = { mgr, sp };
       for (Payable p : bonusReceivers) {
           System.out.printf("Bonus: %.2f%n", p.calculateYearEndBonus());
       }
   }
}

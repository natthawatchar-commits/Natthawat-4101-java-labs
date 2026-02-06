package charoensuk.natthawat.lab7;

import java.util.ArrayList;
import java.util.Collections;

public class ContractorComparatorTest {
    public static void main(String[] args) {
       System.out.println("=== Testing Contractor Comparators ===");


       // Create contractors
       ArrayList<Contractor> contractors = new ArrayList<>();
       contractors.add(new Contractor("C001", "Alice", 6, 450.0));
       contractors.add(new Contractor("C002", "Bob", 12, 500.0));
       contractors.add(new Contractor("C003", "Charlie", 6, 400.0));
       contractors.add(new Contractor("C004", "Diana", 12, 450.0));
       contractors.add(new Contractor("C005", "Eve", 12, 450.0));


       // Original order
       System.out.println("\n--- Original Order ---");
       printContractors(contractors);
       // Sort by hourly rate (ascending)
       System.out.println("\n--- Sorted by Hourly Rate (Ascending) ---");
       Collections.sort(contractors, new ContractorHourlyRateComparator());
       printContractors(contractors);
       // Sort by duration (descending)
       System.out.println("\n--- Sorted by Duration (Descending) ---");
       Collections.sort(contractors, new ContractorDurationComparator());
       printContractors(contractors);
       // Sort by multiple attributes
       System.out.println("\n--- Sorted by Duration (desc), Rate (asc), Name (asc) ---");
       Collections.sort(contractors, new ContractorComparator());
       printContractors(contractors);
   }


   public static void printContractors(ArrayList<Contractor> list) {
       for (Contractor c : list) {
           System.out.printf("%s: Duration=%d months, Rate=%.2f/hr%n",
                   c.getName(), c.getContractDuration(), c.getHourlyRate());
       }
   }
}

/**
 * Custom comparator to sort employees by payment (desc) and name (asc).
 * 
 * @author Natthawat Charoensuk
 * @version 1.0, 20/03/2026
 * @Student_ID 683040410-1
 * @Section 2   
 */
package charoensuk.natthawat.lab12;

import charoensuk.natthawat.lab7.Employee;
import java.util.Comparator;

public class PaymentComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        double payment1 = e1.calculateMonthlyPayment();
        double payment2 = e2.calculateMonthlyPayment();

        // Sort by payment descending
        if (payment1 != payment2) {
            return Double.compare(payment2, payment1);
        }

        // Sort by name ascending if payments are equal
        return e1.getName().compareTo(e2.getName());
    }
}
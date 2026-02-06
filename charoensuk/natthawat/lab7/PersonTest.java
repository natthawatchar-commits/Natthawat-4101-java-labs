package charoensuk.natthawat.lab7;

public class PersonTest {
    public static void main(String[] args) {
       System.out.println("=== Testing Person Hierarchy ===");
       // This line would cause an error - uncomment to verify:
       // Person p = new Person("P001", "Test");
       Employee emp = new Employee("E001", "Alice", 25000.0);
       Intern intern = new Intern("I001", "Diana", 20000.0, 3, "KKU");


       // Store in Person array (Polymorphism)
       Person[] people = { emp, intern };
       System.out.println("\n--- All People ---");
       for (Person person : people) {
           System.out.println(person);
           System.out.println("Role: " + person.getRole());
           System.out.println();
       }


       // Demonstrate that Employee array also works
       System.out.println("--- Payment Calculation (Employee array) ---");
       Employee[] employees = { emp, intern };
       for (Employee e : employees) {
           System.out.printf("%s (%s): %.2f%n",
                   e.getName(), e.getRole(), e.calculateMonthlyPayment());
       }
   }
}

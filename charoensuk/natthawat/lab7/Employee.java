package charoensuk.natthawat.lab7;

/**
 * Class representing an Employee, extending Person.
 */
public class Employee extends Person {
    protected double baseSalary;

    public Employee(String id, String name, double baseSalary) {
        super(id, name);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return this.baseSalary;
    }

    public void setBaseSalary(double salary) {
        this.baseSalary = salary;
    }

    /**
     * Calculates monthly payment. For regular employees, it is just the base salary.
     */
    public double calculateMonthlyPayment() {
        return baseSalary;
    }

    @Override
    public String toString() {
        return "Employee [" + super.toString() + ", salary=" + baseSalary + "]";
    }

    @Override
    public String getRole() {
        // Appends salary info to Person's toString
        return "Employee";
    }

}

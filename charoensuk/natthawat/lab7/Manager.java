package charoensuk.natthawat.lab7;

public class Manager extends Employee implements Evaluable, Payable {
    private double bonus;
    private String performanceRating = "Pending";

    public Manager(String id, String name, double baseSalary, double bonus) {
        super(id, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public void performEvaluation() {
        System.out.println("Performing evaluation for manager " + name);
        this.performanceRating = "Excellent"; // Sets rating to Excellent
    }

    @Override
    public String getPerformanceRating() {
        return performanceRating;
    }

    @Override
    public double calculateYearEndBonus() {
        return bonus;
    }

    @Override
    public double calculateMonthlyPayment() {
        return baseSalary + bonus; // Base salary plus bonus
    }

    @Override
    public String getRole() {
        return "Manager";
    }
}
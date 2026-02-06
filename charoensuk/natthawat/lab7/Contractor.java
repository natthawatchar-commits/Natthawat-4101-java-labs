package charoensuk.natthawat.lab7;

public class Contractor extends Employee {
    private int contractDuration;
    private double hourlyRate;
    private int hoursWorked = 0;

    public Contractor(String id, String name, int duration, double rate) {
        super(id, name, 0.0); // Contractor base salary is 0
        this.contractDuration = duration;
        this.hourlyRate = rate;
    }

    public void logHours(int hours) { this.hoursWorked += hours; }
    public double getHourlyRate() { return hourlyRate; }
    public int getContractDuration() { return contractDuration; }

    @Override
    public String getRole() { return "Contractor"; }

    @Override
    public double calculateMonthlyPayment() {
        return hoursWorked * hourlyRate; // Payment based on hours worked
    }
}
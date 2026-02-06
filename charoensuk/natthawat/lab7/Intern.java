package charoensuk.natthawat.lab7;

public class Intern extends Employee implements Trainable {
    private int internshipDuration;
    private String university;
    private int trainingHours = 0;

    public Intern(String id, String name, double baseSalary, int duration, String university) {
        super(id, name, baseSalary);
        this.internshipDuration = duration;
        this.university = university;
    }

    @Override
    public void attendTraining(String courseName) {
        System.out.println(name + " is attending " + courseName + " training");
        this.trainingHours += 8; // Adds 8 hours per session
    }

    @Override
    public int getTrainingHours() {
        return trainingHours;
    }

    @Override
    public String getRole() { return "Intern"; }

    @Override
    public double calculateMonthlyPayment() {
        return baseSalary * 0.5; // Interns receive 50% of base salary
    }

    @Override
    public String toString() {
        return "Intern [" + super.toString() + ", duration=" + internshipDuration + " months, university=" + university + "]";
    }
}
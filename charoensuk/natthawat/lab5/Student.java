/**
 * Student represents a student with an ID, name, and exam scores.
 * It provides methods to calculate the average score, determine the grade,
 * and check the passing status.
 *
 * @author Natthawat Charoensuk
 * @version 1.0, 09/01/2026
 * @Student_ID 683040410-1
 * @Section 2
 */

package charoensuk.natthawat.lab5;

public class Student {
    private String id;
    private String name;
    private double[] examScores;
    public static final int NUM_EXAMS = 3;

    /**
     * Constructs a Student with ID and name.
     * Exam scores are initialized to zero.
     *
     * @param id   the student ID
     * @param name the student name
     */
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.examScores = new double[NUM_EXAMS];
    }

    /**
     * Constructs a Student with ID, name, and exam scores.
     *
     * @param id     the student ID
     * @param name   the student name
     * @param scores the exam scores
     */
    public Student(String id, String name, double[] scores) {
        this(id, name);
        // Copy scores if the number of exams is correct
        if (scores.length == NUM_EXAMS) {
            System.arraycopy(scores, 0, examScores, 0, NUM_EXAMS);
        }
    }

    /**
     * Returns the student ID.
     *
     * @return the student ID
     */

    public String getID() {
        return id;
    }

    /**
     * Returns the student name.
     *
     * @return the student name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the score of a specific exam.
     *
     * @param examNum the exam index
     * @return the exam score
     */
    public double getExamScore(int examNum) {
        return examScores[examNum];
    }

    /**
     * Updates the student name.
     *
     * @param name the new student name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the score for a specific exam if the input is valid.
     *
     * @param examNum the exam index
     * @param score   the exam score (0–100)
     */
    public void setExamScore(int examNum, double score) {
        if (examNum >= 0 && examNum < NUM_EXAMS && score >= 0 && score <= 100) {
            examScores[examNum] = score;
        }
    }

    /**
     * Calculates the average score of all exams.
     *
     * @return the average score
     */
    public double calculateAverage() {
        double sum = 0;
        for (double s : examScores)
            sum += s;
        return sum / NUM_EXAMS;
    }

    /**
     * Determines the letter grade based on the average score.
     *
     * @return the letter grade
     */
    public String determineGrade() {
        double avg = calculateAverage();
        if (avg >= 80)
            return "A";
        else if (avg >= 70)
            return "B";
        else if (avg >= 60)
            return "C";
        else if (avg >= 50)
            return "D";
        else
            return "F";
    }

    /**
     * Checks whether the student has passed.
     *
     * @return true if the student passes, otherwise false
     */
    public boolean isPassing() {
        return calculateAverage() >= 50;
    }

    // Displays detailed student information.
    public void displayInfo() {
        System.out.printf(
                "ID: %s, Name: %s\nScores: [%.2f, %.2f, %.2f], Average: %.2f, Grade: %s, Status: %s\n\n",
                id, name,
                examScores[0], examScores[1], examScores[2],
                calculateAverage(),
                determineGrade(),
                isPassing() ? "PASS" : "FAIL");
    }

    /**
     * Returns a summary string of the student.
     *
     * @return formatted student information
     */
    @Override
    public String toString() {
        return String.format("%s - %s (Avg: %.2f, Grade: %s)",
                id, name, calculateAverage(), determineGrade());
    }
}

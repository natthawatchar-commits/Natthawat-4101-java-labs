/**
 * GradeSystemProcedural is a procedural-style program that calculates
 * students' averages, grades, and pass/fail status from score data.
 *
 * @author Natthawat Charoensuk
 * @version 1.0, 09/01/2026
 * @Student_ID 683040410-1
 * @Section 2
 */

package charoensuk.natthawat.lab5;

public class GradeSystemProcedural {
    /**
     * Determines the letter grade based on the average score.
     *
     * @param average the average score
     * @return the corresponding letter grade
     */
    static String determineGrade(double average) {
        // A: 80-100, B: 70-79, C: 60-69, D: 50-59, F: 0-49
        if (average >= 80)
            return "A";
        else if (average >= 70)
            return "B";
        else if (average >= 60)
            return "C";
        else if (average >= 50)
            return "D";
        else
            return "F";
    }

    /**
     * Displays a single student's information including scores,
     * average, grade, and pass/fail status.
     *
     * @param id     the student ID
     * @param name   the student name
     * @param scores the student's scores
     * @param index  the index of the student (not used, kept for consistency)
     */
    static void displayStudent(String id, String name, double[] scores, int index) {
        // Calculate the sum of scores
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        double average = sum / scores.length; // Calculate average score

        // Determine grade and status
        String grade = determineGrade(average);
        String Status = (average >= 50) ? "Pass" : "Fail";

        // Display student information
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.printf("Scores: %.1f %.1f %.1f\n", scores[0], scores[1], scores[2]);
        System.out.printf("Average: %.2f\n", average);
        System.out.println("Grade: " + grade);
        System.out.println("Status: " + Status);
        System.out.println();
    }

    /**
     * Displays information for all students.
     *
     * @param ids    array of student IDs
     * @param names  array of student names
     * @param scores 2D array of student scores
     */
    static void displayAllStudents(String[] ids, String[] names, double[][] scores) {
        for (int i = 0; i < ids.length; i++) {
            displayStudent(ids[i], names[i], scores[i], i);
        }
    }

    /**
     * Searches for a student by ID and returns the student's details.
     *
     * @param searchID the ID to search for
     * @param ids      array of student IDs
     * @param names    array of student names
     * @param scores   2D array of student scores
     * @return a formatted string of student information, or an empty string if not
     *         found
     */
    static String searchByID(String searchID, String[] ids, String[] names, double[][] scores) {
        for (int i = 0; i < ids.length; i++) {
            if (ids[i].equalsIgnoreCase(searchID)) {
                // Calculate average score
                double sum = 0;
                for (double score : scores[i]) {
                    sum += score;
                }
                double avg = sum / scores[i].length;

                // Return formatted student information
                return String.format("ID: %s\nName: %s\nScores: %.1f %.1f %.1f\nAverage: %.2f\nGrade: %s\nStatus: %s", ids[i],
                        names[i], scores[i][0], scores[i][1], scores[i][2] ,
                        avg, determineGrade(avg), (avg >= 50 ? "Pass" : "Fail"));
            }
        }
        return "";
    }

    public static void main(String[] args) {
        // Sample data for testing
        String[] studentIDs = { "S001", "S002", "S003" };
        String[] studentNames = { "Alice", "Bob", "Charlie" };
        double[][] studentScores = {
                { 85.0, 78.5, 92.0 },
                { 67.0, 73.5, 70.0 },
                { 45.0, 48.5, 46.0 }
        };

        // Display all students
        System.out.println("=== All Students ===");
        displayAllStudents(studentIDs, studentNames, studentScores);

        // Search for a student by ID
        System.out.println("=== Search Student by ID S002===");
        String searchID = "S002";
        String result = searchByID(searchID, studentIDs, studentNames, studentScores);
        if (!result.isEmpty()) {
            System.out.println(result);
        }
    }
}

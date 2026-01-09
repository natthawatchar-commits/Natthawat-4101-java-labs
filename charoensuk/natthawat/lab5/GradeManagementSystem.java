/**
 * GradeManagementSystem manages student records by allowing
 * adding students, displaying all students, and searching by student ID.
 *
 * @author Natthawat Charoensuk
 * @version 1.0, 09/01/2026
 * @Student_ID 683040410-1
 * @Section 2
 */

package charoensuk.natthawat.lab5;

import java.util.ArrayList;

public class GradeManagementSystem {
    private ArrayList<Student> students; // List to store Student objects

    // Constructs a GradeManagementSystem and initializes the student list.
    public GradeManagementSystem() {
        students = new ArrayList<>();
    }

    /**
     * Adds a student to the system.
     *
     * @param student the Student object to be added
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * Displays information of all students in the system
     * and shows the total number of students.
     */
    public void displayAllStudents() {
        for (Student s : students) {
            s.displayInfo();
        }
        System.out.println("Total students: " + students.size());
    }

    /**
     * Searches for a student by ID.
     *
     * @param searchID the student ID to search for
     * @return the Student object if found, or null if not found
     */
    public Student searchByID(String searchID) {
        for (Student s : students) {
            if (s.getID().equals(searchID)) {
                return s;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        GradeManagementSystem system = new GradeManagementSystem();

        // Add sample students
        system.addStudent(new Student("665904001-2", "Somsak Jaidee",
                new double[] { 75.5, 82.0, 88.5 }));
        system.addStudent(new Student("665904002-3", "Kulap Smith",
                new double[] { 45.0, 52.5, 48.0 }));
        system.addStudent(new Student("665904003-4", "Manee Rakdee",
                new double[] { 95.5, 98.0, 92.5 }));
        system.addStudent(new Student("665904004-5", "Chai Wongsai",
                new double[] { 65.0, 70.5, 68.0 }));
        system.addStudent(new Student("665904005-6", "Nok Saetang",
                new double[] { 55.5, 58.0, 62.5 }));

        // Display all students
        System.out.println("===== All Students =====");
        system.displayAllStudents();

        // Search for a student by ID
        System.out.println("\n===== Search Result =====");
        String searchID = args.length > 0 ? args[0] : "665904002-3";
        Student found = system.searchByID(searchID);
        if (found != null) {
            System.out.println("Found: " + found);
        } else {
            System.out.println("Student not found: " + searchID);
        }
    }

}

/**
 * Handles Employee object serialization and deserialization.
 * 
 * @author Natthawat Charoensuk
 * @version 1.0, 20/03/2026
 * @Student_ID 683040410-1
 * @Section 2   
 */
package charoensuk.natthawat.lab12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import charoensuk.natthawat.lab7.*;

public class EmployeeFileHandler {
    /**
     * Writes an Employee object to a file.
     */
    public static void writeEmployeeToFile(Employee emp, String filename) {
        try (FileOutputStream fileOut = new FileOutputStream(filename);
                ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            out.writeObject(emp);
            System.out.println("Object successfully written to " + filename);

        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    /**
     * Reads an Employee object from a file.
     */
    public static Employee readEmployeeFromFile(String filename) {
        Employee emp = null;
        try (FileInputStream fileIn = new FileInputStream(filename);
                ObjectInputStream in = new ObjectInputStream(fileIn)) {

            emp = (Employee) in.readObject();

        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found: " + e.getMessage());
        }
        return emp;
    }
}

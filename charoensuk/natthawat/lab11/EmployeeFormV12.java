/**
 * EmployeeFormV12: Extends V11 to add file operations (Open/Save) 
 * and displays a summary message of the employee data.
 * 
 * * @author Natthawat Charoensuk
 * @version 1.0, 13/03/2026
 * @Student_ID 683040410-1
 * @Section 2   
 */
package charoensuk.natthawat.lab11;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;

public class EmployeeFormV12 extends EmployeeFormV11 {
    protected String message;

    public EmployeeFormV12(String title) {
        super(title);
    }

    /** Creates a formatted summary string from current form inputs */
    protected void createEmployeeSummaryMessage() {
        message = "Hello Somchai Jaidee, you are processing the following record:\n" +
                  "ID: " + idField.getText() + "\n" +
                  "Name: " + nameField.getText() + "\n" +
                  "Base Salary: " + salaryField.getText() + "\n" +
                  "Type: " + (managerRB.isSelected() ? "Manager" : 
                             salesRB.isSelected() ? "Sales Person" : "Intern") + "\n";
        
        if (managerRB.isSelected()) {
            message += "Bonus: " + bonusField.getText() + "\n";
        }

    }

    /** 
     * Overrides OK button to display the summary message dialog 
     */
    @Override
    protected void handleOKButton() {
        createEmployeeSummaryMessage();
        JOptionPane.showMessageDialog(this, message, "Employee Summary", JOptionPane.INFORMATION_MESSAGE);
    }

    /** 
     * Opens a file chooser to save the employee summary to a text file
     */
    protected void handleSaveMenuItem() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (PrintWriter writer = new PrintWriter(file)) {
                createEmployeeSummaryMessage();
                writer.print(message);
                JOptionPane.showMessageDialog(this, 
                    "Employee data saved successfully to file " + file.getName(),
                    "Writing Data to File", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error saving file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    protected void handleOpenMenuItem() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                StringBuilder content = new StringBuilder();
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()) {
                    content.append(scanner.nextLine()).append("\n");
                }
                scanner.close();

                JOptionPane.showMessageDialog(this, 
                    "Loaded Employee Data from file " + file.getName() + " which is\n" + content.toString(),
                    "Reading Data from File", JOptionPane.INFORMATION_MESSAGE);

            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(this, "File not found: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == saveItem) {
            handleSaveMenuItem();
        } else if (source == openItem) {
            handleOpenMenuItem();
        } else if (source == aboutItem) {

        } else if (source == exitItem) {
            System.exit(0);
        } else {
            super.actionPerformed(e);
        }
    }

    public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
        EmployeeFormV12 efv12 = new EmployeeFormV12("Employee Form V12");
        efv12.addComponents();
        efv12.addMenus();
        efv12.addListeners();

        efv12.setDefaultValues(); 
        
        efv12.setFrameFeatures();

        efv12.idField.setName("ID");
        efv12.nameField.setName("Name");
        efv12.salaryField.setName("Base Salary");
        efv12.bonusField.setName("Bonus");
    });
}
}
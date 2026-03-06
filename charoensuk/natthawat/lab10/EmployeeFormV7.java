/**
 * EmployeeFormV7: Extends V6 to handle button events and data processing.
 * 
 * @author Natthawat Charoensuk
 * @version 1.0, 06/03/2026
 * @Student_ID 683040410-1
 * @Section 2   
 */
package charoensuk.natthawat.lab10;

import javax.swing.*;
import java.awt.event.*;
import charoensuk.natthawat.lab9.EmployeeFormV6;

public class EmployeeFormV7 extends EmployeeFormV6 implements ActionListener {
    protected static final String MY_NAME = "Natthawat Charoensuk";
    protected static final String MY_ID = "683040410-1";

    /**
     * Constructor for EmployeeFormV7.
     */
    public EmployeeFormV7(String title) {
        super(title);
    }

    protected void addListeners() {
        okButton.addActionListener(this);
        cancelButton.addActionListener(this);
    }

    /**
     * Dispatches events to appropriate handler methods.
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        Object srcObject = event.getSource();
        if (srcObject == okButton) {
            handleOKButton();
        } else if (srcObject == cancelButton) {
            handleCancelButton();
        }
    }

    /**
     * Processes and displays form data when OK is clicked.
     */
    protected void handleOKButton() {
        String type = "";
        String extraInfo = "";

        if (employeeRB.isSelected()) {
            type = "Employee";
        } else if (managerRB.isSelected()) {
            type = "Manager";
            extraInfo = "\nBonus: " + bonusField.getText();
        } else if (salesRB.isSelected()) {
            type = "SalesPerson";
            extraInfo = "\nCommission: " + commRateField.getText();
        } else if (internRB.isSelected()) {
            type = "Intern";
            extraInfo = "\nUniversity: " + uniCombo.getSelectedItem()
                    + "\nDuration: " + internFilter.getText();
        }
        String message = "Hello " + MY_NAME + ", you are processing the following record:\n"
                + "ID: " + idField.getText() + "\n"
                + "Name: " + nameField.getText() + "\n"
                + "Base Salary: " + salaryField.getText() + "\n"
                + "Type: " + type
                + extraInfo + "\n"
                + "Work Experience: " + expSlider.getValue() + " years\n"
                + "Notes: " + notesArea.getText();

        JOptionPane.showMessageDialog(this, message);
    }

    /**
     * Resets form fields to default values when Cancel is clicked.
     */
    protected void handleCancelButton() {
        idField.setText(MY_ID);
        nameField.setText(MY_NAME);
        salaryField.setText("");
        bonusField.setText("");
        commRateField.setText("");
        durationField.setText("");
        notesArea.setText("");
        expSlider.setValue(0);
        uniCombo.setSelectedIndex(0);
        employeeRB.setSelected(true);
    }

    /**
     * Creates and displays the form.
     */
    public static void createAndShowGUI() {
        EmployeeFormV7 efv7 = new EmployeeFormV7("Employee Form V7");
        efv7.addComponents();
        efv7.addMenus();
        efv7.addListeners();
        efv7.setDefaultValues();
        efv7.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }
}

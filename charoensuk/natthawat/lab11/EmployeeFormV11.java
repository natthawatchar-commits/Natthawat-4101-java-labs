/**
 * EmployeeFormV11: Extends V10 to add input validation for ID format,
 * non-empty fields, and numeric constraints for salary and bonus.
 * 
 * * @author Natthawat Charoensuk
 * @version 1.0, 13/03/2026
 * @Student_ID 683040410-1
 * @Section 2   
 */
package charoensuk.natthawat.lab11;

import charoensuk.natthawat.lab10.EmployeeFormV10;
import javax.swing.*;
import java.awt.event.*;

public class EmployeeFormV11 extends EmployeeFormV10 {

    public EmployeeFormV11(String title) {
        super(title);
    }
    
    /** 
     * Checks if the text field is empty and alerts the user 
     */
    protected boolean isEmptyField(JTextField textField, String fieldName) {
        if (textField.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in the " + fieldName + " field.",
                    "Input Error", JOptionPane.ERROR_MESSAGE);
            textField.requestFocusInWindow();
            return true;
        }
        return false;
    }

    /** 
     * Validates ID format (Starts with 'E' followed by 3 digits) 
     */
    protected boolean isValidID(String id) {
        if (id.length() != 4) {
            JOptionPane.showMessageDialog(this, "ID must be exactly 4 characters long.",
                    "Input Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (id.charAt(0) != 'E') {
            JOptionPane.showMessageDialog(this, "ID must start with 'E'.",
                    "Input Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        for (int i = 1; i < id.length(); i++) {
            if (!Character.isDigit(id.charAt(i))) {
                JOptionPane.showMessageDialog(this, "ID must contain only digits after the first character.",
                        "Input Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }

    /** 
     * Validates if the input is a non-negative number 
     */
    protected boolean isValidNumber(JTextField textField, String fieldName) {
        try {
            double value = Double.parseDouble(textField.getText());
            if (value < 0) {
                JOptionPane.showMessageDialog(this, fieldName + " cannot be negative.",
                        "Input Error", JOptionPane.ERROR_MESSAGE);
                textField.requestFocusInWindow();
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, fieldName + " must be a valid number.",
                    "Input Error", JOptionPane.ERROR_MESSAGE);
            textField.requestFocusInWindow();
            return false;
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source instanceof JTextField) {
            JTextField field = (JTextField) source;
            String fieldName = field.getName();

            if (isEmptyField(field, fieldName)) return;

            if (source == idField) {
                if (!isValidID(field.getText())) {
                    field.requestFocusInWindow();
                }
            } else if (source == salaryField || (source == bonusField && managerRB.isSelected())) {
                String label = (source == salaryField) ? "Base Salary" : "Bonus";
                isValidNumber(field, label);
            } else {
                super.actionPerformed(e);
            }
            this.handleOKButton();
        } else {
            super.actionPerformed(e);
        }
    }

    @Override
    protected void handleOKButton() {
        if (isEmptyField(idField, "ID")) return;
        if (isEmptyField(nameField, "Name")) return;
        if (isEmptyField(salaryField, "Base Salary")) return;
        if (managerRB.isSelected()) {
            if (isEmptyField(bonusField, "Bonus")) return;
            if (!isValidNumber(bonusField, "Bonus")) return;
        }

        if (!isValidID(idField.getText())) return;
        if (!isValidNumber(salaryField, "Base Salary")) return;

        super.handleOKButton();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EmployeeFormV11 efv11 = new EmployeeFormV11("Employee Form V11");
            efv11.addComponents();
            efv11.idField.setName("ID");
            efv11.nameField.setName("Name");
            efv11.salaryField.setName("Base Salary");
            efv11.bonusField.setName("Bonus");
            
            efv11.addMenus();
            efv11.addListeners();
            efv11.setDefaultValues();
            efv11.setFrameFeatures();
        });
    }
}
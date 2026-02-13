/**
 * An employee form that initializes fields with default values and manages component states.
 *
 * @author Natthawat Charoensuk
 * @version 1.0, 13/02/2026
 * @Student_ID 683040410-1
 * @Section 2   
 */

package charoensuk.natthawat.lab9;

import javax.swing.*;
import java.awt.*;

public class EmployeeFormV4 extends charoensuk.natthawat.lab8.EmployeeFormV3 {
    public EmployeeFormV4(String title) {
        super(title);
    }

    /**
     * Sets initial values for text fields, selects default radio buttons/combobox,
     * and configures the initial enabled/disabled state of specific components.
     */
    protected void setDefaultValues() {
        // Set default text for employee information fields
        idField.setText("E001");
        nameField.setText("Natthawat Charoensuk");
        salaryField.setText("25000.0");
        bonusField.setText("5000.0");
        commRateField.setText("0.15");
        durationField.setText("6");

        // Set default selections for role and university
        managerRB.setSelected(true);
        uniCombo.setSelectedItem("KKU");

        // Disable fields that are not relevant to the default "Manager" role
        commRateField.setEnabled(false);
        durationField.setEnabled(false);
        uniCombo.setEnabled(false);

        // Set sample text for the notes area and configure text wrapping
        notesArea.setText(
                "This is a sample employee record who is a manager. In order to be a successful manager, one must have excellent leadership skills and the ability to motivate a team. These are essential qualities for effective management.");
        notesArea.setLineWrap(true);
        notesArea.setWrapStyleWord(true);

    }

    @Override
    protected void addComponents() {
        // Inherit all UI components and menus from EmployeeFormV3
        super.addComponents();
    }

    /**
     * Instantiates and displays the EmployeeFormV4 window with default values.
     */
    public static void createAndShowGUI() {
        EmployeeFormV4 efv4 = new EmployeeFormV4("Employee Form V4");
        efv4.addComponents();
        efv4.setDefaultValues(); // Apply default data after components are added
        efv4.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

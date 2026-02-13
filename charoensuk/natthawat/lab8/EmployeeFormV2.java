/**
 * An expanded employee form that adds specific fields for Managers, Salespersons, and Interns.
 *
 * @author Natthawat Charoensuk
 * @version 1.0, 13/02/2026
 * @Student_ID 683040410-1
 * @Section 2   
 */

package charoensuk.natthawat.lab8;

import javax.swing.*;
import java.awt.*;

public class EmployeeFormV2 extends EmployeeFormV1 {
    // Additional input fields and components for specific employee roles
    protected JTextField bonusField, commRateField, durationField;
    protected JComboBox<String> uniCombo;
    protected JTextArea notesArea;
    protected JPanel extraPanel;

    public EmployeeFormV2(String title) {
        super(title);
    }

    @Override
    protected void addComponents() {
        // Reuse components from EmployeeFormV1 (ID, Name, Salary, Buttons)
        super.addComponents();

        // Initialize extraPanel with a 5x2 Grid to hold role-specific details
        extraPanel = new JPanel(new GridLayout(5, 2 ));

        // Add Bonus field for Manager role
        extraPanel.add(new JLabel("Bonus (Manager):"));
        bonusField = new JTextField();
        extraPanel.add(bonusField);

        // Add Commission Rate field for SalesPerson role
        extraPanel.add(new JLabel("Commission Rate (SalesPerson):"));
        commRateField = new JTextField();
        extraPanel.add(commRateField);

        // Add University dropdown list for Intern role
        extraPanel.add(new JLabel("University (Intern):"));
        String[] universities = {"KKU", "Chula", "Mahidol", "Others"};
        uniCombo = new JComboBox<>(universities);
        extraPanel.add(uniCombo);

        // Add Duration field for Intern role
        extraPanel.add(new JLabel("Duration in months (Intern):"));
        durationField = new JTextField();
        extraPanel.add(durationField);

        // Add Notes area with a JScrollPane for scrollable text input
        extraPanel.add(new JLabel("Notes:"));
        notesArea = new JTextArea(3, 25);
        JScrollPane scrollPane = new JScrollPane(notesArea);
        extraPanel.add(scrollPane);

        // Position the extraPanel in the center of the main layout
        mainPanel.add(extraPanel, BorderLayout.CENTER);
    }

    /**
     * Instantiates and displays the expanded EmployeeFormV2 window.
     */
    public static void createAndShowGUI() {
        EmployeeFormV2 efv2 = new EmployeeFormV2("Employee Form V2");
        efv2.addComponents();
        efv2.setFrameFeatures(); 
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
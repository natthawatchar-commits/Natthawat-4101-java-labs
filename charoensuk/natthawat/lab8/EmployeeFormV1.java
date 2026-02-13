/**
 * An employee information form that extends MySimpleWindow to add input fields and radio buttons.
 *
 * @author Natthawat Charoensuk
 * @version 1.0, 13/02/2026
 * @Student_ID 683040410-1
 * @Section 2   
 */

package charoensuk.natthawat.lab8;

import javax.swing.*;
import java.awt.*;

public class EmployeeFormV1 extends MySimpleWindow{
    // Input fields and radio buttons for employee data     
    protected JTextField idField, nameField, salaryField;
    protected JRadioButton employeeRB, managerRB, salesRB, internRB;
    protected ButtonGroup typeGroup;
    protected JPanel formPanel, typePanel;

    public EmployeeFormV1(String title) {
        // Reuse basic components (buttons) from the parent class
        super(title);
    }
    @Override
    protected void addComponents(){
        super.addComponents();

        // Initialize text fields with specified lengths
        idField = new JTextField(10);
        nameField = new JTextField(20);
        salaryField = new JTextField(15);
        
        // Initialize and group radio buttons for employee types
        employeeRB = new JRadioButton("Employee" , true);
        managerRB = new JRadioButton("Manager");
        salesRB = new JRadioButton("SalesPerson");
        internRB = new JRadioButton("Intern");

        typeGroup = new ButtonGroup();
        typeGroup.add(employeeRB);
        typeGroup.add(managerRB);
        typeGroup.add(salesRB);
        typeGroup.add(internRB);

        // Organize radio buttons into a flow layout panel
        typePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        typePanel.add(employeeRB);
        typePanel.add(managerRB);
        typePanel.add(salesRB);
        typePanel.add(internRB);

        // Create the form layout using a 4x2 grid
        formPanel = new JPanel(new GridLayout(4,2));
        formPanel.add(new JLabel("ID:"));
        formPanel.add(idField);
        formPanel.add(new JLabel("Name:"));
        formPanel.add(nameField);
        formPanel.add(new JLabel("Base Salary:"));
        formPanel.add(salaryField);
        formPanel.add(new JLabel("Employee Type:"));
        formPanel.add(typePanel);

        // Set layout for mainPanel and arrange components
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(formPanel , BorderLayout.NORTH);
        mainPanel.add(buttonPanel , BorderLayout.SOUTH);
    }

    /**
     * Instantiates and displays the EmployeeFormV1 window.
     */
    public static void createAndShowGUI() {
        EmployeeFormV1 efv1 = new EmployeeFormV1("Employee Form V1");
        efv1.addComponents();
        efv1.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

/**
 * EmployeeFormV9: Extends V8 to handle slider changes and radio button events.
 * 
 * * @author Natthawat Charoensuk
 * @version 1.0, 06/03/2026
 * @Student_ID 683040410-1
 * @Section 2   
 */
package charoensuk.natthawat.lab10;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class EmployeeFormV9 extends EmployeeFormV8 implements ChangeListener {

    /**
     * Constructor for EmployeeFormV9.
     */
    public EmployeeFormV9(String title) {
        super(title);
    }

    /**
     * Adds ChangeListener for the slider and ActionListeners for radio buttons.
     */
    @Override
    protected void addListeners() {
        super.addListeners();

        // Add ChangeListener for work experience slider
        expSlider.addChangeListener(this);
        
        // Add ActionListeners for employee type radio buttons
        employeeRB.addActionListener(this);
        managerRB.addActionListener(this);
        salesRB.addActionListener(this);
        internRB.addActionListener(this);
    }

    /**
     * Responds to slider value changes when the adjustment is finished.
     */
    @Override
    public void stateChanged(ChangeEvent e) {
        if (!expSlider.getValueIsAdjusting()) {
            int value = expSlider.getValue();
            JOptionPane.showMessageDialog(this, "Work experience updated to: " + value + " years");
        }
    }
    
    /**
     * Main method to launch EmployeeFormV9.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EmployeeFormV9 efv9 = new EmployeeFormV9("Employee Form V9");
            efv9.addComponents();
            efv9.addMenus();
            efv9.addListeners();
            efv9.setDefaultValues();
            efv9.setFrameFeatures();
        });
    }
}

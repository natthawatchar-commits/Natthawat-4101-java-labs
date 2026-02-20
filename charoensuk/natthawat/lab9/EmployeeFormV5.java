/**
 * EmployeeFormV5 extends EmployeeFormV4 to include a work experience slider.
 * This class demonstrates the use of JSlider with custom ticks and labels.
 * 
 * @author Natthawat Charoensuk
 * @version 1.0, 20/02/2026
 * @Student_ID 683040410-1
 * @Section 2   
 */
package charoensuk.natthawat.lab9;

import javax.swing.*;
import java.awt.*;

public class EmployeeFormV5 extends EmployeeFormV4 {
    /** Slider for selecting work experience in years */
    protected JSlider expSlider;
    /** Label for the work experience slider */
    protected JLabel expLabel;

    /**
     * Constructs a new EmployeeFormV5 with a specified title.
     * * @param title The title of the window frame.
     */
    public EmployeeFormV5(String title) {
        super(title);
    }

    /**
     * Adds graphical components to the frame, specifically the work experience
     * slider.
     * Overrides the addComponents method from EmployeeFormV4.
     */
    @Override
    protected void addComponents() {
        // Initialize components from parent classes
        super.addComponents();
        // Set layout for the extraPanel inherited from parent
        extraPanel.setLayout(new GridLayout(0, 2));

        // Initialize Label and Slider
        expLabel = new JLabel("Work Experience (years):");
        expSlider = new JSlider(0, 40, 5);

        // Configure Slider appearance
        expSlider.setMajorTickSpacing(5);
        expSlider.setMinorTickSpacing(1);
        expSlider.setPaintTicks(true);
        expSlider.setPaintLabels(true);

        // Set Slider colors as per requirements
        expSlider.setBackground(Color.WHITE);
        expSlider.setForeground(Color.BLUE);

        // Add components to the designated panel
        extraPanel.add(expLabel);
        extraPanel.add(expSlider);

        // Refresh panel to ensure layout reflects changes
        extraPanel.revalidate();
    }

    /**
     * Sets up and displays the GUI for EmployeeFormV5.
     */
    public static void createAndShowGUI() {
        EmployeeFormV5 efv5 = new EmployeeFormV5("Employee Form V5");
        efv5.addComponents();
        efv5.addMenus(); // Ensure menus are inherited and added
        efv5.setDefaultValues();
        efv5.setFrameFeatures();
    }

    /**
     * Main method to launch the application.
     * * @param args Command line arguments.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }
}

/**
 * A simple Swing application that creates a GUI window with "Cancel" and "OK" buttons.
 *
 * @author Natthawat Charoensuk
 * @version 1.0, 13/02/2026
 * @Student_ID 683040410-1
 * @Section 2   
 */

package charoensuk.natthawat.lab8;

import javax.swing.*;
import java.awt.*;

public class MySimpleWindow extends JFrame {
    // Protected components for easy inheritance and reuse
    protected JButton cancelButton, okButton;
    protected JPanel mainPanel, buttonPanel;

    public MySimpleWindow(String title) {
        super(title);
    }

    /**
     * Initializes buttons and panels, then adds them to the frame.
     */
    protected void addComponents() {
        cancelButton = new JButton("Cancel");
        okButton = new JButton("OK");

        mainPanel = new JPanel();
        buttonPanel = new JPanel();

        // Adding buttons to the sub-panel
        buttonPanel.add(cancelButton);
        buttonPanel.add(okButton);

        // Nesting the button panel inside the main panel
        mainPanel.add(buttonPanel);

        // Adding the final layout to the frame
        add(mainPanel);
    }

    /**
     * Configures window visibility, sizing, and centering.
     */
    protected void setFrameFeatures() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * Static method to instantiate and display the window.
     */
    public static void createAndShowGUI() {
        MySimpleWindow msw = new MySimpleWindow("My Simple Window");
        msw.addComponents();
        msw.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                createAndShowGUI();
            }
        });
    }
}

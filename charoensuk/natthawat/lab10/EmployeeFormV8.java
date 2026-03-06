/**
 * EmployeeFormV8: Extends V7 to handle menu item events and actions.
 * 
 * * @author Natthawat Charoensuk
 * @version 1.0, 06/03/2026
 * @Student_ID 683040410-1
 * @Section 2   
 */
package charoensuk.natthawat.lab10;

import javax.swing.*;
import java.awt.event.*;

public class EmployeeFormV8 extends EmployeeFormV7 {

    /**
     * Constructor for EmployeeFormV8.
     */
    public EmployeeFormV8(String title) {
        super(title);
    }

    /**
     * Registers ActionListeners for menu items and calls super.addListeners().
     */
    @Override
    protected void addListeners() {
        super.addListeners();
        newItem.addActionListener(this);
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);
        aboutItem.addActionListener(this);
    }

    /**
     * Handles events from both buttons (via super) and menu items.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == newItem) {
            handleNewMenuItem();
        } else if (src == openItem) {
            handleOpenMenuItem();
        } else if (src == saveItem) {
            handleSaveMenuItem();
        } else if (src == exitItem) {
            handleExitMenuItem();
        } else if (src == aboutItem) {
            handleAboutMenuItem();
        } else {
            super.actionPerformed(e);
        }
    }

    /**
     * Handles events from both buttons (via super) and menu items.
     */
    private void handleNewMenuItem() {
        handleCancelButton();
    }

    /**
     * Displays an opening file message.
     */
    private void handleOpenMenuItem() {
        JOptionPane.showMessageDialog(this, "Opening file...");
    }

   /**
     * Displays a saving file message.
     */
    private void handleSaveMenuItem() {
        JOptionPane.showMessageDialog(this, "Saving file...");
    }

    /**
     * Terminates the application.
     */
    private void handleExitMenuItem() {
        System.exit(0);
    }

    /**
     * Displays information about the application and the author.
     */
    private void handleAboutMenuItem() {
        String msg = "Employee Management System Version 1.0\nCreated by " + MY_NAME + " (" + MY_ID + ")";
        JOptionPane.showMessageDialog(this, msg, "About", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Main method to launch EmployeeFormV8.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EmployeeFormV8 efv8 = new EmployeeFormV8("Employee Form V8");
            efv8.addComponents();
            efv8.addMenus();
            efv8.addListeners();
            efv8.setDefaultValues();
            efv8.setFrameFeatures();
        });
    }
}
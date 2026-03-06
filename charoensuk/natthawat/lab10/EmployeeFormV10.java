/**
 * EmployeeFormV10: Extends V9 to add Mnemonics and Accelerators for menu items.
 * 
 * * @author Natthawat Charoensuk
 * @version 1.0, 06/03/2026
 * @Student_ID 683040410-1
 * @Section 2   
 */
package charoensuk.natthawat.lab10;

import javax.swing.*;
import java.awt.event.*;

public class EmployeeFormV10 extends EmployeeFormV9 {

    /**
     * Constructor for EmployeeFormV10.
     */
    public EmployeeFormV10(String title) {
        super(title);
    }

    /**
     * Configures menu items with keyboard mnemonics and accelerators.
     */
    @Override
    protected void addMenus() {
        super.addMenus(); 
        
        // Grouping Mnemonic configurations
        fileMenu.setMnemonic(KeyEvent.VK_F);
        newItem.setMnemonic(KeyEvent.VK_N);
        openItem.setMnemonic(KeyEvent.VK_O);
        saveItem.setMnemonic(KeyEvent.VK_S);
        exitItem.setMnemonic(KeyEvent.VK_Q);

        // Grouping Accelerator configurations
        newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK));
    }

    /**
     * Initializes and displays the EmployeeFormV10 GUI.
     */
    public static void createAndShowGUI() {
        EmployeeFormV10 efv10 = new EmployeeFormV10("Employee Form V10");
        efv10.addComponents();
        efv10.addMenus();
        efv10.addListeners();
        efv10.setDefaultValues();
        efv10.setFrameFeatures();
    }

    /**
     * Entry point to run the application.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }
}
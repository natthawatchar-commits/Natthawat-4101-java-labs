/**
 * An advanced employee form that adds a comprehensive menu bar with File, Data, and Help options.
 *
 * @author Natthawat Charoensuk
 * @version 1.0, 13/02/2026
 * @Student_ID 683040410-1
 * @Section 2   
 */

package charoensuk.natthawat.lab8;

import javax.swing.*;
import java.awt.*;

public class EmployeeFormV3 extends EmployeeFormV2 {
    // Menu bar components and their respective menu items
    protected JMenuBar menuBar;
    protected JMenu fileMenu, dataMenu, helpMenu, sortByMenu, filterByMenu;
    protected JMenuItem newItem, openItem, saveItem, exitItem;
    protected JMenuItem nameItem, idItem, salaryItem, roleItem;
    protected JMenuItem empFilter, managerFilter, salesFilter, internFilter, allFilter;
    protected JMenuItem aboutItem, userGuideItem;

    public EmployeeFormV3(String title) {
        super(title);
    }

    /**
     * Creates and organizes the menu bar, including nested sub-menus for sorting and filtering.
     */
    protected void addMenus() {
        menuBar = new JMenuBar();

        // Initialize File Menu
        fileMenu = new JMenu("File");
        newItem = new JMenuItem("New");
        openItem = new JMenuItem("Open");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        // Initialize Data Menu with sub-menus
        dataMenu = new JMenu("Data");
        
        // Setup Sort By sub-menu
        sortByMenu = new JMenu("Sort By");
        nameItem = new JMenuItem("Name");
        idItem = new JMenuItem("ID");
        salaryItem = new JMenuItem("Salary");
        roleItem = new JMenuItem("Role");
        sortByMenu.add(nameItem);
        sortByMenu.add(idItem);
        sortByMenu.add(salaryItem);
        sortByMenu.add(roleItem);

        // Setup Filter By sub-menu
        filterByMenu = new JMenu("Filter By");
        empFilter = new JMenuItem("Employee");
        managerFilter = new JMenuItem("Manager");
        salesFilter = new JMenuItem("SalesPerson");
        internFilter = new JMenuItem("Intern");
        allFilter = new JMenuItem("All");
        filterByMenu.add(empFilter);
        filterByMenu.add(managerFilter);
        filterByMenu.add(salesFilter);
        filterByMenu.add(internFilter);
        filterByMenu.add(allFilter);

        // Group sub-menus under Data Menu
        dataMenu.add(sortByMenu);
        dataMenu.add(filterByMenu);

        // Initialize Help Menu
        helpMenu = new JMenu("Help");
        aboutItem = new JMenuItem("About");
        userGuideItem = new JMenuItem("User Guide");
        helpMenu.add(aboutItem);
        helpMenu.add(userGuideItem);

        // Add all main menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(dataMenu);
        menuBar.add(helpMenu);

        // Attach the menu bar to the frame
        setJMenuBar(menuBar);
    }

    @Override
    protected void addComponents() {
        super.addComponents(); // Reuse form and button components from EmployeeFormV2
        addMenus(); // Add the menu system to the frame           
    }

    /**
     * Instantiates and displays the EmployeeFormV3 window.
     */
    public static void createAndShowGUI() {
        EmployeeFormV3 efv3 = new EmployeeFormV3("Employee Form V3");
        efv3.addComponents();
        efv3.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }
}
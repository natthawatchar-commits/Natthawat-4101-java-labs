/**
 * EmployeeFormV6 is a graphical user interface for an employee form.
 * This version adds menu icons and a student image panel at the top.
 * 
 * @author Natthawat Charoensuk
 * @version 1.0, 20/02/2026
 * @Student_ID 683040410-1
 * @Section 2   
 */
package charoensuk.natthawat.lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;

public class EmployeeFormV6 extends EmployeeFormV5 {

    /**
     * Constructs a new EmployeeFormV6 with a specific title.
     * * @param title The title of the application window.
     */
    public EmployeeFormV6(String title) {
        super(title);
    }

    /**
     * Adds menus to the frame and sets icons for menu items.
     * Reuses code from EmployeeFormV5.
     */
    @Override
    protected void addMenus() {
        super.addMenus();
        // Set icons for inherited menu items
        newItem.setIcon(new ImageIcon("images/New-icon.png"));
        openItem.setIcon(new ImageIcon("images/Open-icon.png"));
        saveItem.setIcon(new ImageIcon("images/Save-icon.png"));
    }

    /**
     * StudentImagePanel is a custom JPanel that displays an image
     * while maintaining its aspect ratio.
     */
    class StudentImagePanel extends JPanel {
        private BufferedImage image;

        /**
         * Loads the student image from the file system.
         */
        public StudentImagePanel() {
            try {
                image = ImageIO.read(new File("images/my-pic.png"));
            } catch (Exception e) {
                System.err.println("Could not load image");
            }
        }

        /**
         * Sets the preferred size of the image panel.
         * * @return Dimension of the panel.
         */
        @Override
        public Dimension getPreferredSize() {
            return new Dimension(300, 400); // Adjusted height for better layout
        }

        /**
         * Paints the component and draws the image centered with proper scaling.
         * * @param g The graphics context to use for painting.
         */
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (image != null) {
                // Get original image dimensions
                int imgWidth = image.getWidth();
                int imgHeight = image.getHeight();

                // Get panel dimensions
                int panelWidth = getWidth();
                int panelHeight = getHeight();

                // Calculate scaling factor to fit
                // image within panel
                // while maintaining aspect ratio
                double scaleX = (double) panelWidth / imgWidth;
                double scaleY = (double) panelHeight / imgHeight;

                // Use smaller scale to fit
                double scale = Math.min(scaleX, scaleY);
                // Calculate scaled dimensions
                int scaledWidth = (int) (imgWidth * scale);
                int scaledHeight = (int) (imgHeight * scale);

                // Center the image in the panel
                int x = (panelWidth - scaledWidth) / 2;
                int y = (panelHeight - scaledHeight) / 2;

                // Draw the image with proper aspect ratio
                g.drawImage(image, x, y,
                        scaledWidth, scaledHeight, this);
            }
        }
    }

    /**
     * Adds components to the frame, including the custom image panel.
     */
    @Override
    protected void addComponents() {
        super.addComponents();
        StudentImagePanel imagePanel = new StudentImagePanel();
        // Add the image panel to the top (North) of the frame
        getContentPane().add(imagePanel, BorderLayout.NORTH);
    }

    /**
     * Initializes the GUI components and sets frame visibility.
     */
    public static void createAndShowGUI() {
        EmployeeFormV6 efv6 = new EmployeeFormV6("Employee Form V6");
        efv6.addComponents();
        efv6.setDefaultValues();
        efv6.setFrameFeatures();
    }

    /**
     * Main entry point for the application.
     * * @param args command line arguments (not used).
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }
}
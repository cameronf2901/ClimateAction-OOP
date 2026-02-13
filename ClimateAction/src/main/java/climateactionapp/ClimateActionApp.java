package climateactionapp;

/**
 * Main application class for Climate Action App
 * @author Kamlesh
 * 
 * This is the main entry point of the Climate Action application.
 * It creates and displays the main GUI window (ClimateActionGUI).
 * The application provides tools for climate-related calculations and analysis.
 */
public class ClimateActionApp {
    /**
     * Main method - entry point of the application
     * @param args command line arguments (not used in this application)
     */
    public static void main(String[] args) {
        // Create the main GUI window
        ClimateActionGUI mainGUI = new ClimateActionGUI();
        
        // Make the window visible to the user
        mainGUI.setVisible(true);
        
        // Center the window on the screen
        mainGUI.setLocationRelativeTo(null);
    }
}
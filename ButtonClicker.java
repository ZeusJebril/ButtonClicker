package button_clicker;

import java.awt.*;
import javax.swing.*;

public class ButtonClicker extends JFrame {
    
    private int clickCount = 0;  // Variable to store the click count
    private JLabel counterLabel;  // Label to display the counter
    
    public ButtonClicker() {
        // Set up the JFrame
        setTitle("Main Frame");
        setSize(450, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);  // Make the frame unresizable
        
        // Create a JLabel to display the counter
        counterLabel = new JLabel("Clicks: 0");
        counterLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        counterLabel.setBounds(10, 10, 100, 30);  // Position the label at the top-left corner
        add(counterLabel);
        
        // Create the JButton
        JButton button = new JButton("Click Me");
        button.setBounds(150, 150, 150, 50);  // Position the button
        
        // Add an ActionListener to the button
        button.addActionListener(e -> {
            clickCount++;  // Increment the counter
            counterLabel.setText("Clicks: " + clickCount);  // Update the label with the new count
        });
        
        // Set layout to null to use absolute positioning
        setLayout(null);
        
        // Add the button to the frame
        add(button);
        
        // Set the frame to be visible
        setVisible(true);
    }
    
    public static void main(String[] args) {
        // Create an instance of ButtonClicker to display the frame
        new ButtonClicker();
    }
}

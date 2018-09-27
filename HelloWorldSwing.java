package start;

import javax.swing.*;

public class HelloWorldSwing {

  private static void createAndShowGUI() {

    // Create the window
    JFrame frame = new JFrame("HelloWorldSwing");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Add Label
    JLabel label = new JLabel("Hello World");
    frame.getContentPane().add(label);

    //Display the window
    frame.pack();
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    // Create and show Applications GUI
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        createAndShowGUI();
      }
    });
  }
}

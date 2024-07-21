package Ex2;
import javax.swing.*;
import java.awt.*;
public class ex2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame 3");
        frame.setSize(250, 120);
        frame.setLayout(null);
        frame.setVisible(true);
        JButton button = new JButton("Push Me!!");
        button.setBounds(60, 0, 120, 40);
        button.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 14));
        frame.add(button, BorderLayout.NORTH);
    }
}

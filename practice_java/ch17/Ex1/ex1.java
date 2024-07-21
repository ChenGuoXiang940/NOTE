package Ex1;
import javax.swing.*;
public class ex1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Frame");
        frame.setSize(250, 120);
        frame.setLayout(null);
        frame.getContentPane().setBackground(java.awt.Color.PINK);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JLabel label = new JLabel("Knowledge is power.");
        label.setBounds(40, 60, 160, 20);
        label.setForeground(java.awt.Color.BLUE);
        label.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 14));
        frame.add(label);
    }
}
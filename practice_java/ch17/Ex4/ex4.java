package Ex4;
import javax.swing.*;
import java.awt.*;
public class ex4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("frame 7");
        frame.setSize(230, 120);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        frame.getContentPane().add(panel);
        JLabel label = new JLabel("Honesty is the best policy.");
        label.setOpaque(true);
        label.setBackground(Color.YELLOW);
        label.setFont(new Font("Arial", Font.PLAIN, 14));
        panel.add(label);
        JButton b1 = new JButton("Ok");
        b1.setFont(new Font("Arial", Font.PLAIN, 14));
        panel.add(b1);
        JButton b2 = new JButton("Exit");
        b2.setFont(new Font("Arial", Font.PLAIN, 14));
        panel.add(b2);
        frame.pack();
        frame.setVisible(true);
    }
}

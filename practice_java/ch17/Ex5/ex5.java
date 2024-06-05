package Ex5;
import javax.swing.*;
import java.awt.*;
public class ex5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame 8");
        frame.setSize(120, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new FlowLayout());
        frame.getContentPane().add(panel);
        JButton button1 = new JButton("Button1");
        panel.add(button1);
        JButton button2 = new JButton("Button2");
        panel.add(button2);
        JButton button3 = new JButton("Button3");
        panel.add(button3);
        frame.setVisible(true);
    }
}

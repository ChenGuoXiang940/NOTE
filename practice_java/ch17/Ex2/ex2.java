package Ex2;
import javax.swing.*;
import java.awt.*;
public class ex2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame 3");
        frame.setSize(250, 120);
        frame.setVisible(true);
        JButton button = new JButton("Push Me!!");
        button.setBounds(40, 40, 160, 40);
        button.setFont(new Font("Arial", Font.PLAIN, 14));
        frame.add(button);
    }
}

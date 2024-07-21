package Ex3;
import java.awt.*;
import javax.swing.*;
public class ex3 {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Frame 5");
        frame.setSize(250, 260);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JLabel label=new JLabel(new ImageIcon("C:\\Users\\chen1\\OneDrive\\Desktop\\Department of Resources and Engineering\\NOTE\\practice_java\\ch17\\agave.png"));
        label.setBounds(20, 20, 200, 200);
        frame.add(label, BorderLayout.CENTER);
        JButton button=new JButton("OK",new ImageIcon("C:\\Users\\chen1\\OneDrive\\Desktop\\Department of Resources and Engineering\\NOTE\\practice_java\\ch17\\ok.png"));
        button.setOpaque(true);
        button.setFont(new Font("Arial", Font.PLAIN, 14));
        frame.add(button, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}

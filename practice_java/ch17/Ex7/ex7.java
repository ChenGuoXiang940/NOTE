package Ex7;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ex7 {
    public static void main(String[] args) {
        JFrame frm=new JFrame("JButton & JLabel");
        frm.getContentPane().setBackground(Color.ORANGE);
        frm.setSize(300, 200);
        Panel panel1=new Panel();
        panel1.setBounds(10, 10, 200, 200);
        JLabel text=new JLabel("Make hay while the sun shines");
        text.setFont(new Font("Arial", Font.PLAIN, 14));
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        JButton sun = new JButton("Red", new ImageIcon("C:\\Users\\chen1\\OneDrive\\Desktop\\Department of Resources and Engineering\\NOTE\\practice_java\\ch17\\red.gif"));
        sun.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text.setForeground(java.awt.Color.RED);
            }
        });
        JButton mon=new JButton("Green",new ImageIcon("C:\\Users\\chen1\\OneDrive\\Desktop\\Department of Resources and Engineering\\NOTE\\practice_java\\ch17\\green.gif"));
        mon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text.setForeground(java.awt.Color.GREEN);
            }
        });
        panel1.add(sun);
        panel1.add(mon);
        panel1.add(text);
        frm.add(panel1);
        frm.setVisible(true);
    }
}

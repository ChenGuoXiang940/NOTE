package Ex6;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ex6 {
    public static void main(String[] args) {
        JFrame frm=new JFrame("JButton & JLabel");
        frm.setSize(300, 200);
        Panel panel1=new Panel();
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel img=new JLabel(new ImageIcon());
        img.setBounds(5, 5, 100, 100);
        JButton kitty = new JButton("kitty", new ImageIcon("C:\\Users\\chen1\\OneDrive\\Desktop\\Department of Resources and Engineering\\NOTE\\practice_java\\ch17\\kittyicon.png"));
        kitty.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                img.setIcon(new ImageIcon("C:\\Users\\chen1\\OneDrive\\Desktop\\Department of Resources and Engineering\\NOTE\\practice_java\\ch17\\kitty.png"));
                img.setText("kitty.png");
            }
        });
        JButton puppy = new JButton("puppy", new ImageIcon("C:\\Users\\chen1\\OneDrive\\Desktop\\Department of Resources and Engineering\\NOTE\\practice_java\\ch17\\puppyicon.png"));
        puppy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                img.setIcon(new ImageIcon("C:\\Users\\chen1\\OneDrive\\Desktop\\Department of Resources and Engineering\\NOTE\\practice_java\\ch17\\puppy.png"));
                img.setText("puppy.png");
            }
        });
        panel1.add(kitty);
        panel1.add(puppy);
        panel1.add(img);
        frm.add(panel1);
        frm.setVisible(true);
    }
}

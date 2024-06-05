package Ex8;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ex8 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JRadioButton");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel radioPanel = new JPanel();
        ButtonGroup group = new ButtonGroup();

        JRadioButton kittyButton = new JRadioButton("kitty");
        JRadioButton puppyButton = new JRadioButton("puppy");
        JRadioButton agaveButton = new JRadioButton("agave");

        group.add(kittyButton);
        group.add(puppyButton);
        group.add(agaveButton);

        radioPanel.add(kittyButton);
        radioPanel.add(puppyButton);
        radioPanel.add(agaveButton);

        JLabel imageLabel = new JLabel();
        frame.add(imageLabel, BorderLayout.CENTER);
        frame.add(radioPanel, BorderLayout.NORTH);

        kittyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                imageLabel.setIcon(new ImageIcon("C:\\Users\\chen1\\OneDrive\\Desktop\\Department of Resources and Engineering\\NOTE\\practice_java\\ch17\\kitty.png"));
            }
        });

        puppyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                imageLabel.setIcon(new ImageIcon("C:\\Users\\chen1\\OneDrive\\Desktop\\Department of Resources and Engineering\\NOTE\\practice_java\\ch17\\puppy.png"));
            }
        });
        agaveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                imageLabel.setIcon(new ImageIcon("C:\\Users\\chen1\\OneDrive\\Desktop\\Department of Resources and Engineering\\NOTE\\practice_java\\ch17\\agave.png"));
            }
        });

        frame.setVisible(true);
    }
}

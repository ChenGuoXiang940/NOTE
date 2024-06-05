package Ex10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ex10 {
    public static int index=-1;
    public static void main(String[] args) {
        JFrame frame = new JFrame("JRadioButton");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel radioPanel = new JPanel();

        JRadioButton absButton = new JRadioButton("絕對值");
        JRadioButton pow2Button = new JRadioButton("平方值");
        JRadioButton pow3Button = new JRadioButton("立方值");

        radioPanel.add(absButton);
        radioPanel.add(pow2Button);
        radioPanel.add(pow3Button);

        absButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                index=1;
            }
        });

        pow2Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                index=2;
            }
        });
        pow3Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                index=3;
            }
        });
        
        JLabel label = new JLabel("x=");
        JTextField textField = new JTextField(10);
        JButton button = new JButton("計算");
        JLabel result = new JLabel("");
        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(index==1){
                    int val = Integer.parseInt(textField.getText());
                    result.setText("Abs("+val+")="+Math.abs(val));
                }
                else if(index==2){
                    int val = Integer.parseInt(textField.getText());
                    result.setText("("+val+")*("+val+")="+Math.pow(val, 2));
                }
                else if(index==3){
                    int val = Integer.parseInt(textField.getText());
                    result.setText("("+val+")*("+val+")*("+val+")="+Math.pow(val, 3));
                }
            }
        });
        inputPanel.add(label);
        inputPanel.add(textField);
        inputPanel.add(button);
        frame.add(radioPanel, BorderLayout.NORTH);
        frame.add(inputPanel, BorderLayout.CENTER);
        frame.add(result, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}

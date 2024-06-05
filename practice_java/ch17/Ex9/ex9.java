package Ex9;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex9 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Scrolling");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JLabel label = new JLabel();
        frame.add(label, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(500, 500));

        JScrollPane scrollPane = new JScrollPane(panel);
        frame.add(scrollPane, BorderLayout.CENTER);

        scrollPane.getHorizontalScrollBar().addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                label.setText("ScrollBar at(" + e.getValue() + "," + scrollPane.getVerticalScrollBar().getValue()+")");
            }
        });

        scrollPane.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                label.setText("ScrollBar at(" + scrollPane.getHorizontalScrollBar().getValue() + "," + e.getValue()+")");
            }
        });

        frame.setVisible(true);
    }
}
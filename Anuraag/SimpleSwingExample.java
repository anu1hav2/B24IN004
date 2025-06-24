import javax.swing.*;
import java.awt.event.*;

public class SimpleSwingExamaple {
public static void main(String[] args) {
JFrame frame = new JFrame("My First Swing App");
frame.setSize(300, 200);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLayout(null);
JLabel label = new JLabel("Click the button!");
label.setBounds(90, 50, 150, 20);
frame.add(label);
JButton button = new JButton("Click Me");
button.setBounds(90, 90, 120, 30);
frame.add(button);
button.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
label.setText("Button Clicked!");
}
});
frame.setVisible(true);
}
}
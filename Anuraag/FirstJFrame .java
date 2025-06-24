import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.Formatter;
class FirstJFrame implements ActionListener
{
JFrame jfrm;
JLabel jlbl1;
JButton jbtn;
FirstJFrame()
{
jfrm = new JFrame("First JFrame Program");
jfrm.setSize(500, 400);
jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jfrm.setVisible(true);
jfrm.setLayout(null);
jlbl1 = new JLabel("HELLO");
jlbl1.setBounds(100, 80, 200, 50);
jfrm.add(jlbl1);
jbtn = new JButton("Click");
jbtn.setBounds(100, 150, 100, 60);
jfrm.add(jbtn);
jbtn.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
Calendar cal = Calendar.getInstance();
//Formatter fmt=new Formatter();
String s=String.format("%tH",cal.getTime());
int hr = Integer.parseInt(s);
String str = "";
if(hr< 12)
str = "Good Morning";
else if(hr>=12 &&hr< 17)
str = "Good Afternoon";
else
str = "Good Evening";
jlbl1.setText(str);
}
public static void main(String[] args) {
new FirstJFrame(); 
}
}
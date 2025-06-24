import javax.swing.*;
import java.awt.event.*;

class  SimpleCal{
  
  SimpleCal(){
	  JFrame frame = new JFrame("Calculator");
	  frame.setSize(500, 300);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
	  
	  JTextField input1 = new JTextField(10);
  	  JTextField input2 = new JTextField(10);
1	  JTextField result = new JTextField(10);
	  
	  JButton plus = new JButton("+");
	  
	  JPanel panel = new JPanel();
	  panel.add(input1);
	  panel.add(input2);
	  panel.add(result);
	  panel.add(plus);
	  frame.add(panel);
	  
	  
	  
	  plus.addActionListener(
	  new ActionListener(){
		  public void actionPerformed(ActionEvent e){
			  int i = Integer.parseInt(input1.getText());
			  int j = Integer.parseInt(input2.getText());
			  int r = i + j;
			  result.setText("Add: "+r);
		  }
	  });
	  frame.setVisible(true);
  }

  public static void main(String args[]){
	  SimpleCal s = new SimpleCal();
  }
	
}
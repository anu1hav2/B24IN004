import javax.swing.*;
import java.awt.event.*;
class BillingSystem{
	BillingSystem(){
		JFrame frame = new JFrame("CSN Billing System");
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel item1 = new JLabel ();
		item1.setText("Item:");
		JTextField name = new JTextField(20);
	
		JLabel item2 = new JLabel();
		item2.setText("Quantity:");
		JTextField quantity = new JTextField(20);
		
		JLabel item3 = new JLabel();
		item3.setText("Price:");
		JTextField price = new JTextField(20);
		
		
		
		JButton button = new JButton("Add");
		JLabel totalLabel = new JLabel();
		JPanel panel = new JPanel();
		panel.add(item1);
		panel.add(name);
		panel.add(item2);
		panel.add(quantity);
		panel.add(item3);
		panel.add(price);
		panel.add(button);
		JTextArea itemArea = new JTextArea();
		JScrollPane scrollPane = new  JScrollPane(itemArea);
		scrollPane.setBounds(20,200,500,30);
		itemArea.setEditable(false);
		panel.add(scrollPane);
		button.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					String item = name.getText();
					int q = Integer.parseInt(quantity.getText());
					int p = Integer.parseInt(price.getText());
					int total = q * p;
					totalLabel.setText("Total Amount: "+total+" Rupees");
				}
		});
		frame.add(panel);
		frame.setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new BillingSystem();
	}
}
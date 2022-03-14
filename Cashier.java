 /* 
 * Cashier.java: A cashier menu for Taco Bell
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;


public class Cashier implements ActionListener
{
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JButton button;
	private static JLabel failed;
	private static JPasswordField passwordText;
	private static JFrame frame;
	
	Frame1 f1;
	
	public static void main (String[]args)
	{ 
	JPanel panel = new JPanel ();
	frame = new JFrame ("Login");
	frame.setSize(321,206);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().add(panel);
	panel.setLayout(null);
	
	JLabel label = new JLabel ("Username");
	label.setBounds(10, 20, 80, 25);
	panel.add(label);
	
	userText = new JTextField ();
	userText.setBounds(100,20, 165, 25);
	panel.add(userText);
	
	passwordLabel = new JLabel ("Password");
	passwordLabel.setBounds(10, 50, 80, 25);
	panel.add(passwordLabel);
	
	passwordText = new JPasswordField ();
	passwordText.setBounds(100,50, 165, 25);
	panel.add(passwordText);
	
	button = new JButton ("Login");
	button.setForeground(Color.BLACK);
	button.setBackground(Color.YELLOW);
	button.setBounds(76, 85, 158, 25);
	button.addActionListener(new Cashier());
	
	panel.add(button);
	
	failed = new JLabel (" ");
	failed.setBounds(10, 110, 300, 25);
	panel.add(failed);
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
	
	}
	
	public void actionPerformed (ActionEvent e) 
	{
		String user = userText.getText();
		String password = passwordText.getText();
		
		if (user.equalsIgnoreCase("TACO") && password.equals("1234"))
		{
			frame.setVisible(false);
			f1 = new Frame1 ();	
		}
		else
		{
			failed.setText("Wrong Username/Password");
			new Cashier ();
		}
		
		
	}
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.io.*;
import javax.swing.JOptionPane;

public class Frame2 extends JFrame implements ActionListener ,  ItemListener
{
	private JLabel lblc1, lblc2 ,lblimage1, lblimage2;
	private JPanel pnlMenu, pnlButton, pnlName ;
	private JRadioButton button1, button2 ;
	private JButton btnNext, btnBack ;
	private int quantity1,quantity2;
	public static String Name = " " ;
	private static String choice1 ;
	private static String choice2 ;
	private BorderLayout layout ;
	private JCheckBox cb1,cb2;
	private ButtonGroup group;
	private JTextArea txt1 ;
	private Container cont ;
	
	Frame2 f2;
	DrinkFrame df;
	
	
	//step1
	public Frame2 ()
	{
		super ("TACO BELL");
		layout = new BorderLayout();
		
		new Font ("Serif" , Font.PLAIN , 18);
		Font myFont1 = new Font ("Monospaced" , Font.BOLD , 22);
		
		//getcontnt pane and sets its layout
		cont = getContentPane();
		cont.setLayout(layout);
		cont.setBackground(new Color(255, 182, 193));
		
		
		//set up label
		lblc1 = new JLabel ("           DINE-IN");
		lblc1.setFont(myFont1);
		lblc2 = new JLabel ("           TAKE-AWAY");
		lblc2.setFont(myFont1);
		
		//setup image
		ImageIcon icon = new ImageIcon(new ImageIcon("dine in.jpg").getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT));
		ImageIcon icon1 = new ImageIcon(new ImageIcon("take away.jpg").getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT));
		lblimage1 = new JLabel(icon); 
		lblimage2 = new JLabel (icon1);
		
		//create JRadioButton with Label
		button1 = new JRadioButton ("DINE-IN");
		button1.setForeground(Color.BLACK);
		button1.setHorizontalAlignment(SwingConstants.CENTER);
		button1.setHorizontalTextPosition(SwingConstants.CENTER);
		button1.setFont(new Font("Teko SemiBold", Font.BOLD, 24));
		button1.setVerticalTextPosition(SwingConstants.TOP);
		button1.setBackground(new Color(255, 228, 225));
		
		button2 = new JRadioButton ("TAKE-AWAY");
		button2.setForeground(Color.BLACK);
		button2.setHorizontalAlignment(SwingConstants.CENTER);
		button2.setFont(new Font("Teko SemiBold", Font.BOLD, 24));
		button2.setVerticalTextPosition(SwingConstants.TOP);
		button2.setHorizontalTextPosition(SwingConstants.CENTER);
		button2.setBackground(new Color(255, 228, 225));
		
		//setup textArea
		txt1 = new JTextArea (2,12);
		txt1.setText(Name + txt1.getText());
		
		//setup button
		btnNext = new JButton ("Proceed to menu");
		btnNext.setFont(myFont1);
		btnNext.setBackground(Color.yellow);
		btnBack = new JButton ("Back");
		btnBack.setFont(myFont1);
		btnBack.setBackground(new Color(153, 50, 204));
		
		
		//setup panel
		pnlMenu = new JPanel ();
		pnlMenu.setBackground(new Color(255, 192, 203));
		pnlButton = new JPanel ();
		pnlButton.setBackground(new Color(255, 192, 203));
		pnlName = new JPanel ();
		pnlName.setBackground(new Color(255, 192, 203));
		pnlName.setLayout(new FlowLayout ());
		pnlMenu.setLayout(new GridLayout (4,2));
		pnlMenu.setBorder(new TitledBorder (new EtchedBorder (), "DINE-IN OR TAKE-AWAY"));
		pnlName.setBorder(new TitledBorder (new EtchedBorder (), "ORDER NUMBER"));
		
		//add component to panel
		pnlName.add(txt1);
		pnlMenu.add(lblc1);
		pnlMenu.add(lblc2);
		pnlMenu.add(lblimage1);
		pnlMenu.add(lblimage2);
		pnlMenu.add(button1);
		pnlMenu.add(button2);
		pnlButton.add(btnBack);
		pnlButton.add(btnNext);
		
		//add component to container
		cont.add(pnlName , BorderLayout.NORTH);
		cont.add(pnlMenu , BorderLayout.CENTER);
		cont.add(pnlButton , BorderLayout.SOUTH);
		
		//register listener
		btnBack.addActionListener(this);
		btnNext.addActionListener(this);
		button1.addItemListener(this);
		button2.addItemListener(this);
		
		//setup frame
		this.setAlwaysOnTop(true);
		this.setResizable(false);
		setSize (1500, 800);
		setVisible (true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}//close for constuctor
		
	//mutator
		public void setname(String Name)
		{ 
			Name = Name;
		}
		public void setchoice1(String C1)
		{ 
			choice1 = C1;
		}
		public void setchoice2(String C2)
		{ 
			choice2 = C2;
		}
		
		//accessor
		public static String getname ()
		{ 
			return Name;
		}
		
		public static String getchoice1 ()
		{ 
			return choice1;
		}
		
		public static String getchoice2 ()
		{ 
			return choice2;
		}
		
		public void itemStateChanged (ItemEvent e)
		{
			if (button1.isSelected())
			{
				choice1 = "DINE-IN";
			}
			else
			{
				choice1= " ";
			}
			
			if (button2.isSelected())
			{
				choice2 = "TAKE-AWAY";
			}
			else
			{
				choice2= " ";
			}
		}
			

		
		public void actionPerformed (ActionEvent e)
		{
			if (e.getSource() == btnNext)
			{
				df = new DrinkFrame (txt1.getText());
				dispose ();
			}
			else if (e.getSource () == btnBack)
			{ 
				Frame1 f1 = new Frame1();
				dispose ();
			
			}
		}
}
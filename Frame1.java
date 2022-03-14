/**
 * 
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Toolkit;

//step 1
public class Frame1 extends JFrame implements ActionListener
{
	private JLabel lbl1,lbl2, lblImage1;
	private JButton btnNext;
	private JPanel pnlMenu;
	private Container cont;
	private BorderLayout layout;
	
	Cashier cr;
	Frame2 f2;
	
	//Set up GUI
	public Frame1 ()
	{
		super ("Welcome to Taco Bell");
		setBackground(Color.WHITE);
		layout = new BorderLayout();
		
		//set Font
		Font myFont = new Font ("TimesRomant",Font.BOLD+Font.ITALIC,23);
		Font myFont1 = new Font ("Helvetica",Font.BOLD,20);
		Font myFont2 = new Font ("Helvetica",Font.BOLD+Font.ITALIC,20);
		
		//get content pane and sets its layout
		cont = getContentPane();
		cont.setLayout(layout);
		cont.setBackground(new Color(139, 0, 139));
		
		//set up Label
		lbl1 = new JLabel ("                                                                                                            WELCOME TO TACO BELL 🔔");
		lbl1.setForeground(new Color(255, 255, 255));
		lbl2 = new JLabel ("                                                                                    HUNGRY? PICK OUR PLACE OR YOURS");
		lbl2.setForeground(new Color(255, 255, 255));
		lbl1.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 20)); 
		lbl2.setFont(new Font("Russo One", Font.BOLD, 20));
		ImageIcon icon = new ImageIcon (new ImageIcon ("taco bell.jpg").getImage().getScaledInstance(350,350, Image.SCALE_DEFAULT));
		lblImage1 = new JLabel (icon);
		lblImage1.setBackground(Color.WHITE);
		
		//set up button
		btnNext = new JButton ("Click to Proceed");
		btnNext.setFont(myFont2);
		btnNext.setBackground(Color.YELLOW);
		btnNext.addActionListener(this);
		
		
		//set up Panel
		pnlMenu = new JPanel ();
		pnlMenu.setLayout(new GridLayout (3, 2));
		pnlMenu.setBackground(new Color(139, 0, 139));
		
		pnlMenu.add(lbl1);
		pnlMenu.add(lbl2);
		
		//add components to container
		cont.add(pnlMenu , BorderLayout.NORTH);
		cont.add(lblImage1 , BorderLayout.CENTER);
		cont.add(btnNext , BorderLayout.SOUTH);
		
		//set up frame
		this.setAlwaysOnTop(true);
		this.setResizable(false);
		setSize (1500, 800);
		setVisible (true);
		setDefaultCloseOperation (EXIT_ON_CLOSE);
	}
	
	 public void actionPerformed(ActionEvent e) {
		  
		  if(e.getSource()==btnNext) 
		  {

		   f2 = new Frame2 ();
		   dispose ();
		  }	 
			
	}
		public static void main(String [] args)
		{
			Frame1 f1 = new Frame1 ();
			
		}
	}
	
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DrinkFrame extends JFrame implements ActionListener , ItemListener
{
	
	private JLabel lblD1,lblD2,lblD3,lblD4,lblD5,lblD6,lblimage1,lblimage2,lblimage3,lblimage4,lblimage5,lblimage6,lblQ1,lblQ2,lblQ3,lblQ4,lblQ5,lblQ6;
	private JCheckBox cb1,cb2,cb3,cb4,cb5,cb6;
	private JTextArea txt1;
	private JTextField txt2,txt3,txt4,txt5,txt6,txt7;
	private JButton btnnext,btnback;
	private JPanel pnlmenu,pnlbutton,pnlname;
	private Container cont;
	private BorderLayout layout;
	
	private static String drink1="";
	private static String drink2="";
	private static String drink3="";
	private static String drink4="";
	private static String drink5="";
	private static String drink6="";
	
	private double price1=0;
	private double price2=0;
	private double  price3=0;
	private double  price4=0;
	private double  price5=0;
	private double  price6=0;
	
	private static double q1=0;
	private static double q2=0;
	private static double q3=0;
	private static double q4=0;
	private static double q5=0;
	private static double q6=0;
	
	private static double totalPrice=0.00;

	Frame2 f2;
	ReceiptFrame rf;
	
	
	//mutator
			public void setDrink1(String D1)
			{
				drink1=D1;
			}
			
			public void setDrink2(String D2)
			{
				drink2=D2;
			}
			
			public void setDrink3(String D3)
			{
				drink3=D3;
			}
			
			public void setDrink4(String D4)
			{
				drink4=D4;
			}
			
			public void setDrink5(String D5)
			{
				drink5=D5;
			}
			
			public void setDrink6(String D6)
			{
				drink6=D6;
			}
			
			public void setTotalPrice (int total)
			{
				totalPrice = total;
			}
			
			public void setQuantity1 (int quan1)
			{ 
				q1 = quan1;
			}
			
			public void setQuantity2 (int quan2)
			{ 
				q2 = quan2;
			}
			
			public void setQuantity3 (int quan3)
			{ 
				q3 = quan3;
			}
			
			public void setQuantity4 (int quan4)
			{ 
				q4 = quan4;
			}
			
			public void setQuantity5 (int quan5)
			{ 
				q5 = quan5;
			}
			
			public void setQuantity6 (int quan6)
			{ 
				q6 = quan6;
			}
			
			//accessor
			public static String getDrink1 ()
			{
				return drink1;
			}
			
			public static String getDrink2 ()
			{
				return drink2;
			}
			
			public static String getDrink3 ()
			{
				return drink3;
			}
			
			public static String getDrink4 ()
			{
				return drink4;
			}
			
			public static String getDrink5 ()
			{
				return drink5;
			}
			
			public static String getDrink6 ()
			{
				return drink6;
			}
			
			public static double getTotalPrice ()
			{
				return totalPrice;
			}
			
			public static double getQuantity1 ()
			{
				return q1;
			}

			public static double getQuantity2 ()
			{
				return q2;
			}

			public static double getQuantity3 ()
			{
				return q3;
			}

			public static double getQuantity4 ()
			{
				return q4;
			}

			public static double getQuantity5 ()
			{
				return q5;
			}

			public static double getQuantity6 ()
			{
				return q6;
			}
	
	//step1
	public DrinkFrame (String Name)
	{
	super("Menu");
	layout = new BorderLayout();
	
	//set up font
	Font myFont = new Font ("SanSerif",Font.BOLD+Font.ITALIC,30);
	Font myFont1= new Font ("Monospaced",Font.BOLD,18);
	Font myFont2= new Font ("Monospaced",Font.BOLD+Font.ITALIC,60);
	Font myFont3= new Font ("Serif",Font.PLAIN,18);
	Font myFont4= new Font ("Serif",Font.PLAIN,16);
	
	//setup container
	cont = getContentPane();
	cont.setLayout(layout);
	cont.setBackground(Color.lightGray);
	
	//setup label
	lblD1=new JLabel("		Refillable SoftDrink");
	lblD1.setBackground(new Color(255, 250, 205));
	lblD1.setFont(myFont3);
	
	lblD2=new JLabel("		Strawberry Delight");
	lblD2.setFont(myFont3);
	
	lblD3=new JLabel("		Summer Mint");
	lblD3.setFont(myFont3);
	
	lblD4=new JLabel("		Taco Supreme");
	lblD4.setFont(myFont3);
	
	lblD5=new JLabel("		CrunchyWrap Supreme");
	lblD5.setFont(myFont3);
	
	lblD6=new JLabel("		Chicken Quesadilla");
	lblD6.setFont(myFont3);
	
	
	lblQ1 = new JLabel("		Quantity");
	lblQ1.setFont(myFont3);
	
	lblQ2 = new JLabel("		Quantity");
	lblQ2.setFont(myFont3);
	
	lblQ3 = new JLabel("		Quantity");
	lblQ3.setFont(myFont3);
	
	lblQ4 = new JLabel("		Quantity");
	lblQ4.setFont(myFont3);
	
	lblQ5 = new JLabel("		Quantity");
	lblQ5.setFont(myFont3);
	
	lblQ6 = new JLabel("		Quantity");
	lblQ6.setFont(myFont3);
	
	//setup image
	ImageIcon icon = new ImageIcon(new ImageIcon("Drink1.jpg").getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT));
	ImageIcon icon1 = new ImageIcon(new ImageIcon("Drink2.png").getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT));
	ImageIcon icon2 = new ImageIcon(new ImageIcon("Drink3.png").getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT));
	ImageIcon icon3 = new ImageIcon(new ImageIcon("food1.jpg").getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT));
	ImageIcon icon4 = new ImageIcon(new ImageIcon("food2.jpg").getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT));
	ImageIcon icon5 = new ImageIcon(new ImageIcon("food3.jpg").getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT));
	
	lblimage1 = new JLabel(icon);
	lblimage2 = new JLabel(icon1);
	lblimage3 = new JLabel(icon2);
	lblimage4 = new JLabel(icon3);
	lblimage5 = new JLabel(icon4);
	lblimage6 = new JLabel(icon5);
	
	//setup checkbox
	cb1 = new JCheckBox ("Price;RM7.00");
	cb1.setBackground(new Color(238, 130, 238));
	cb1.setFont(myFont4);
	
	cb2=new JCheckBox("Price:RM7.00");
	cb2.setBackground(new Color(238, 130, 238));
	cb2.setFont(myFont4);
	
	cb3=new JCheckBox("Price:RM7.00");

	cb3.setBackground(new Color(238, 130, 238));
	cb3.setFont(myFont4);
	
	cb4=new JCheckBox("Price:RM10.00");
	cb4.setBackground(new Color(238, 130, 238));
	cb4.setFont(myFont4);
	
	cb5=new JCheckBox("Price:RM10.00");
	cb5.setBackground(new Color(238, 130, 238));
	cb5.setFont(myFont4);
	
	cb6=new JCheckBox("Price:RM10.00");
	cb6.setBackground(new Color(238, 130, 238));
	cb6.setFont(myFont4);
	
	//setup textarea
	txt1 = new JTextArea (2,12);
	txt1.setText(Name + txt1.getText());
	txt1.setEditable(false);
	
	//setup textfield
	txt2= new JTextField(7);
	txt2.setText(" ");
	txt3= new JTextField(7);
	txt3.setText(" ");
	txt4= new JTextField(7);
	txt4.setText(" ");
	txt5= new JTextField(7);
	txt5.setText(" ");
	txt6= new JTextField(7);
	txt6.setText(" ");
	txt7= new JTextField(7);
	txt7.setText(" ");
	
	//setup button
	btnback= new JButton("Back");
	btnback.setFont(myFont1);
	btnback.setBackground(Color.YELLOW);
	btnnext=new JButton("End");
	btnnext.setFont(myFont1);
	btnnext.setBackground(Color.MAGENTA);
	
	//setup panel
	pnlmenu = new JPanel();
	pnlbutton = new JPanel();
	pnlbutton.setBackground(new Color(238, 130, 238));
	pnlname = new JPanel();
	pnlname.setBackground(new Color(238, 130, 238));
	pnlname.setLayout(new FlowLayout());
	pnlmenu.setLayout(new GridLayout(6,2));
	pnlmenu.setBorder(new TitledBorder(new EtchedBorder(),"What Would Like to Eat?"));
	pnlmenu.setFont(myFont2);
	pnlmenu.setBackground(new Color(238, 130, 238));
	
	//add component to panel
	pnlname.add(txt1);
	
	pnlmenu.add(lblD1);
	pnlmenu.add(lblimage1);
	pnlmenu.add(cb1);
	pnlmenu.add(lblQ1);
	pnlmenu.add(txt2);
	
	pnlmenu.add(lblD2);
	pnlmenu.add(lblimage2);
	pnlmenu.add(cb2);
	pnlmenu.add(lblQ2);
	pnlmenu.add(txt3);

	pnlmenu.add(lblD3);
	pnlmenu.add(lblimage3);
	pnlmenu.add(cb3);
	pnlmenu.add(lblQ3);
	pnlmenu.add(txt4);
	
	pnlmenu.add(lblD4);
	pnlmenu.add(lblimage4);
	pnlmenu.add(cb4);
	pnlmenu.add(lblQ4);
	pnlmenu.add(txt5);
	
	pnlmenu.add(lblD5);
	pnlmenu.add(lblimage5);
	pnlmenu.add(cb5);
	pnlmenu.add(lblQ5);
	pnlmenu.add(txt6);
	
	pnlmenu.add(lblD6);
	pnlmenu.add(lblimage6);
	pnlmenu.add(cb6);
	pnlmenu.add(lblQ6);
	pnlmenu.add(txt7); 
	
	pnlbutton.add(btnnext);
	pnlbutton.add(btnback);
	
	//add component to container
	cont.add(pnlname,BorderLayout.NORTH);
	cont.add(pnlmenu,BorderLayout.CENTER);
	cont.add(pnlbutton,BorderLayout.SOUTH);
	pnlbutton.setLayout(new FlowLayout(FlowLayout.RIGHT));
	pnlbutton.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
	
	//register listerner
	btnback.addActionListener(this);
	btnnext.addActionListener(this);
	cb1.addItemListener(this);
	cb2.addItemListener(this);
	cb3.addItemListener(this);
	cb4.addItemListener(this);
	cb5.addItemListener(this);
	cb6.addItemListener(this);
	
	//setup frame
	
	this.setAlwaysOnTop(true);
	this.setResizable(false);
	setSize (1500, 800);
	setVisible (true);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(cb1.isSelected())
		{
			drink1="Refillable SoftDrink";
			price1=7;
		}
		
		else
		{
			drink1="Refillable SoftDrink";
			price1=0;
		}
		
		
		if(cb2.isSelected())
		{
			drink2="Strawberry Delight";
			price2=7;
		}
		
		else
		{
			drink2="Strawberry Delight";
			price2=0;
		}
		
		if(cb3.isSelected())
		{
			drink3="Summer Mint";
			price3=7;
		}
		
		else
		{
			drink3="Summer Mint";
			price3=0;
		}
		
		if(cb4.isSelected())
		{
			drink4="Taco Supreme";
			price4=10;
		}
		
		else
		{
			drink4="Taco Supreme";
			price4=0;
		}
		
		if(cb5.isSelected())
		{
			drink5="CrunchyWrap Supreme";
			price5=10;
		}
		
		else
		{
			drink5="CrunchyWrap Supreme";
			price5=0;
		}
		
		if(cb6.isSelected())
		{
			drink6="Chicken Quesadilla";
			price6=10;
		}
		
		else
		{
			drink6="Chicken Quesadilla";
			price6=0;
		}

	}

	public void actionPerformed(ActionEvent e)
	{

		if(e.getSource()== btnnext)
		{
			//setup time
			Calendar timer=Calendar.getInstance();
			timer.getTime();
			SimpleDateFormat tTime= new SimpleDateFormat("HH:mm:ss");
			tTime.format(timer.getTime());
			SimpleDateFormat Tdate = new SimpleDateFormat("dd-MM-YYYY");
			Tdate.format(timer.getTime());
			
		
			dispose ();
			

			String name14=Frame2.getchoice1();
			String name15=Frame2.getchoice2();
			
			
		
			
			System.out.println ("\n"+"\t"+ "====================================================================================="+"\n"+"\t" +"\t"+"\t"
					+ "Welcome To Taco Bell"+"\n"+"\t"
					+"====================================================================================="+"\n\n\n"+"\t"
			+"Orders Number:"+ txt1.getText()+"\n"+"\t"
					+"________________________________________________________________________________________________"+"\n\n"+"\t\t\t"
			+"Order Date:"+Tdate.format(timer.getTime())+"\n\n"+"\t\t\t"+"Order Time:"+tTime.format(timer.getTime())+"\n\n"+"\t\t\t"
					+"Option:"+""+name14+name15+"\n\n\n"+"\t"
			+"Menu"+"\t\t\t\t"+"Quantity"+"\n"+"\t"
					+"________________________________________________________________________________________________"
			+"\n"+"\t"+ "Refillable SoftDrink" +"\t\t\t\t"+ txt2.getText()
			+"\n"+"\t"+ "Strawberry Delight" +"\t\t\t\t"+ txt3.getText()
			+"\n"+"\t"+ "Summer Mint" +"\t\t\t\t"+ txt4.getText()
			+"\n"+"\t"+ "Taco Supreme" +"\t\t\t\t"+ txt5.getText()
			+"\n"+"\t"+ "CrunchyWrap Supreme" +"\t\t\t\t"+ txt6.getText()
			+"\n"+"\t"+ "Chicken Quesadilla" +"\t\t\t\t"+ txt7.getText()
			
			+"\n"+"\t"+"=====================================================================================");
				System.out.println ((Double.parseDouble(txt2.getText())*price1)
					+ (Double.parseDouble(txt3.getText()) * price2) 
					+ (Double.parseDouble(txt4.getText()) * price3)
					+ (Double.parseDouble(txt5.getText()) * price4)
					+ (Double.parseDouble(txt6.getText()) * price5)
					+ (Double.parseDouble(txt7.getText()) * price6));
		}
		
		else if(e.getSource()== btnback)
		{
			f2 = new Frame2();
			dispose ();
			
			
		}
	
	}

}
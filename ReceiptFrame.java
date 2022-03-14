import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;

public class ReceiptFrame extends JFrame implements ActionListener {

	
	private JPanel pnlmenu,pnlbutton,pnlreceipt;
	private JButton Button,btnnext;
	private JTextArea txt1,txt2;
	private BorderLayout layout;
	private Container cont;
	private JLabel lbln1;
	
	int quantity1=DrinkFrame.getQuantity1();
	int quantity2=DrinkFrame.getQuantity2();
	int quantity3=DrinkFrame.getQuantity3();
	int quantity4=DrinkFrame.getQuantity4();
	int quantity5=DrinkFrame.getQuantity5();
	int quantity6=DrinkFrame.getQuantity6();
	
	int quantity7=FoodFrame.getQuantity1();
	int quantity8=FoodFrame.getQuantity2();
	int quantity9=FoodFrame.getQuantity3();
	int quantity10=FoodFrame.getQuantity4();
	int quantity11=FoodFrame.getQuantity5();
	int quantity12=FoodFrame.getQuantity6();
	int quantity13=FoodFrame.getQuantity7();
	
	String name1=DrinkFrame.getDrink1();
	String name2=DrinkFrame.getDrink2();
	String name3=DrinkFrame.getDrink3();
	String name4=DrinkFrame.getDrink4();
	String name5=DrinkFrame.getDrink5();
	String name6=DrinkFrame.getDrink6();
	
	String name7=FoodFrame.getFood1();
	String name8=FoodFrame.getFood2();
	String name9=FoodFrame.getFood3();
	String name10=FoodFrame.getFood4();
	String name11=FoodFrame.getFood5();
	String name12=FoodFrame.getFood6();
	String name13=FoodFrame.getFood7();
	
	String name14=Frame2.getchoice1();
	String name15=Frame2.getchoice2();
	
	double total=FoodFrame.getTotalPrice();
	double total1=DrinkFrame.getTotalPrice();
	double finalTotal=total+total1;
	
	DrinkFrame df;
	FoodFrame ff;
	Frame1 f1;
	Frame2 f2;
	
	//set up GUI

	public ReceiptFrame (String Name)
	{
		super("Receipt");
		layout=new BorderLayout();
		
		//set font
		Font myfont = new Font("SanSerif",Font.BOLD+Font.ITALIC,25);
		Font myfont1 = new Font("MoonSpaced",Font.BOLD+Font.ITALIC,22);
		
		//set up container
		
		cont=getContentPane();
		cont.setLayout(layout);
		cont.setBackground(Color.MAGENTA);
		
		//set up label
		lbln1=new JLabel("RECEIPT");
		lbln1.setFont(myfont1);
		
		//setup button exit
		Button =new JButton("Close");
				
		//setup button proceed
		btnnext=new JButton("New Order");
		
		//setup panel
		pnlreceipt=new JPanel();
		pnlreceipt.setFont(myfont);
		pnlbutton=new JPanel();
		pnlmenu=new JPanel();
		pnlmenu.setFont(myfont);
		pnlmenu.setBackground(Color.lightGray);
		pnlmenu.setLayout(new GridLayout(1,1));
		
		//setup time
		Calendar timer=Calendar.getInstance();
		timer.getTime();
		SimpleDateFormat tTime= new SimpleDateFormat("HH:mm:ss");
		tTime.format(timer.getTime());
		SimpleDateFormat Tdate = new SimpleDateFormat("dd-MM-YYYY");
		Tdate.format(timer.getTime());
		
		//setup textfield
		txt1=new JTextArea();
		txt1.setFont(myfont1);
		txt1=new JTextArea(30,40);
		txt1.setText("\n"+"\t"+ "====================================================================================="+"\n"+"\t" +"\t"+"\t"
		+ "Welcome To Taco Bell"+"\n"+"\t"
				+"====================================================================================="+"\n\n\n"+"\t"
		+"Orders Number:"+Name+"\n"+"\t"
				+"________________________________________________________________________________________________"+"\n\n"+"\t\t\t"
		+"Order Date:"+Tdate.format(timer.getTime())+"\n\n"+"\t\t\t"+"Order Time:"+tTime.format(timer.getTime())+"\n\n"+"\t\t\t"
				+"Option:"+""+name14+name15+"\n\n\n"+"\t"
		+"Menu"+"\t\t\t\t"+"Quantity"+"\n"+"\t"
				+"________________________________________________________________________________________________"
		+"\n"+"\t"+ name1 +"\t\t\t\t"+ quantity1
		+"\n"+"\t"+ name2 +"\t\t\t\t"+ quantity2
		+"\n"+"\t"+ name3 +"\t\t\t\t"+ quantity3
		+"\n"+"\t"+ name4 +"\t\t\t\t"+ quantity4
		+"\n"+"\t"+ name5 +"\t\t\t\t"+ quantity5
		+"\n"+"\t"+ name6 +"\t\t\t\t"+ quantity6
		+"\n"+"\t"+ name7 +"\t\t\t\t"+ quantity7
		+"\n"+"\t"+ name8 +"\t\t\t\t"+ quantity9
		+"\n"+"\t"+ name10 +"\t\t\t\t"+ quantity10
		+"\n"+"\t"+ name11 +"\t\t\t\t"+ quantity11
		+"\n"+"\t"+ name12 +"\t\t\t\t"+ quantity12
		+"\n"+"\t"+ name13 +"\t\t\t\t"+ quantity13
		+"\n"+"\t"+"====================================================================================="
		+"\n"+"\t"+"Total Price"+"\t\t\t\t\t\t"+"RM"+finalTotal+"\n"+"\t"
		+"=====================================================================================");
		txt1.setEditable(false);



		
		//add component
		pnlreceipt.add(lbln1);
		pnlmenu.add(txt1);
		pnlbutton.add(Button);
		pnlbutton.add(btnnext);
		
		//add component to container
		cont.add(pnlreceipt,BorderLayout.NORTH);
		cont.add(pnlmenu,BorderLayout.CENTER);
		cont.add(pnlbutton,BorderLayout.SOUTH);
		
		//Register listener
		Button.addActionListener(this);
		btnnext.addActionListener(this);
		
		//setup frame
		this.setAlwaysOnTop(true);
		this.setResizable(false);
		setSize (1500, 800);
		setVisible (true);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	
	{
		
		if(e.getSource()==btnnext)
		{
			f1=new Frame1();
			dispose();
			
		}
		
		if(e.getSource()==Button)
		{
			dispose();
		}
			
	}
	
}
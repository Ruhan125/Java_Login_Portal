import javax.swing.*;



import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;


 


public class LogReg {

	public static void main(String[] args)
	{
		
		
		LogReg logobj = new LogReg();
		logobj.login();
		
				
	}
	
	public void login()
	{
        JFrame frame = new JFrame("Login");
		
		frame.setSize(400,500);
	    frame.setDefaultCloseOperation(3);
	    frame.setLayout(null);
	    frame.setLocationRelativeTo(null);
	    JLabel l1 = new JLabel();
	    
	    frame.setContentPane(new JLabel(new ImageIcon("C:\\Users\\Ruhan\\Pictures\\Saved Pictures\\java.png")));
	    //frame.setLayout(new FlowLayout()); 
	    frame.add(l1);
	    frame.setSize(390,550);
	    
	    JLabel l2 = new JLabel("Username :");
	    l2.setBounds(40, 150, 120, 50);
	    l2.setFont(new Font("Arial", Font.BOLD, 18));
	    frame.add(l2);
	    
	    
	    JTextField jtf= new JTextField();
	    jtf.setBounds(170,155,160,40);
		jtf.setFont(new Font("Arial", Font.BOLD, 20));
	    frame.add(jtf);
	    
	    JLabel l3 = new JLabel("Password :");
	    l3.setBounds(40, 210, 120, 50);
	    l3.setFont(new Font("Arial", Font.BOLD, 18));
	    frame.add(l3);
	    
	    JPasswordField jpf = new JPasswordField();
	    jpf.setBounds(170,215,160,40);
		jpf.setFont(new Font("Arial", Font.BOLD, 20));
	    frame.add(jpf);
	    
	    
	    JButton jbt = new JButton("Login");
	    jbt.setBounds(40,300,100,40);
		jbt.setFont(new Font("Arial", Font.BOLD, 20));
	    frame.add(jbt);
	    
	    jbt.addActionListener(new ActionListener()
		{
	      public void actionPerformed(ActionEvent e)
	      {
	    
	    	  
	    	 try {
	    		 
	    		  Class.forName("com.mysql.jdbc.Driver");
	    		  Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_user","root","");
	    		  Statement stmt = c.createStatement();
	    		  String sql = "Select * from user_info where Username = '"+jtf.getText()+"'and Password = '"+ jpf.getText()+"'";
	    		  ResultSet rs = stmt.executeQuery(sql);
	    		  
	    		  if(rs.next())
	    		  {
	    			   frame.dispose();
	    			   LogReg homeobj = new LogReg();
	    			   homeobj.home();
	    			  
	    		  }
	    		  else 
	 	    	 {
	 	    		 JOptionPane.showMessageDialog(null,"Wrong Username or Password","Error", JOptionPane.ERROR_MESSAGE);
	 	    		 jtf.setText(null);
	 	    		 jpf.setText(null);
	 	    		 jtf.requestFocusInWindow();
	 	    		 
	 	    	 }
	    		  
	    	 }
	    	 
	    	 catch(Exception ex)
	    	 {
	    		 ex.printStackTrace();
	    		 
	    		 
	    	 }
	    	 
	    	 
	    	    	 
	      }
 
 
 
		});
	    
	    
	    JLabel l4 = new JLabel("Don't have an account? Signup below:");
	    l4.setBounds(40, 400, 250, 50);
	    l4.setFont(new Font("Arial", Font.BOLD, 13));
	    frame.add(l4);
	    
	    
	    
	    JButton jbt2 = new JButton("SignUp");
	    jbt2.setBounds(40,440,100,40);
		jbt2.setFont(new Font("Arial", Font.BOLD, 15));
	    frame.add(jbt2);
	    
	    jbt2.addActionListener(new ActionListener()
		{
	      public void actionPerformed(ActionEvent e)
	      { 
	    	  frame.dispose();
			   LogReg homeobj = new LogReg();
			   homeobj.register();
	    	  
	    	  
	      }
	      
		} );  
	    
	    
		frame.setVisible(true);
		
	
	}
	
	public void home()
	{
        JFrame frame1 = new JFrame("Home");
		
		frame1.setSize(400,500);
	    frame1.setDefaultCloseOperation(3);
	    frame1.setLayout(null);
	    frame1.setLocationRelativeTo(null);
	    
        JLabel l2 = new JLabel();
	    
	    frame1.setContentPane(new JLabel(new ImageIcon("F:\\pics\\homee.jpg")));
	    //frame.setLayout(new FlowLayout()); 
	    frame1.add(l2);
	    frame1.setSize(800,500);
	    
	    JLabel lb2 = new JLabel("Welcome");
	    lb2.setBounds(100, 50, 200, 300);
	    lb2.setFont(new Font("Arial", Font.BOLD, 40));
	    frame1.add(lb2);
	    
	    frame1.setVisible(true);
		
		
		
		
	}
	
	public void register()
	{
        JFrame frame2 = new JFrame("SignUp");
		
		frame2.setSize(400,500);
	    frame2.setDefaultCloseOperation(3);
	    frame2.setLayout(null);
	    frame2.setLocationRelativeTo(null);
	    
        JLabel l5 = new JLabel();
	    
	    frame2.setContentPane(new JLabel(new ImageIcon("C:\\Users\\Ruhan\\Pictures\\regjava.jpg")));
	    //frame.setLayout(new FlowLayout()); 
	    frame2.add(l5);
	    frame2.setSize(800,500);
	    
	    JLabel lb6 = new JLabel("Welcome");
	    lb6.setBounds(100, 50, 200, 300);
	    lb6.setFont(new Font("Arial", Font.BOLD, 40));
	    lb6.setForeground(Color.white);
	    frame2.add(lb6);
	    
	    
	    
	    JLabel lb7 = new JLabel("SignUp");
	    lb7.setBounds(550, 25, 150, 70);
	    lb7.setFont(new Font("Arial", Font.BOLD, 30));
	    lb7.setForeground(Color.white);
	    frame2.add(lb7);
	    
	    
	    JLabel lb8 = new JLabel("Username:");
	    lb8.setBounds(380, 100, 150, 70);
	    lb8.setFont(new Font("Arial", Font.BOLD, 20));
	    lb8.setForeground(Color.white);
	    frame2.add(lb8);
	    
	    JTextField jtf1= new JTextField();
	    jtf1.setBounds(500,115,219,40);
		jtf1.setFont(new Font("Arial", Font.BOLD, 15));
	    frame2.add(jtf1);
	    
	   
	    
	    JLabel lb10 = new JLabel("Password:");
	    lb10.setBounds(380, 180, 150, 70);
	    lb10.setFont(new Font("Arial", Font.BOLD, 20));
	    lb10.setForeground(Color.white);
	    frame2.add(lb10);
	    
	    JPasswordField jpf1 = new JPasswordField();
	    jpf1.setBounds(500,195,219,40);
		jpf1.setFont(new Font("Arial", Font.BOLD, 15));
	    frame2.add(jpf1);
	    
	    
	    JLabel lb9 = new JLabel("EmailAddress:");
	    lb9.setBounds(380, 255, 150, 70);
	    lb9.setFont(new Font("Arial", Font.BOLD, 20));
	    lb9.setForeground(Color.white);
	    frame2.add(lb9);
	    
	    JTextField jtf2= new JTextField();
	    jtf2.setBounds(520,270,200,40);
		jtf2.setFont(new Font("Arial", Font.BOLD, 15));
	    frame2.add(jtf2);
	    
	    
	    JButton jbt3 = new JButton("Register");
	    jbt3.setBounds(570,350,100,40);
		jbt3.setFont(new Font("Arial", Font.BOLD, 15));
	    frame2.add(jbt3);
	    
	    jbt3.addActionListener(new ActionListener()
		{
	      public void actionPerformed(ActionEvent e)
	      {
	    	  try
	    	  {
	    		  Class.forName("com.mysql.jdbc.Driver");
	    		  Connection c1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_user","root","");
	    		  String query = "insert into user_info values(?,?,?)";
	    		  //String query = "insert into user_info (Username, Password, Email)values(?,?,?)";
	    		  PreparedStatement ps = c1.prepareStatement(query);
	    		 
	    		  ps.setString(1,jtf1.getText() );
	    		  ps.setString(2,jpf1.getText() );
	    		  ps.setString(3,jtf2.getText() );
	    		 int i = ps.executeUpdate();
	    		 
	    		 ps.close();
	    		 c1.close();
	    		 frame2.dispose();
	    		 JOptionPane.showMessageDialog(null,"Registration Succesful ");
	    		 new LogReg().login();
	    		 
	    		 
	    		 
	    		 
 		  	    		  
	    	  }
	    	  
	    	  catch(Exception ex1)
	    	  {
	    		  ex1.printStackTrace();
	    		  
	    		  
	    	  }
	    	  
	      }
	      
		} );  
	    
	     
	    
	    frame2.setVisible(true);
		
		
		
		
	}
	
	
	
	
	
	
	
}

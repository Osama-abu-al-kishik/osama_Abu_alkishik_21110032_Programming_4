package eventDriven;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		
		
		
		JFrame frame1 = new JFrame ( "Enter your name and password to play the picture game " );
		frame1.setSize ( 500 , 500 );
		frame1.setLocationRelativeTo ( null );
		frame1.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
		
		
		JLabel label1 = new JLabel ( " username " );
		JTextField field1 = new JTextField ( 40 );
		JLabel label2 = new JLabel ( " password " );
		JPasswordField field2 = new JPasswordField ( 40 );
		
		JButton login = new JButton ( " login " );
		
		
		//--------------------------------------------------------------------------------------------------------------------------

		
		login.addActionListener ( new ActionListener ( )
		{
			//override
			public void actionPerformed ( ActionEvent e )
			{
				String username = field1.getText ( );
				String password = new String (field2.getPassword ( ) );
				System.out.println ( username ) ;
				System.out.println ( password ) ; 
			
			
							if ( username.equalsIgnoreCase ( "osama" ) && password.equals ( "123" ) )
							{
			
								JFrame frame2 = new JFrame ( "Tom and Jerry" );
								frame2.setSize(500, 500);
								frame2.setVisible ( true ) ;
								frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 3
								frame2.setLayout(null);
								
								
								
								Icon icon = new ImageIcon ("C:\\Users\\User\\Desktop\\Tom_and_Jerry.png" ) ; 
								JButton btn3 = new JButton ( icon ) ;
								btn3.setBounds ( 100 , 10 , icon.getIconWidth ( ) , icon.getIconHeight () );
								frame2.add(btn3);
								
								
								
								JLabel label1 = new JLabel("What character do you want to see?");
								frame2.add(label1);
								label1.setBounds(120,150,300,200);
								
								
								
								JButton btn1 = new JButton("Tom");
								frame2.add(btn1);
								btn1.setBounds(70, 320, 120, 80);
								btn1.setBackground(Color.blue);
								btn1.setForeground(Color.WHITE);
								
								
								JButton btn2 = new JButton("Jerry");
								frame2.add(btn2);
								btn2.setBounds(270, 320, 120, 80);
								btn2.setBackground(Color.orange);
								btn2.setForeground(Color.WHITE);
								
								
								
		//--------------------------------------------------------------------------------------------------------------------------
		
								btn1.addActionListener ( new ActionListener ( )
								{
									//override
									public void actionPerformed ( ActionEvent e )
									{
								
								
									JFrame frame3 = new JFrame ( "Choose" );
									frame3.setSize(500, 500);
									frame3.setVisible ( true ) ;
									frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 3
									frame3.setLayout(null);
									
									
									
									JButton btn1 = new JButton("Happy Tom");
									frame3.add(btn1);
									btn1.setBounds(150, 110, 170, 80);
									btn1.setBackground(Color.yellow);
									btn1.setForeground(Color.black);
									
									
									JButton btn2 = new JButton("Tom salutes");
									frame3.add(btn2);
									btn2.setBounds(150, 270, 170, 80);
									btn2.setBackground(Color.green);
									btn2.setForeground(Color.black);
									
	//--------------------------------------------------------------------------------------------------------------------------
							
									btn1.addActionListener ( new ActionListener ( )
									{
										//override
										public void actionPerformed ( ActionEvent e )
										{
											
											
											JFrame frame4 = new JFrame ( "Happy" );
											frame4.setSize(500, 500);
											frame4.setVisible ( true ) ;
											frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 3
											frame4.setLayout(null);
									
											Icon icon = new ImageIcon ("C:\\Users\\User\\Desktop\\Tom_happy.jpg" ) ; 
											JButton btn1 = new JButton ( icon ) ;
											btn1.setBounds ( 100 , 10 , icon.getIconWidth ( ) , icon.getIconHeight () );
											frame4.add(btn1);
									
										}
									});
								
	//--------------------------------------------------------------------------------------------------------------------------
								
									
									
									
									btn2.addActionListener ( new ActionListener ( )
									{
										//override
										public void actionPerformed ( ActionEvent e )
										{
											
											
											JFrame frame5 = new JFrame ( "Tom salutes" );
											frame5.setSize(500, 500);
											frame5.setVisible ( true ) ;
											frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 3
											frame5.setLayout(null);
									
											Icon icon = new ImageIcon ("C:\\Users\\User\\Desktop\\Tom_hits_the_salute.png" ) ; 
											JButton btn1 = new JButton ( icon ) ;
											btn1.setBounds ( 100 , 10 , icon.getIconWidth ( ) , icon.getIconHeight () );
											frame5.add(btn1);
									
										}
									});
									
									
									
									}
								});

									
	//--------------------------------------------------------------------------------------------------------------------------
		
								
								btn2.addActionListener ( new ActionListener ( )
								{
									//override
									public void actionPerformed ( ActionEvent e )
									{
								
								
										JFrame frame6 = new JFrame ( "Choose" );
										frame6.setSize(500, 500);
										frame6.setVisible ( true ) ;
										frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 3
										frame6.setLayout(null);
										
										
										JButton btn1 = new JButton("happy Jerry");
										frame6.add(btn1);
										btn1.setBounds(150, 110, 170, 80);
										btn1.setBackground(Color.yellow);
										btn1.setForeground(Color.black);
										
										
										JButton btn2 = new JButton("fraid Jerry");
										frame6.add(btn2);
										btn2.setBounds(150, 270, 170, 80);
										btn2.setBackground(Color.green);
										btn2.setForeground(Color.black);
										
										
	//--------------------------------------------------------------------------------------------------------------------------

										
										
										btn1.addActionListener ( new ActionListener ( )
										{
											//override
											public void actionPerformed ( ActionEvent e )
											{
												
												
												JFrame frame7 = new JFrame ( "happy Jerry" );
												frame7.setSize(500, 500);
												frame7.setVisible ( true ) ;
												frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 3
												frame7.setLayout(null);
										
												Icon icon = new ImageIcon ("C:\\Users\\User\\Desktop\\jerry_happy.png" ) ; 
												JButton btn1 = new JButton ( icon ) ;
												btn1.setBounds ( 100 , 10 , icon.getIconWidth ( ) , icon.getIconHeight () );
												frame7.add(btn1);
										
											}
										});
										
										
	//--------------------------------------------------------------------------------------------------------------------------
	
										
										
										btn2.addActionListener ( new ActionListener ( )
										{
											//override
											public void actionPerformed ( ActionEvent e )
											{
												
												
												JFrame frame8 = new JFrame ( "fraid Jerry" );
												frame8.setSize(500, 500);
												frame8.setVisible ( true ) ;
												frame8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 3
												frame8.setLayout(null);
										
												Icon icon = new ImageIcon ("C:\\Users\\User\\Desktop\\Jerry_is_afraid.jpg" ) ; 
												JButton btn1 = new JButton ( icon ) ;
												btn1.setBounds ( 100 , 10 , icon.getIconWidth ( ) , icon.getIconHeight () );
												frame8.add(btn1);
										
											}
										});
										
										
	//--------------------------------------------------------------------------------------------------------------------------
				
										
										
										
											
									}
								});
								
								
							}
							
							
							else 
							{
								JOptionPane.showMessageDialog ( null , " invalid username or password " ) ;
							}
							
							
			}
			
			
						});
		
		frame1.add ( label1 ) ;
		frame1.add ( field1 ) ; 
		frame1.add ( label2 ) ; 
		frame1.add (field2); 
		frame1.add ( login ) ; 
		frame1.setLayout (new FlowLayout()); 
		frame1.setVisible ( true ) ;

}

}

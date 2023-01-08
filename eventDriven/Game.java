package eventDriven;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Game {

	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame ( " JFrame Demo " ) ; 
		String [ ] message = { " Apple " , " Orange " , " Banana " } ;
		Random ran = new Random ( ) ;
		JLabel label = new JLabel ( message [ ran.nextInt ( 3 ) ] ) ;
		
		
		
		
		ImageIcon icon = new ImageIcon ("C:\\Users\\User\\Downloads\\apple.png " ) ; 
		JButton button1 = new JButton ( icon ) ;
	
		ImageIcon icon2 = new ImageIcon ( "C:\\Users\\User\\Downloads\\Orange.png " ) ;
		JButton button2 = new JButton ( icon2 ) ;
		
		ImageIcon icon3 = new ImageIcon ( "C:\\Users\\User\\Downloads\\Banana.png " ) ; 
		JButton button3 = new JButton ( icon3 ) ;
		
		JButton button4 = new JButton ( " Play again " ) ; 
		
		button1.setBounds ( 50 , 50 , icon.getIconWidth ( ) , icon.getIconHeight ( ) );
		button2.setBounds ( 50 , 50 , icon.getIconWidth ( ) , icon.getIconHeight ( ) ); 
		button3.setBounds ( 50 , 50 , icon.getIconWidth ( ) , icon.getIconHeight ( ) );
		
		
		button1.addActionListener ( new ActionListener( ) { 
			public void actionPerformed ( ActionEvent e ) 
			{ 
				
				
		if( label.getText( ) == ( " Apple " ) )
		{
				
			JOptionPane.showMessageDialog ( null , " Apple " ) ;
		}
		
		else
		{
			JOptionPane.showMessageDialog ( null , " wrong " ) ;
		}
			}

			
		});
		
		
		
		
		
		button2.addActionListener ( new ActionListener( ) { 
			public void actionPerformed ( ActionEvent e ) 
			{
				
				
			if( label.getText( ) == ( " Orang " ) )
			{
					
				JOptionPane.showMessageDialog ( null , " Orang " ) ;
			}
				
				else
				{
					JOptionPane.showMessageDialog ( null , " wrong " ) ;
				}
				
			}
});
	
		
		
		
		
		
		button3.addActionListener ( new ActionListener( ) { 
			public void actionPerformed ( ActionEvent e ) 
			{
				
		
			if( label.getText( ) == ( " Banana " ) )
			{
					
				JOptionPane.showMessageDialog ( null , " Banana " ) ;
			}
				
				
				else
				{
					JOptionPane.showMessageDialog ( null , " wrong " ) ;
				}
				
			}
		});
		
		
		
		
		
		button4.addActionListener ( new ActionListener( ) { 
			public void actionPerformed ( ActionEvent e ) 
			{

				label.setText(message[ran.nextInt(3)]);	
				
			}
		});
		
		
		
		JPanel panel = new JPanel ( ) ; 
		
		panel.add(label);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		
		frame.add(panel);
		frame.setSize(600, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 3
		frame.setLayout(new FlowLayout());
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
}
		
		

	}



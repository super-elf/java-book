package borderLayoutDemo;

import java.awt.*;			//使用BorderLayout必須載入awt套件
import javax.swing.*;		//載入swing套件

class MyJFrame extends JFrame{
	private JPanel contentPane;
	MyJFrame(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
		setBounds(100, 100, 450, 300);                       
		contentPane = new JPanel();                          
		contentPane.setLayout(new BorderLayout(0, 0));       
		setContentPane(contentPane);                         
		                                                    
		JButton btnNorth = new JButton("NORTH");    
		contentPane.add(btnNorth, BorderLayout.NORTH);   
		                                                     
		JButton btnWest = new JButton("WEST");  
		contentPane.add(btnWest, BorderLayout.WEST);  
		                                                     
		JButton btnEast = new JButton("EAST");  
		contentPane.add(btnEast, BorderLayout.EAST);  
		                                                     
		JButton btnCenter = new JButton("CENTER");  
		contentPane.add(btnCenter,BorderLayout.CENTER);
		                                                    
		JButton btnSouth = new JButton("SOUTH");  
		contentPane.add(btnSouth, BorderLayout.SOUTH); 
			
	    setVisible(true);   
	}
}

public class BorderLayoutDemo {
	public static void main(String[] args) {
		MyJFrame f= new MyJFrame();
	}
}

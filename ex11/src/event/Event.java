package event;

import java.awt.*;
import java.awt.event.*;	//�ϥΨƥ󥲶����Jevent�M��
import javax.swing.*;

class MyJFrame extends JFrame{
	private JPanel contentPane;
	public MyJFrame() {                                   
	 		setTitle("�ƥ�B�z");                                 
	 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
	 		setBounds(100, 100, 300, 200);                        
	 		contentPane = new JPanel();                           
	 		setContentPane(contentPane);                          
	 		contentPane.setLayout(null);                          
		
		    JButton button = new JButton("�ƥ�ӷ�");             
	 		button.addActionListener(new ActionListener() {       
	 			public void actionPerformed(ActionEvent e) {        
		 			JOptionPane.showMessageDialog(null, "�B�z�ƥ�");
	 			}                                                   
	 		});   
	 		button.setBounds(100, 50, 90, 25);                    
	 		contentPane.add(button);    
		    setVisible(true);   
	}                                                       
}

public class Event {
	public static void main(String[] args) {
		MyJFrame f = new MyJFrame();  
	}
}

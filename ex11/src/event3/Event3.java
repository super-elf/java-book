package event3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyJFrame extends JFrame implements ActionListener{
	private JPanel contentPane;
	JButton btn1, btn2;
	public MyJFrame() {                                   
	 		setTitle("事件處理");                                 
	 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
	 		setBounds(100, 100, 300, 200);                        
	 		contentPane = new JPanel();                           
	 		setContentPane(contentPane);                          
	 		contentPane.setLayout(null);                          
		
		    btn1 = new JButton("按鈕1");             
	 		btn1.addActionListener(this);                                   
	 		btn1.setBounds(50, 50, 90, 25);                    
	 		contentPane.add(btn1);   
	 		
		    btn2 = new JButton("按鈕2");             
	 		btn2.addActionListener(this);                                   
	 		btn2.setBounds(150, 50, 90, 25);                    
	 		contentPane.add(btn2);    
		    setVisible(true);   
	}                   
	public void actionPerformed(ActionEvent e) {
		    JButton hitBtn = (JButton)e.getSource();
			JOptionPane.showMessageDialog(null, hitBtn.getText()+
			" - 處理事件");
	}
}

public class Event3 {
	public static void main(String[] args) {
		MyJFrame f= new MyJFrame();
	}
}

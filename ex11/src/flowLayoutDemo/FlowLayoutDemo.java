package flowLayoutDemo;

import java.awt.*;		//�ϥ�FlowLayout�������Jawt�M��
import javax.swing.*;

class MyJFrame extends JFrame{
	private JPanel contentPane;
	public MyJFrame(){                                   
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
		setBounds(100, 100, 450, 300);                       
		contentPane = new JPanel();                          
		setContentPane(contentPane);                         
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			                                                     
		JButton btn1 = new JButton("���s����1");      
		contentPane.add(btn1);                       
	                                                     
		JButton btn2 = new JButton("���s����2");    
		contentPane.add(btn2);                     
		                                                     
		JButton btn3 = new JButton("���s����3");    
		contentPane.add(btn3);                     

		JButton btn4 = new JButton("���s����4");    
		contentPane.add(btn4);             
		
		JButton btn5 = new JButton("���s����5");    
		contentPane.add(btn5);   
	    setVisible(true);   
	}     
}

public class FlowLayoutDemo {
	public static void main(String[] args) {
		MyJFrame f= new MyJFrame();
	}
}

package gridLayoutDemo;

import java.awt.*;			//使用GridLayout必須載入awt套件
import javax.swing.*;

class MyJFrame extends JFrame{
	private JPanel contentPane;
	public MyJFrame() {                                 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
		setBounds(100, 100, 469, 300);                      
		contentPane = new JPanel();                         

		setContentPane(contentPane);                        
		contentPane.setLayout(new GridLayout(2, 3, 5, 10));  

		JButton btn1 = new JButton("按鈕元件1");    
		contentPane.add(btn1);                      

		JButton btn2 = new JButton("按鈕元件2");  
		contentPane.add(btn2);                    

		JButton btn3 = new JButton("按鈕元件3");  
		contentPane.add(btn3);                    

		JButton btn4 = new JButton("按鈕元件4");  
		contentPane.add(btn4);                    
		  
		JButton btn5 = new JButton("按鈕元件5");
		contentPane.add(btn5);       
	    setVisible(true); 
	}                                                     
 }

public class GridLayoutDemo {
	public static void main(String[] args) {
		MyJFrame f= new MyJFrame();
	}
}

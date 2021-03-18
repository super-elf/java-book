package layoutDemo;

import javax.swing.*;		//載入swing套件

class MyJFrame extends JFrame{
	private JPanel contentPane;
	MyJFrame(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
		setBounds(100, 100, 340, 160); 
		contentPane = new JPanel();                         
		 
		setContentPane(contentPane);                        
		contentPane.setLayout(null);                        

		JButton btn1 = new JButton("按鈕元件1");
		btn1.setBounds(10, 10, 96, 23);          
		contentPane.add(btn1);                      
		
		JButton btn2 = new JButton("按鈕元件2");
		btn2.setBounds(114, 10, 96, 23);        
		contentPane.add(btn2);                      
		
		JButton btn3 = new JButton("按鈕元件3");
		btn3.setBounds(218, 10, 96, 23);         
		contentPane.add(btn3);                      
		
		JButton btn[] = new JButton[6];
		for(int x = 0; x < btn.length; x ++) {
			btn[x] = new JButton("按鈕元件" + (x +4));
			btn[x].setBounds(10 + x %  3 * 104, 42 + x / 3 * 32, 96, 23);
			contentPane.add(btn[x]);
		}
		setVisible(true);
	}
}

public class LayoutDemo {
	public static void main(String[] args) {
		MyJFrame f = new MyJFrame(); 
	}
}

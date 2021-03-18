package jFrameDemo;

import javax.swing.*;	//¸ü¤Jswing®M¥ó

class MyJFrame  extends JFrame{
	MyJFrame(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
		setBounds(100, 100, 450, 300);                         
		setTitle("JFrameµøµ¡");  
		setVisible(true);       		
	}
}

public class JFrameDemo {
	public static void main(String[] args) {
		MyJFrame f = new MyJFrame();
	}
}

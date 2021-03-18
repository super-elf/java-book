package jScrollPaneDemo;

import javax.swing.*;

class TextAreaF extends JFrame {
	TextAreaF() { // 預設建構式
		setTitle("捲軸面板");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 260, 250);
		setLayout(null);

		JLabel lbl9X9 = new JLabel("九九乘法表：");
		add(lbl9X9);
		lbl9X9.setBounds(5, 5, 80, 30);
		
		String st = "";
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++)
				st += i + "*" + j + "=" + i * j + "\n";
			st += "\n";
		}
		JTextArea txtST = new JTextArea(st);
		txtST.setLineWrap(true);
		JScrollPane span = new JScrollPane(txtST,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		span.setBounds(100, 7, 140, 200);
		add(span);

       	setVisible(true);
	}
}

public class JScrollPaneDemo {
	public static void main(String[] args) {
		new TextAreaF();
	}
}

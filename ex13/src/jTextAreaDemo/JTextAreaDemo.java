package jTextAreaDemo;

import java.awt.*;
import javax.swing.*;

class TextAreaF extends JFrame {
	TextAreaF() { // �w�]�غc��
		setTitle("�h���r���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 260, 250);
		setLayout(null);

		JLabel lbl9X9 = new JLabel("�E�E���k��G");
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
		add(txtST);
		txtST.setBounds(100, 7, 140, 200);
		txtST.setBorder(BorderFactory.createLineBorder(Color.blue));

       	setVisible(true);
	}
}

public class JTextAreaDemo {
	public static void main(String[] args) {
		new TextAreaF();
	}
}

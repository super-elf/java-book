package jButtonDemo;

import javax.swing.*; //載入swing套件
import java.awt.event.*; //撰寫事件必須匯入此套件
import java.awt.*;

class MyJFrame extends JFrame {
	private JPanel contentPane;
	private JButton btnGreen, btnYellow;

	public MyJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 150);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnGreen = new JButton("綠色");
		btnGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.setBackground(Color.GREEN);
				;
			}
		});
		btnGreen.setBounds(40, 60, 80, 25);
		contentPane.add(btnGreen);

		btnYellow = new JButton("黃色");
		btnYellow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.YELLOW);
			}
		});
		btnYellow.setBounds(160, 60, 80, 25);
		contentPane.add(btnYellow);

		setVisible(true);
	}
}

public class JButtonDemo {
	public static void main(String[] args) {
		MyJFrame f = new MyJFrame();
	}
}

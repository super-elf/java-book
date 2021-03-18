package jLabelDemo;

import javax.swing.*; //載入swing套件

class MyJFrame extends JFrame {
	private JPanel contentPane;
	String[] imgName = new String[] { "無尾熊", "水母", "企鵝" };
	JLabel[] lbl = new JLabel[imgName.length];
	JLabel[] lblImg = new JLabel[imgName.length];

	MyJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 250);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

		for (int i = 0; i < imgName.length; i++) {
			lblImg[i] = new JLabel();
			lblImg[i].setIcon(new ImageIcon("..\\ex12\\" + imgName[i] + ".jpg"));
			lblImg[i].setBounds(i * 200 + 20, 30, 180, 135);
			contentPane.add(lblImg[i]);
			lbl[i] = new JLabel(imgName[i]);
			lbl[i].setBounds(i * 200 + 100, 180, 50, 20);
			contentPane.add(lbl[i]);
		}
		setVisible(true);
	}
}

public class JLabelDemo {
	public static void main(String[] args) {
		MyJFrame f = new MyJFrame();
	}
}

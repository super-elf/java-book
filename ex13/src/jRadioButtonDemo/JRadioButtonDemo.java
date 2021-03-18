package jRadioButtonDemo;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

class InterFrame extends JFrame {
	InterFrame() { // �w�]�غc��
		setTitle("JRadioButtonDemo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 300, 200);
		setLayout(null);

		JPanel panSex = new JPanel();
		add(panSex);
		panSex.setBounds(20, 20, 80, 120);
		Border lineB = BorderFactory.createLineBorder(Color.black);
		panSex.setBorder(BorderFactory.createTitledBorder(lineB, "�ʧO"));
		panSex.setLayout(new FlowLayout(FlowLayout.LEFT));
		ButtonGroup group = new ButtonGroup();
		JRadioButton[] rdb = new JRadioButton[2];
		rdb[0] = new JRadioButton("�k", true);
		rdb[1] = new JRadioButton("�k");
		for (int i = 0; i < rdb.length; i++) {
			group.add(rdb[i]);
			panSex.add(rdb[i]);
		}

		setVisible(true);
	}
}

public class JRadioButtonDemo {
	public static void main(String[] args) {
		new InterFrame(); // ���榹��|�۰ʰ����7-29�� InterFrame()�w�]�غc��
	}
}

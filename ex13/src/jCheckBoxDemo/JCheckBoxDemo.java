package jCheckBoxDemo;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

class InterFrame extends JFrame {
	InterFrame() { // �w�]�غc��
		setTitle("JCheckBoxDemo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 280, 200);
		setLayout(null);

		JPanel panInter = new JPanel();
		add(panInter);
		panInter.setBounds(130, 20, 80, 120);
		Border lineB = BorderFactory.createLineBorder(Color.black);
		panInter.setBorder(BorderFactory.createTitledBorder(lineB, "����"));
		panInter.setLayout(new FlowLayout(FlowLayout.LEFT));
		JCheckBox[] chk = new JCheckBox[3];
		chk[0] = new JCheckBox("����", true);
		chk[1] = new JCheckBox("���N");
		chk[2] = new JCheckBox("��t", true);
		for (int j = 0; j < chk.length; j++)
			panInter.add(chk[j]);

		setVisible(true);
	}
}

public class JCheckBoxDemo {
	public static void main(String[] args) {
		new InterFrame();
	}
}

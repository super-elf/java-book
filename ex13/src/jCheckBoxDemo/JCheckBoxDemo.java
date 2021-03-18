package jCheckBoxDemo;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

class InterFrame extends JFrame {
	InterFrame() { // 預設建構式
		setTitle("JCheckBoxDemo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 280, 200);
		setLayout(null);

		JPanel panInter = new JPanel();
		add(panInter);
		panInter.setBounds(130, 20, 80, 120);
		Border lineB = BorderFactory.createLineBorder(Color.black);
		panInter.setBorder(BorderFactory.createTitledBorder(lineB, "興趣"));
		panInter.setLayout(new FlowLayout(FlowLayout.LEFT));
		JCheckBox[] chk = new JCheckBox[3];
		chk[0] = new JCheckBox("音樂", true);
		chk[1] = new JCheckBox("美術");
		chk[2] = new JCheckBox("表演", true);
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

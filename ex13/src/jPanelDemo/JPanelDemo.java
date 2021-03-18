package jPanelDemo;
import java.awt.*;
import javax.swing.*;

class FlowLayoutP extends JFrame {
	FlowLayoutP() { // �w�]�غc��
		setTitle("JPanelDemo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 280, 200);
		setLayout(null);

		JPanel pan = new JPanel();
		add(pan);
		pan.setBounds(150, 20, 100, 120);
		pan.setBackground(Color.yellow);
		pan.setBorder(BorderFactory.createLineBorder(Color.black));
		pan.setLayout(new FlowLayout(FlowLayout.LEFT));

		String st[] = { "���s1", "���s2", "���s3" };
		JButton btn[] = new JButton[st.length]; // �إ߫��s�}�C����
		for (int i = 0; i < st.length; i++) {
			btn[i] = new JButton(st[i]);
			pan.add(btn[i]); // �N���s����̧ǥ[�J pan���O����
		}

		setVisible(true);
	}
}

public class JPanelDemo {
	public static void main(String[] args) {
		new FlowLayoutP(); 
	}
}

package borderDemo;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

class BorderJPanel extends JFrame {
	BorderJPanel() { // �w�]�غc��
		setTitle("BorderDemo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 280, 200);
		setLayout(null);

		JPanel pan = new JPanel(); // �����ݩ� JPanel���O��pan���O����
		add(pan); // �s�Wpan���O���������W
		pan.setBounds(150, 20, 100, 120);
		Border lineB = BorderFactory.createLineBorder(Color.black);
		pan.setBorder(BorderFactory.createTitledBorder(lineB, "�ج["));

		setVisible(true);
	}
}

public class BorderDemo {
	public static void main(String[] args) {
		new BorderJPanel(); 
	}
}

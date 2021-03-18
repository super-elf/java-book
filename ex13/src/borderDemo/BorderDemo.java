package borderDemo;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

class BorderJPanel extends JFrame {
	BorderJPanel() { // 預設建構式
		setTitle("BorderDemo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 280, 200);
		setLayout(null);

		JPanel pan = new JPanel(); // 產生屬於 JPanel類別的pan面板物件
		add(pan); // 新增pan面板物件於視窗上
		pan.setBounds(150, 20, 100, 120);
		Border lineB = BorderFactory.createLineBorder(Color.black);
		pan.setBorder(BorderFactory.createTitledBorder(lineB, "框架"));

		setVisible(true);
	}
}

public class BorderDemo {
	public static void main(String[] args) {
		new BorderJPanel(); 
	}
}

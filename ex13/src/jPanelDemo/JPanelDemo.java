package jPanelDemo;
import java.awt.*;
import javax.swing.*;

class FlowLayoutP extends JFrame {
	FlowLayoutP() { // 預設建構式
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

		String st[] = { "按鈕1", "按鈕2", "按鈕3" };
		JButton btn[] = new JButton[st.length]; // 建立按鈕陣列元件
		for (int i = 0; i < st.length; i++) {
			btn[i] = new JButton(st[i]);
			pan.add(btn[i]); // 將按鈕元件依序加入 pan面板物件
		}

		setVisible(true);
	}
}

public class JPanelDemo {
	public static void main(String[] args) {
		new FlowLayoutP(); 
	}
}

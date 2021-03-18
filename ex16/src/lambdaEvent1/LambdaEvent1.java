package lambdaEvent1;

import java.awt.event.*; //使用事件必須載入event套件
import javax.swing.*; //撰寫Swing視窗必須載入

class MyJFrame extends JFrame { // MyJFrame繼承自JFrame
	private JPanel contentPane; // 宣告JPanel容器物件contentPane
	// MyJFrame建構式

	public MyJFrame() {
		setTitle("事件處理"); // 指定視窗標題
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 200, 150); // 指定視窗位置和大小
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null); // 不使用版面配置
		// 建立button按鈕
		JButton button = new JButton("事件來源");
		// 註冊button事件傾聽者
		// 並實作ActionListener傾聽者物件的actionPerformed()方法
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 顯示對話方塊
				JOptionPane.showMessageDialog(null, "處理事件");
			}
		});

		button.setBounds(50, 40, 90, 25); // 指定按鈕的位置與大小
		contentPane.add(button); // button按鈕放入容器中
		setVisible(true); // 顯示視窗
	}
}

public class LambdaEvent1 {
	public static void main(String[] args) {
		MyJFrame f = new MyJFrame();
	}
}

package animalDemo;

import javax.swing.*; //載入swing套件
import java.awt.event.*; //撰寫事件必須匯入此套件

class MyJFrame extends JFrame {
	private JPanel contentPane;
	String[] imgName = new String[] { "無尾熊", "水母", "企鵝" };
	JButton btnPrev, btnNext;
	JLabel lblName, lblImg, lblShow;
	int n = 0;

	MyJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 230, 310);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblImg = new JLabel();
		lblImg.setIcon(new ImageIcon("..\\ex12\\" + imgName[n] + ".jpg"));
		lblImg.setBounds(20, 20, 180, 135);
		contentPane.add(lblImg);

		lblName = new JLabel(imgName[n]);
		lblName.setBounds(20, 170, 180, 25);
		contentPane.add(lblName);

		String show = "第" + (n + 1) + "張,共" + imgName.length + "張";
		lblShow = new JLabel(show);
		lblShow.setBounds(20, 200, 180, 25);
		contentPane.add(lblShow);

		btnPrev = new JButton("上一張");
		btnPrev.setBounds(20, 230, 80, 25);
		contentPane.add(btnPrev);
		btnPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n--;
				if (n < 0) {
					n = imgName.length - 1;
				}
				lblImg.setIcon(new ImageIcon("..\\ex12\\" + imgName[n] + ".jpg"));
				lblName.setText(imgName[n]);
				lblShow.setText("第" + (n + 1) + "張,共" + imgName.length + "張");
			}
		});

		btnNext = new JButton("下一張");
		btnNext.setBounds(120, 230, 80, 25);
		contentPane.add(btnNext);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n++;
				if (n >= imgName.length) {
					n = 0;
				}
				lblImg.setIcon(new ImageIcon("..\\ex12\\" + imgName[n] + ".jpg"));
				lblName.setText(imgName[n]);
				lblShow.setText("第" + (n + 1) + "張,共" + imgName.length + "張");
			}
		});

		setVisible(true);
	}
}

public class AnimalDemo {
	public static void main(String[] args) {
		MyJFrame f = new MyJFrame();
	}
}

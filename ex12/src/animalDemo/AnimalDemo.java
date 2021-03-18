package animalDemo;

import javax.swing.*; //���Jswing�M��
import java.awt.event.*; //���g�ƥ󥲶��פJ���M��

class MyJFrame extends JFrame {
	private JPanel contentPane;
	String[] imgName = new String[] { "�L����", "����", "���Z" };
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

		String show = "��" + (n + 1) + "�i,�@" + imgName.length + "�i";
		lblShow = new JLabel(show);
		lblShow.setBounds(20, 200, 180, 25);
		contentPane.add(lblShow);

		btnPrev = new JButton("�W�@�i");
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
				lblShow.setText("��" + (n + 1) + "�i,�@" + imgName.length + "�i");
			}
		});

		btnNext = new JButton("�U�@�i");
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
				lblShow.setText("��" + (n + 1) + "�i,�@" + imgName.length + "�i");
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

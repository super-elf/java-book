package lambdaEvent1;

import java.awt.event.*; //�ϥΨƥ󥲶����Jevent�M��
import javax.swing.*; //���gSwing�����������J

class MyJFrame extends JFrame { // MyJFrame�~�Ӧ�JFrame
	private JPanel contentPane; // �ŧiJPanel�e������contentPane
	// MyJFrame�غc��

	public MyJFrame() {
		setTitle("�ƥ�B�z"); // ���w�������D
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 200, 150); // ���w������m�M�j�p
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null); // ���ϥΪ����t�m
		// �إ�button���s
		JButton button = new JButton("�ƥ�ӷ�");
		// ���Ubutton�ƥ��ť��
		// �ù�@ActionListener��ť�̪���actionPerformed()��k
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ��ܹ�ܤ��
				JOptionPane.showMessageDialog(null, "�B�z�ƥ�");
			}
		});

		button.setBounds(50, 40, 90, 25); // ���w���s����m�P�j�p
		contentPane.add(button); // button���s��J�e����
		setVisible(true); // ��ܵ���
	}
}

public class LambdaEvent1 {
	public static void main(String[] args) {
		MyJFrame f = new MyJFrame();
	}
}

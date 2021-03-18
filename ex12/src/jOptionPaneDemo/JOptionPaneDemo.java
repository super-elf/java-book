package jOptionPaneDemo;

import javax.swing.*;
import java.awt.event.*;

class MyJFrame extends JFrame {
	private JPanel contentPane;
	private JTextField txtId, txtPwd;
	private JLabel lblId, lblPwd;
	private JButton btnLogin;

	MyJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 280, 180);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtId = new JTextField();
		txtId.setToolTipText("�п�J�b��");
		txtId.setColumns(20);
		txtId.setBounds(100, 20, 120, 25);
		contentPane.add(txtId);

		txtPwd = new JTextField();
		txtPwd.setToolTipText("�п�J�K�X");
		txtPwd.setColumns(20);
		txtPwd.setBounds(100, 60, 120, 25);
		contentPane.add(txtPwd);

		lblId = new JLabel("�b���G");
		lblId.setBounds(50, 25, 100, 15);
		contentPane.add(lblId);

		lblPwd = new JLabel("�K�X�G");
		lblPwd.setBounds(50, 65, 100, 15);
		contentPane.add(lblPwd);

		btnLogin = new JButton("�n�J");
		btnLogin.setBounds(100, 100, 80, 25);
		contentPane.add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtId.getText().equals("gotop") && txtPwd.getText().equals("168")) {
					int isOk = JOptionPane.showConfirmDialog(null, "�n�J���\�A�O�_�e���֮p�x��", "�n�J�@�~", JOptionPane.YES_NO_OPTION,
							JOptionPane.INFORMATION_MESSAGE);
					if (isOk == 1)
						return; // ���U [�_] ���}
					try {
						Runtime runtime = Runtime.getRuntime();
						Process process = runtime.exec("C:\\Program Files (x86)" 
						        + "\\Google\\Chrome\\Application"
								+ "\\chrome.exe http://www.gotop.com.tw");
					} catch (Exception ex) {
					}
				} else {
					JOptionPane.showMessageDialog(null, "�b�K���~", "�n�J�@�~", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		setVisible(true);
	}
}

public class JOptionPaneDemo {
	public static void main(String[] args) {
		MyJFrame f = new MyJFrame();
	}
}

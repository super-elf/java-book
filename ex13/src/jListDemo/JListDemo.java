package jListDemo;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

class ListF extends JFrame implements ListSelectionListener {
	private JLabel lblCity = new JLabel("��U�a�W�s�G");
	private String[] city = { "�x�_", "�y��", "���", "�x��", "�n��", "����", "�Ÿq" , "����" };
	private String[] spot = { "�����s", "�ӥ��s", "�ԩԤs", "���s", "�X�w�s", "�K���s", "�����s", "�ؤs" };
	
	private JList<String> lst = new JList<>(city);
	private JTextArea txtShow = new JTextArea("�i����a�W...", 3, 14);

	public ListF() { // �w�]�غc��
		setTitle("�U�a�W�s");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 240, 220);
		setLayout(null);

		JPanel panCity = new JPanel();
		add(panCity);
		panCity.setBounds(40, 10, 140, 90);
		panCity.setLayout(new FlowLayout(FlowLayout.LEFT));
		panCity.add(lblCity);
		JScrollPane scrList = new JScrollPane(lst);
		panCity.add(scrList);
		lst.setVisibleRowCount(4);
		lst.addListSelectionListener(this);

		JPanel panShow = new JPanel();
		add(panShow);
		panShow.setBounds(20, 110, 180, 100);
		panShow.setLayout(new FlowLayout(FlowLayout.LEFT));
		JScrollPane scrShow = new JScrollPane(txtShow, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panShow.add(scrShow);

		setVisible(true);
	}

	public void valueChanged(ListSelectionEvent e) {
		ArrayList<String> values = new ArrayList<>(lst.getSelectedValuesList());
		int[] indices = lst.getSelectedIndices();
		String show = "";
		int i = 0;
		for (String s : values) {
			show += s + " �W�s�G�@" + spot[indices[i]] + "\n";
			i++;
		}
		txtShow.setText(show);
	}
}

public class JListDemo {
	public static void main(String[] args) {
		new ListF(); 
	}
}

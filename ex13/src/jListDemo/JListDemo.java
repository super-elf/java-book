package jListDemo;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

class ListF extends JFrame implements ListSelectionListener {
	private JLabel lblCity = new JLabel("找各地名山：");
	private String[] city = { "台北", "宜蘭", "桃園", "台中", "南投", "彰化", "嘉義" , "高雄" };
	private String[] spot = { "陽明山", "太平山", "拉拉山", "梨山", "合歡山", "八卦山", "阿里山", "壽山" };
	
	private JList<String> lst = new JList<>(city);
	private JTextArea txtShow = new JTextArea("可選取地名...", 3, 14);

	public ListF() { // 預設建構式
		setTitle("各地名山");
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
			show += s + " 名山：　" + spot[indices[i]] + "\n";
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

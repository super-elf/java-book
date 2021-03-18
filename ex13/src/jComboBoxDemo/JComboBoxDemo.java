package jComboBoxDemo;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ComboF extends JFrame implements ItemListener, ActionListener {
   private JLabel lblName = new JLabel("書目：");
   private String[] book = {"西遊記", "三國演義", "紅樓夢"};
   private JComboBox<String> cbo = new JComboBox<>(book);
   private JLabel lblShow = new JLabel("可選取、新增、刪除書目...");
  private JButton btnAdd = new JButton("新增");
   private JButton btnDel = new JButton("刪除");

   public ComboF() {      // 預設建構式
     setTitle("圖書管理");
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setBounds(50, 50, 235, 240);
     setLayout(null);

     JPanel panBook = new JPanel();
     add(panBook);
     panBook.setBounds(10, 10, 100, 120);
     panBook.setLayout(new FlowLayout(FlowLayout.LEFT));
     panBook.add(lblName);
     panBook.add(cbo);
     cbo.addItemListener(this);

     JPanel panBtn = new JPanel();
     add(panBtn);
     panBtn.setBounds(140, 60, 85, 70);
     panBtn.setLayout(new FlowLayout(FlowLayout.LEFT));
     panBtn.add(btnAdd);
     panBtn.add(btnDel);
     btnAdd.addActionListener(this);
     btnDel.addActionListener(this);

     add(lblShow);
     lblShow.setBounds(10, 160, 200, 30);
     lblShow.setBorder(BorderFactory.createLineBorder(Color.red));

     setVisible(true);
   }

   public void itemStateChanged(ItemEvent e) {
     Object show = cbo.getSelectedItem();
     int index = cbo.getSelectedIndex();
     lblShow.setText(show + "，index = " + index);
   }

   public void actionPerformed(ActionEvent e) {
     if (e.getSource() == btnAdd) {
       String bookName = JOptionPane.showInputDialog("請輸入書目名稱");
       cbo.addItem(bookName);
       lblShow.setText("加入書目 " + bookName + " 至最後一筆");
     }
     if (e.getSource() == btnDel) {
       Object select = cbo.getSelectedItem();
       cbo.removeItem(select);
       lblShow.setText("刪除 " + select + " 書目");
     }
   }
 }

public class JComboBoxDemo {
	   public static void main(String[] args) {
		     new ComboF();     // 執行此行會自動執行第14-61行 ComboF()預設建構式
		   }
}

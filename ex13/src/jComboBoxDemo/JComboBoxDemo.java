package jComboBoxDemo;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ComboF extends JFrame implements ItemListener, ActionListener {
   private JLabel lblName = new JLabel("�ѥءG");
   private String[] book = {"��C�O", "�T��t�q", "���ӹ�"};
   private JComboBox<String> cbo = new JComboBox<>(book);
   private JLabel lblShow = new JLabel("�i����B�s�W�B�R���ѥ�...");
  private JButton btnAdd = new JButton("�s�W");
   private JButton btnDel = new JButton("�R��");

   public ComboF() {      // �w�]�غc��
     setTitle("�ϮѺ޲z");
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
     lblShow.setText(show + "�Aindex = " + index);
   }

   public void actionPerformed(ActionEvent e) {
     if (e.getSource() == btnAdd) {
       String bookName = JOptionPane.showInputDialog("�п�J�ѥئW��");
       cbo.addItem(bookName);
       lblShow.setText("�[�J�ѥ� " + bookName + " �̫ܳ�@��");
     }
     if (e.getSource() == btnDel) {
       Object select = cbo.getSelectedItem();
       cbo.removeItem(select);
       lblShow.setText("�R�� " + select + " �ѥ�");
     }
   }
 }

public class JComboBoxDemo {
	   public static void main(String[] args) {
		     new ComboF();     // ���榹��|�۰ʰ����14-61�� ComboF()�w�]�غc��
		   }
}

package interest;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;

 class InterFrame extends JFrame implements ActionListener {
   private Border lineB = BorderFactory.createLineBorder(Color.black);
   private JRadioButton[] rdb = new JRadioButton[2];
   private JCheckBox[] chk = new JCheckBox[3];
   private JLabel lblShow = new JLabel("�п�� �ʧO�B�\�I...");

   InterFrame() {              // �w�]�غc��
     setTitle("�p�Y�p�Y��");
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setBounds(50, 50, 250, 240);
     setLayout(null);

     JPanel panSex = new JPanel();
     add(panSex);
     panSex.setBounds(30, 20, 80, 120);
     panSex.setBorder(BorderFactory.createTitledBorder(lineB, "�ʧO"));
     panSex.setLayout(new FlowLayout(FlowLayout.LEFT));
     ButtonGroup group = new ButtonGroup();
     rdb[0] = new JRadioButton("�k", true);
     rdb[1] = new JRadioButton("�k");
     for(int i = 0; i < rdb.length; i++) {
       group.add(rdb[i]);
       panSex.add(rdb[i]);
       rdb[i].addActionListener(this);
     }

     JPanel panInter = new JPanel();
     add(panInter);
     panInter.setBounds(130, 20, 80, 120);
     panInter.setBorder(BorderFactory.createTitledBorder(lineB, "�\�I"));
     panInter.setLayout(new FlowLayout(FlowLayout.LEFT));
     chk[0] = new JCheckBox("�J��");
     chk[1] = new JCheckBox("�o��");
     chk[2] = new JCheckBox("���{");
     for(int j = 0; j < chk.length; j++) {
       panInter.add(chk[j]);
       chk[j].addActionListener(this);
     }

     add(lblShow);
     lblShow.setBounds(20, 160, 200, 30);
     lblShow.setBorder(lineB);

     setVisible(true);
   }

   public void actionPerformed(ActionEvent e) {
     String stShow = "";
     if (rdb[0].isSelected()) stShow += "�ӭ��A�A";
       else stShow += "���k�A�p";

     if (!(chk[0].isSelected() || chk[1].isSelected() || chk[2].isSelected()))
       stShow += "�Q�Y����H";
     else {
       String inter = "";
       if (chk[0].isSelected()) inter += chk[0].getText() + " ";
       if (chk[1].isSelected()) inter += chk[1].getText() + " ";
       if (chk[2].isSelected()) inter += chk[2].getText();
       stShow += "�I���O " + inter;
     }
     lblShow.setText(stShow);
   }
 }

public class Interest {
	   public static void main(String[] args) {
		     new InterFrame();     
	   }
}

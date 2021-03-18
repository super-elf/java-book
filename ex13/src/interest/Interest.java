package interest;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;

 class InterFrame extends JFrame implements ActionListener {
   private Border lineB = BorderFactory.createLineBorder(Color.black);
   private JRadioButton[] rdb = new JRadioButton[2];
   private JCheckBox[] chk = new JCheckBox[3];
   private JLabel lblShow = new JLabel("請選擇 性別、餐點...");

   InterFrame() {              // 預設建構式
     setTitle("小吃小吃店");
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setBounds(50, 50, 250, 240);
     setLayout(null);

     JPanel panSex = new JPanel();
     add(panSex);
     panSex.setBounds(30, 20, 80, 120);
     panSex.setBorder(BorderFactory.createTitledBorder(lineB, "性別"));
     panSex.setLayout(new FlowLayout(FlowLayout.LEFT));
     ButtonGroup group = new ButtonGroup();
     rdb[0] = new JRadioButton("男", true);
     rdb[1] = new JRadioButton("女");
     for(int i = 0; i < rdb.length; i++) {
       group.add(rdb[i]);
       panSex.add(rdb[i]);
       rdb[i].addActionListener(this);
     }

     JPanel panInter = new JPanel();
     add(panInter);
     panInter.setBounds(130, 20, 80, 120);
     panInter.setBorder(BorderFactory.createTitledBorder(lineB, "餐點"));
     panInter.setLayout(new FlowLayout(FlowLayout.LEFT));
     chk[0] = new JCheckBox("蛋餅");
     chk[1] = new JCheckBox("油條");
     chk[2] = new JCheckBox("飯糰");
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
     if (rdb[0].isSelected()) stShow += "帥哥，你";
       else stShow += "美女，妳";

     if (!(chk[0].isSelected() || chk[1].isSelected() || chk[2].isSelected()))
       stShow += "想吃什麼？";
     else {
       String inter = "";
       if (chk[0].isSelected()) inter += chk[0].getText() + " ";
       if (chk[1].isSelected()) inter += chk[1].getText() + " ";
       if (chk[2].isSelected()) inter += chk[2].getText();
       stShow += "點的是 " + inter;
     }
     lblShow.setText(stShow);
   }
 }

public class Interest {
	   public static void main(String[] args) {
		     new InterFrame();     
	   }
}

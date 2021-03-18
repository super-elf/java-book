package memory;

import java.awt.*;			//�ϥ�Font���O�жפJjava.awt.*�M��
import java.awt.event.*;	//�ϥΨƥ�жפJjava.awt.event.*�M��
import javax.swing.*;		//�ϥ�swing����жפJjavax.swing.*�M��

//MyJFrame(�O�Фj����C������)�~��JFrame��������
class MyJFrame extends JFrame  {
    // �ŧi icons[0]~icons[4] �ΨӦs��
	// 0.jpg(? �ݸ���), 1.jpg, 2.jpg, 3.jpg, 4.jpg���ӹϥ�
    private ImageIcon[] icons = new ImageIcon[5];
    // �ŧijbtn[0]~jbtn[7] �K�ӫ��s
    private JButton[] jbtn = new JButton[8];
    // �ŧijbtnOk�T�w�s, jbtnf ��ܲĤ@�����U�����s, jbtns ��ܲĤG�����U�����s
    private JButton jbtnOk, jbtnf, jbtns;
    // �ŧif��ܲĤ@�����U���s���o���r��As��ܲĤG�����U���s���o���r��
    String f="", s="";
    // �ŧinum��ܫ��U���s�����ơFwin ��ܦ@�q��X�չϥ�
    int num=0, win=0;
    // �إ�rnd[0]~rnd[7]�ΨӦs��O�Фj����C�i�ϩҥN���s��
	int[] rnd = new int[8];
	// MyJFrame�غc��
    MyJFrame()
    {
   	     // ���ϥΪ����t�m
   	     super.setLayout(null);
   	     // �������D�]�� "�O�Фj����"
    	 super.setTitle("�O�Фj����");
       	 // �]�wicons[0]~icons[4]���󪺹ϥܬ�memberImg��Ƨ��U��0.jpg~4.jpg
    	 // �䤤0.jpg��?�ݸ���
    	 for(int i=0; i<icons.length; i++){
    		 icons[i] = new ImageIcon(".\\memoryImg\\" + String.valueOf(i) + ".jpg");
    	 }
    	 // �إ�jbtn[0]~jbtn[7] �K�ӫ��s�A�Ʀ����A�@�榳�|�ӫ��s
    	 int x=0, y=0; 
    	 for (int i=0; i<jbtn.length; i++){
    		 jbtn[i] = new JButton();
    		 jbtn[i].setBounds(x*100+20, y*120+20, 80, 100);
    		 jbtn[i].setIcon(icons[0]);		// ���s�w�]��� ? �ݸ���
    		 jbtn[i].setEnabled(false);
    		 x++;
    		 if (i % 4==3){
    			 y++;
    			 x = 0;
    		 }
    		 // �b������Jjbtn[0]~jbtn[7] �K�ӫ��s
    		 add(jbtn[i]);
        	 // ���wjbtn[0]~jbtn[7] �K�ӫ��s����ť�̬�ActionListener�ΦW����
        	 // ����Ujbtn[0]~jbtn[7] �ɷ|����Ӫ��� actionPerformed ��k
    		 jbtn[i].addActionListener(new ActionListener(){
        		 public void actionPerformed(ActionEvent evt) { 
        			 num++;						// ���U���s���ƥ[1    			 
        		     if (num==1){				// �Ĥ@�����U	
        		    	 // ���o�Ĥ@�����U���s�N���r��
        		    	 f = evt.getActionCommand();  	
        		    	 // ���o�Ĥ@�����U���s
        		    	 jbtnf = (JButton)evt.getSource();   	   		    	
        		    	 jbtn[Integer.parseInt(jbtnf.getToolTipText())].setIcon(icons[Integer.parseInt(f)]);
        		     }else if (num==2){	// �ĤG�����U
        		    	 // ���o�ĤG�����U���s�N���r��
        		    	 s = evt.getActionCommand();	
        		    	 // ���o�ĤG�����U���s
        		      	 jbtns= (JButton)evt.getSource();		    	
        		    	 jbtn[Integer.parseInt(jbtns.getToolTipText())].setIcon(icons[Integer.parseInt(s)]);
        		    	 // �Y�Ĥ@�����U���s��f�r��P�ĤG�����U���s��s�r��۵�
        		    	 // �B�Ĥ@�����U���s�P�ĤG�����U���s���O�P�@�ӡA�h��ܲq��@�չϥ�
            		     if (f.equals(s) && jbtns!=jbtnf){
            		    	 JOptionPane.showMessageDialog(null, "�q��F!");
            		    	 jbtnf.setEnabled(false);		// �Ĥ@�����s�����s����
            		    	 jbtns.setEnabled(false);	// �ĤG�����s�����s����
            		    	 win++;				// �q��ռƥ[�@
            		    	 if (win==4){		// �Y�q��|��
                		    	  JOptionPane.showMessageDialog(null, "����F...ya!");
            		    	 }
            		     }else{   // �Y�S���q����@�չϥܡA�h���e���U�����s���٭즨?�ݸ��ϥ�
            		    	 JOptionPane.showMessageDialog(null, "����@!");
            		    	 jbtnf.setEnabled(true);
            		    	 jbtns.setEnabled(true);		
            		    	 jbtnf.setIcon(icons[0]);
            		    	 jbtns.setIcon(icons[0]);
            		     }
        		    	 f="";
        		    	 s="";
        		    	 num=0;
        		     }	     
        		 }
    		 });
    	 }    	 
     	// �b������JjbtnOk�T�w�s 
    	 jbtnOk = new JButton("�T�w");
    	 jbtnOk.setBounds(20, 260, 80, 30);
    	 jbtnOk.setFont(new Font("�L�n������",Font.PLAIN, 18));
    	 add(jbtnOk);	 
    	 // ���wjbtnOk�T�w�s����ť�̬�ActionListener�ΦW����
    	 // ���U�T�w�s�ɷ|����Ӫ��� actionPerformed ��k
    	 jbtnOk.addActionListener(new ActionListener(){  //���U�T�w�s���榹�B
    		 public void actionPerformed(ActionEvent evt) { 	
    			    // �إ�ary[0]~ary[7] �ΨӦs��ϥܪ��s���A�s���ۦP�����P�@��
    			    int[] ary = new int[]{1,1,2,2,3,3,4,4};
 					int n=0;	// �ΨӦs�񲣥ͪ��ü�
 					int max = ary.length-1;		
 					// �ϥΰj��jbtn[0]~jbtn[7]�i��üƦs��1.jpg~4.jpg
 					// �s���ۦP���P�@��
 					for (int i=0; i<ary.length; i++){
 						 n = (int)Math.round((Math.random()*max));
 						 rnd[i] = ary[n];
 						 ary[n] = ary[max];
 					     max--;	
 						 jbtn[i].setActionCommand(String.valueOf(rnd[i]));
 						 jbtn[i].setToolTipText(String.valueOf(i));
 						 jbtn[i].setIcon(icons[0]);
 						 jbtn[i].setEnabled(true);
 				    }
    		 }
    	 });

    	 // �]�w�����j�p���e430, ��360
    	 setSize(430, 360);
    	 // ��ܵ���
    	 setVisible(true);
    	 // �]�w�������������s�|�����{��
    	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
}

//�D�{��
public class Program {
	public static void main(String[] args){
		// �إ�MyJFrame����(�O�Фj����C��)
		new MyJFrame();
	}
}

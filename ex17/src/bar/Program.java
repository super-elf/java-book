package bar;

import java.awt.*;				//�ϥ�Font���O�жפJjava.awt.*�M��
import java.awt.event.*;	//�ϥΨƥ�жפJjava.awt.event.*�M��
import javax.swing.*;		//�ϥ�swing����жפJjavax.swing.*�M��

// MyJFrame(���Q�C������)�~��JFrame��������
// MyJFrame��@ActionListener������actionPerformed��k�ΨӳB�z���s�����@�U���ƥ�
class MyJFrame extends JFrame implements ActionListener  {
	// �ŧijlbl[0]~jlbl[2]�Ψӷ���Q�C���T�ӹ�
    private JLabel[] jlbl = new JLabel[3];
    // �ŧi icon[0]~icon[3] �ΨӦs�����, �P�P, ���, bar�|�ӹϥ�
    // �|�ӹϥܨ̧Ǭ� 0.jpg, 1.jpg, 2.jpg, 3.jpg
    private ImageIcon[] icons = new ImageIcon[4];
    // �ŧi jlblSum���ҥΨ���� "�`�ƶq�G" �T��
    // �ŧijlblBetting���ҥΨ���� "��`�q�G" �T��
    private JLabel jlblSum, jlblBetting;
    // �ŧi jtxtBetting��r����Ψ����ϥΪ̿�J��`�q
    private JTextField jtxtBetting;
    // �ŧi jbtnOk "�U�`" ���s
    private JButton jbtnOk;
    private int sum = 50;
	//�غc��
    MyJFrame()
    {
    	 // ���ϥΪ����t�m
    	 super.setLayout(null);
    	 // �������D�]�� "���Q�C����"
    	 super.setTitle("���Q�C����");
    	 // �]�wicons[0]~icons[3]���󪺹ϥܬ�barImg��Ƨ��U��0.jpg~3.jpg
    	 for(int i=0; i<icons.length; i++){
    		 icons[i] = new ImageIcon(".\\barImg\\" + String.valueOf(i) + ".jpg");
    	 }
    	 // �إ�jlbl[0]~jlbl[2]�A�ë��w�T�Ӽ��Ҭ�����(0.jpg)�A�̫�b��J������
    	 for (int i=0; i<jlbl.length; i++){
    		 jlbl[i] = new JLabel();
    		 jlbl[i].setBounds(i*100+10, 10, 86, 86);
    		 jlbl[i].setIcon(icons[0]);
    		 add(jlbl[i]);
    	 } 	 
    	 // �b������JjlblSum���ҡA�Ӽ������ "�`�ƶq�G"
    	 jlblSum = new JLabel("�`�ƶq�G" + String.valueOf(sum));
    	 // �]�wjlblSum����x�y��10, y�y��120, �e160, ��20
    	 jlblSum.setBounds(10, 120, 160, 20);
    	 jlblSum.setFont(new Font("�L�n������",Font.PLAIN, 18));
    	 add(jlblSum);
    	// �b������JjlblBetting���ҡA�Ӽ������ "��`�q�G"
    	 jlblBetting = new JLabel("��`�q�G");
    	 jlblBetting.setBounds(160, 120, 80, 20);
    	 jlblBetting.setFont(new Font("�L�n������",Font.PLAIN, 18));
    	 add(jlblBetting);
    	// �b������JjtxtBetting��r����A���ϥο�J��`�q
    	 jtxtBetting = new JTextField();
    	 jtxtBetting.setBounds(240, 120, 50, 25);
    	 jtxtBetting.setFont(new Font("�L�n������",Font.PLAIN, 18));
    	 add(jtxtBetting);
    	// �b������JjbtnOk�U�`�s 
    	 jbtnOk = new JButton("�U�`");
    	 jbtnOk.setBounds(10, 160, 80, 30);
    	 jbtnOk.setFont(new Font("�L�n������",Font.PLAIN, 18));
    	 add(jbtnOk);
    	 
    	 // ���wjbtnOk�U�`�s����ť�̬��ثe������
    	 // �]�����U�`�s�ɷ|����ثe���O�� actionPerformed ��k
    	 jbtnOk.addActionListener(this);
    	
    	 // �]�w�����j�p���e320, ��250
    	 setSize(320, 250);
    	 // ��ܵ���
    	 setVisible(true);
    	 // �]�w�������������s�|�����{��
    	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }

     // ��@ActionListener������actionPerformed��k 
	 public void actionPerformed(ActionEvent evt) {   
		 // �إ߰����t����A�öǤJRunnable��������
		 // ��������ΨӱҰʩ��Q�C��
		 // ��jlbl[0]~jlbl[2]�H�üƤ覡������, �P�P, ���, bar�|�ӹϥ�
		 // �çP�_�O�_����
		 Thread t = new Thread (
				 new Runnable(){
					 //��@Runnable������run��k
					 public void run(){
						 // k�Ψӭp����Q�C�������Ϧ���
						 // kind�ΨӪ�ܤ������ơAkind����-1��ܨS����
						 int k=0, kind=-1;
						//n[0]~n[2] �ΨӦs�񲣥ͪ��üƭ�
						 int[] n = new int[jlbl.length]; 
					     int betting=0;		// �ΨӦs���`�q
					     try{
					    	 // �Ysum�`�ƶq����0�A��ܨS���i�Ϊ���`�B�Y���}�C��
					    	 if(sum==0){
					    		 JOptionPane.showMessageDialog(null, "�z�w�g�}���F!�Y�N���}�C��");
					    		 System.exit(0);
					    	 }
					    	 // ���o�ϥΪ̪���`�B�A�ë��w��betting
					    	 betting = Integer.parseInt(jtxtBetting.getText());
					    	 // ���`�ƶq�p���`�B�Χ�`�B�p��0�A��ܪ��B����
					    	 if (sum<betting || betting<=0) {
						         JOptionPane.showMessageDialog(null, "���B�����Ϊ��B����!");
						         return ;
					    	 }
					    	 sum-=betting;		
					         jlblSum.setText("�`�ƶq�G" + String.valueOf(sum));
					         // ���U�`�s�Ұʩ��Q�C�����ᰨ�W�Y���ΤU�`�s
					         // ����ϥΪ̭��ƫ��U
							 jbtnOk.setEnabled(false);		
					     }catch(Exception ex){
					         JOptionPane.showMessageDialog(null, "�п�J�Ʀr");
					    	 return ;	    	
					     }
						 try{
							 do{
								 // ����0~3�������üƨë��w��n[0]~n[2]
								 // �æbjlbl[0]~jlbl[2]�H��������, �P�P, ���, bar�ϥ�
								 for (int i=0; i<jlbl.length; i++){
									 n[i]=(int)Math.round(Math.random()*3);
									 jlbl[i].setIcon(icons[n[i]]);
								 }
								 k++;
								//�ثe������Ȱ�0.1��
								 Thread.currentThread().sleep(100);			
							 }while(k<10);	// �Yk�j��0�A�h������Q�C��
						 }catch(InterruptedException ex){ }
						 // �P�_�����Ӽ�
					     if (n[0]==0 && n[1]==0 && n[2]==0){			
					    	 kind = 3;	//�T�ӹϬ����, �o3��
					     }else if(n[0]==1 && n[1]==1 && n[2]==1){	
					    	 kind = 10;	//�T�ӹϬ��P�P, �o10��
					     }else if(n[0]==2 && n[1]==2 && n[2]==2){	
					    	 kind = 20;	//�T�ӹϬ����, �o20��
					     }else if(n[0]==3 && n[1]==3 && n[2]==3){	
					    	 kind = 50;	//�T�ӹϬ�bar, �o50��
					     }
					   	 // �P�_�O�_�����A�Ykind������-1��ܤ���
					     if (kind!=-1){
					         JOptionPane.showMessageDialog(null, "�����o" + String.valueOf(kind) + "��");
					         // �ثe�`�ƶq(�`��`�B)�֥[�����ƶq
					         sum += kind*betting;		
					         jlblSum.setText("�`�ƶq�G" + String.valueOf(sum));
					     }
						 jbtnOk.setEnabled(true);		// �U�`�s�ҥ�
	            }
	      });
	      t.start();		// �Ұʰ����
	  } 
}
// �D�{��
public class Program {
	public static void main(String[] args){
		// �إ�MyJFrame����(���Q�C��)
		new MyJFrame();
	}
}
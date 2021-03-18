package constructor;

class Ccar {
   private double gas = 50;           //��l��gas(�̦h���o�q)��Ʀ����w�]��
   private double tbo = 12;           //��l��tbo(�����Ӫo�q)��Ʀ����w�]��
   private double max_dist;           //�[���o�i��p�̪��Z��
   private void setGas(double g) {
     if(g>30 && g<80) gas = g;
   }
   private void setTbo(double t) {
     if(t>4 && t<20) tbo = t;
   }
   
   private void maxDist() {           //�p��i��p�̪��Z��
     max_dist = gas * tbo;
   }
   
   public Ccar() {              //Ccar���O���c��,�S���ǤJ�޼�
     maxDist();
   }            
   public Ccar(double g) {      //Ccar���O���c��,�ǤJ�@�Ӥ޼�
     setGas(g);                 //�I�ssetGas()��k,��l��gas��Ʀ���
     maxDist();
   }
   public Ccar(double g, double t) {   //Ccar���O���c��,�ǤJ�G�Ӥ޼�
     setGas(g);                 //�I�ssetGas()��k,��l��gas��Ʀ���
     setTbo(t);                 //�I�ssetGas()��k,��l��gas��Ʀ���
     maxDist();
   }
   
   public double getDist() {      //�ǥX���
     return max_dist;
   }
}

public class Constructor {                    //�D���O
   public static void main(String[] args) {    //�D�{��
     Ccar car1 = new Ccar();                   //�ϥΨS���޼ƪ��غc��
     System.out.println("new Ccar() �[���o�i��p " + car1.getDist() + " km");
     Ccar car2 = new Ccar(40.5);               //�ϥΤ@�Ӥ޼ƪ��غc��
     System.out.println("new Ccar(40.5) �[���o�i��p " + car2.getDist() + " km");
     Ccar car3 = new Ccar(64.5, 9.2);          //�ϥΤG�Ӥ޼ƪ��غc��
     System.out.println("new Ccar(64.5,9.2) �[���o�i��p " + car3.getDist() + " km");
  }
}
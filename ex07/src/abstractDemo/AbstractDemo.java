package abstractDemo;

abstract class Cscore {            //��H���O
   protected int chia, math;        //��妨�Z,�ƾǦ��Z

   public abstract double avgScore();    //��H��k

   protected Cscore(int chia, int math) {
      this.chia = chia;
      this.math = math;
   }
}
 
class SimpleAvg extends Cscore {   //�~��Cscore��H���O,�����n��@��H��k
   SimpleAvg(int chia, int math) {    
      super(chia, math);
   }

   public double avgScore() {             //��@avgScore()��H��k
      return (float) (chia + math) / 2;
   }
}

class WeightAvg extends Cscore {    //�~��Cscore��H���O,�����n��@��H��k
   private int w1, w2;

   WeightAvg(int chia, int math, int w1, int w2) {
      super(chia, math);
      this.w1 = w1;
      this.w2 = w2;
   }

   public double avgScore() {        //��@avgScore()��H��k
      return (float) (chia * w1 + math * w2) / (w1 + w2);
   }
}

public class AbstractDemo {
   public static void main(String[] args) {
	  String name = "Ĭ����";
      int chia = 92, math = 73;            //����
      SimpleAvg avg1 = new SimpleAvg(chia, math);
      System.out.println("�m�W\t���\t�ƾ�\t��������");
      System.out.printf("%s\t%d\t%d\t%2.1f%n", name, chia, math, avg1.avgScore());
	  System.out.println("----------------------------------");
	  int wt1 = 2, wt2 = 3;                //�[�v
	  WeightAvg avg2 = new WeightAvg(chia, math, wt1, wt2);
      System.out.println("�m�W\t���\t�ƾ�\t�[�v����");
      System.out.printf("%s\t%d\t%d\t%2.1f%n", name, chia, math, avg2.avgScore());
      //Cscore avg3 = new Cscore(chia, math);    //���~,��H���O�L�k���͹���
   }
}

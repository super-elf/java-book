package superDemo;
class CScore {
   private int chia, math;
   CScore() {
      chia = 0; math = 0;
   }

   CScore(int chia, int math) {
      this.chia = chia;
      this.math = math;
   }

   public void showScore() {
      System.out.print("���G" + this.chia + "\t �ƾǡG" + this.math);
   }
}

class SonCScore extends CScore {
   private int eng;
   SonCScore() {
      super();       //�I�sCScore�����O��CScore()�غc��
      eng = 0;
   }
	
   SonCScore(int chia, int math, int eng) {
      //�I�sCScore�����O��CScore(int chia, int math)�غc��
      super(chia, math);
      this.eng = eng;
   }
	
   public void showScore() {
      super.showScore();   //�I�s�����O��showScore��k
      System.out.print("\t �^�y�G" + this.eng);
   }
}

public class SuperDemo {
   public static void main(String[] args) {
	  CScore Peter = new CScore(50, 70);
	  Peter.showScore();
	  System.out.println("\n");
	  SonCScore Tom = new SonCScore(65, 84, 99);
	  Tom.showScore();
   }
}

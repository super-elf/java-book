package finalDemo1;

final class Cdog  {    //�L�k�Q�~��
   int weight ;
}

/* �]��Cdog���O��final�A�ҥHCcat�L�k�~��Cdog
class Ccat extends Cdog { }
*/

class Ccar {
   //private final int speed;   //���g�k���~,�������w���
   private final int speed = 120 ;
   public final void showBigSpeed(String s) {
      System.out.println(s + " �̤j�t�׬O " + speed + " �����I");
   }
}

class PiliCcar extends Ccar {
   /* �����O��showBigSpeed��k��final�A�ҥH�l���O�L�k�мg
   public void showBigSpeed(String s) {
      System.out.println(s + " �̤j�t�׬O " + speed + " �����I");
   }
   */
}

public class FinalDemo1 {
   public static void main(String[] args) {
      Ccar car1 = new Ccar();
	  car1.showBigSpeed("car1");
      PiliCcar car2 = new PiliCcar();
      car2.showBigSpeed("car2");
   }
}

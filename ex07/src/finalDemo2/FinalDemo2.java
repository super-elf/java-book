package finalDemo2;

class Ccar {
   private final int speed = 120 ;
   public final void showBigSpeed(String s)  {
       System.out.println(s + " �̤j�t�׬O " + speed + " �����I");
   }
}

class PiliCcar extends Ccar {
   public void showBigSpeed(String s, int n) {
      System.out.println(s + " �[�j��̤j�t�׬O " + n + " �����I");
   }
}

public class FinalDemo2 {
   public static void main(String[] args) {
      Ccar car1 = new Ccar();
      car1.showBigSpeed("car1");      //�I�sCcar�����O��showBigShow()
      PiliCcar car2 = new PiliCcar();
      car2.showBigSpeed("car2");      //�I�sCcar�����O��showBigShow()
      car2.showBigSpeed("car2", 180);   //�I�sPiliCcar�l���O��showBigShow()
   }
}

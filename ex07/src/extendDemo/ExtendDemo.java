package extendDemo;

class CMath {
   public void getMax(int a, int b) {
      int bigNum;
      if (a > b)
         bigNum = a;
      else
         bigNum = b;
      System.out.println(a + " �P " + b + " ���̤j�Ƭ� " + bigNum);
   }
}

class SonCMath extends CMath {          // SonCMath�~��CMath���O
   public void getFactorial(int a) {
      int ans = 1, i;
      System.out.print(a + "! = ");
      for (i = 1; i < a; i++) {
         System.out.print(i + "*");
         ans *= i;
      }
      ans *= a;
      System.out.println(a + " = " + ans);
   }
}

public class ExtendDemo {
    public static void main(String[] args) {
	    SonCMath math1 = new SonCMath();
		math1.getMax(10, 20);     // �I�s�l���O�~�Ӥ����O����k
		System.out.println();
		math1.getFactorial(5);    // �I�s�l���O�ۤv����k
	}
}

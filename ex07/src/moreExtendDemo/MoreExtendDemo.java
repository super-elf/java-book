package moreExtendDemo;

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

class GrandSonCMath extends SonCMath {  //GrandSonCMath�~��SonCMath���O
   public void getFabonacci(int a) {
      int firstNum = 0, secondNum = 1;
      System.out.print("�O��ƦC�G") ;
      System.out.print(firstNum + ", " +secondNum);
      int ans;
      for(int i=2; i<=a; i++) {
         ans = firstNum + secondNum;
         System.out.print(", " +ans);
         firstNum = secondNum;
         secondNum = ans;
      }
   }
}

public class MoreExtendDemo {
	public static void main(String[] args) {
		GrandSonCMath math2 = new GrandSonCMath();
		math2.getMax(10,20);        //�I�s�~�Ӧۯ������O����k
		math2.getFactorial(5);      //�I�s�~�Ӧۯ������O����k
		math2.getFabonacci(10);     //�I�s�Φۤw����k
	}
}

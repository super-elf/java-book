package overrideDemo;

class CMath {
   public void getMax(int a, int b) {
      int bigNum;
      if (a>b) bigNum = a;
      else bigNum = b;
      System.out.println(a + " �M " + b + " ���̤j�Ƭ� " + bigNum);
   }
}

class SonCMath extends CMath {
   public void getMax(int a, int b) {
   if(a>b)
	  System.out.println(a + " �M " + b + " ���̤j�Ƭ� " + a);
   else if(a<b)
      System.out.println(a + " �M " + b + " ���̤j�Ƭ� " + b);
   else
      System.out.println(a + " �M " + b + " �@�ˤj");
   }
}

public class OverrideDemo {
   public static void main(String[] args) {
      CMath math3 = new CMath();
	  math3.getMax(20, 20);         //�I�sCMath�����O��getMax()��k
	  SonCMath math4 = new SonCMath();
	  math4.getMax(20, 20);         //�I�sSonCMath�l���O��getMax()��k
   }
}
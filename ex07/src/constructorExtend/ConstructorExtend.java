package constructorExtend;

class CMath {
   protected int a = 1;
   CMath() {
      System.out.println("a = " + a);
   }
}

class SonCMath extends CMath {
   protected int b = 2;
   SonCMath() {
      System.out.println("a + b = " + (a + b));
   }
}

class GrandSonCMath extends SonCMath {
   protected int c = 4;
   GrandSonCMath() {
      System.out.println("a + b + c = " + (a + b + c));
   }
}

public class ConstructorExtend {
	public static void main(String[] args) {
	   new GrandSonCMath();   // 採匿名物件的方式來建立物件實體
	}
}

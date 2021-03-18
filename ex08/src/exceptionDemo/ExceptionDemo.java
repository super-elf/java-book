package exceptionDemo;

public class ExceptionDemo {
	public static void main(String[] args) {
	   int[] myarray = new int[10];
	   try {
	       myarray[10] = 250;
	   }
	   catch(ArrayIndexOutOfBoundsException e) {
	       System.out.println("例外內容：" + e.toString());
	       System.out.println("也就是：超出陣列索引範圍");
	   }
	   System.out.println("程式最後一行執行完畢");
   }
}

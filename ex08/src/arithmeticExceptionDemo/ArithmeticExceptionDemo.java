package arithmeticExceptionDemo;

public class ArithmeticExceptionDemo {
	public static void main(String[] args) {
	    int a=3, b=0, c;
		try {
		    c = a / b;  //a除以b指定給c，但b為0，所以會發生除數為0的例外
		    System.out.println( a + "除" + b + " 等於" + c);
		}
		catch(ArithmeticException e) {
		    System.out.println("例外內容：" + e.toString());
		    System.out.println("也就是：數學運算錯誤，如除數為0");
		}
		System.out.println("程式最後一行執行完畢");
	}
}

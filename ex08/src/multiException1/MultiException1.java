package multiException1;

public class MultiException1 {
	public static void main(String[] args) {
		int[] myarray = new int[10];
		try {
		    int test = 120 / 5;
		    myarray[5] = 120;
		    int n = Integer.parseInt("你好嗎");  //字串無法轉換成整數
		}
		catch (ArrayIndexOutOfBoundsException e) {
		    System.out.println("例外內容：" + e.toString());
		    System.out.println("也就是：超出陣列索引範圍的例外發生");
		}
		catch(ArithmeticException e) {
		    System.out.println("例外內容：" + e.toString());
		    System.out.println("也就是：數學運算錯誤，如除數為0!");
		}
		catch(Exception e) {
		    System.out.println("例外內容：" + e.toString());
		    System.out.println("例外發生!");
		}
		System.out.println("程式正確執行完畢!!");
	}
}
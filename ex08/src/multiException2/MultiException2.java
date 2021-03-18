package multiException2;

public class MultiException2 {
	public static void main(String[] args) {
	    int[] myarray = new int[10];
		try {
		    int test = 120 / 5;
		    myarray[5] = 120;
		    int n = Integer.parseInt("你好嗎");  //字串無法轉換成整數
		}
		catch(Exception e) {      //此catch必須要寫在最後一個catch才行
		    System.out.println("例外內容：" + e.toString());
		    System.out.println("例外發生!");
		}
		catch(ArrayIndexOutOfBoundsException e) {
		    System.out.println("例外內容：" + e.toString());
		    System.out.println("為：超出陣列索引範圍的例外發生");
		}
		catch(ArithmeticException e) {
		    System.out.println("例外內容：" + e.toString());
		    System.out.println("為：數學運算錯誤，如除數為0!");
		}
		System.out.println("\n程式正確執行完畢!!");
	}
}
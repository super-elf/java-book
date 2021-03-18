package finallyDemo;

public class FinallyDemo {
	public static void main(String[] args) {
	    int[] myarray = new int[10];
	    try {
	        myarray[20] = 120;
	   	}
	    catch (ArrayIndexOutOfBoundsException e) {
	        System.out.println("例外內容：" + e.toString());
	        System.out.println("也就是：超出陣列索引範圍");
	    }
	    finally {     //finally敘述區塊一定會執行
	        System.out.println("執行finally 程式區塊完成");
	    }
	    System.out.println("程式正確執行完畢!!");
	}
}

package nonException;

public class NonException {
	public static void main(String[] args) {
        int[] myarray = new int[10];//水
	    myarray[10] = 250;  // 陣列索引超出範圍，此行會產生例外
	    System.out.println("程式正確執行完畢");
	}
}

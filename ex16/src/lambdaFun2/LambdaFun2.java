package lambdaFun2;

import java.util.Arrays;

public class LambdaFun2 {
	public static void main(String[] args) {
		// 建立name[0]~name[3]字串陣列元素
		String[] name = new String[] { "peter", "Tom", "Jasper", "anita" };
		// 字串比較規則使用 String類別的compareToIgnoreCase()方法
		Arrays.sort(name, String::compareToIgnoreCase);
		// 印出排序後的結果
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
	}
}

package collectionsDemo;
import java.util.*;
public class CollectionsDemo {
	public static void main(String[] args) {
	    ArrayList<String> alist = new ArrayList<>();
		var data = List.of("EEE", "CCC", "BBB", "DDD", "AAA");
		for(String p : data)
		    alist.add(p);
		System.out.println("顯示alist集合物件初始元素...");
		System.out.println(alist);
		 
		Collections.sort(alist);
		System.out.println("\n排序後的元素...");
		System.out.println(alist);
		 
		Collections.reverse(alist);
		System.out.println("\n反轉排列的元素...");
		System.out.println(alist);
	}
}

package collectionsDemo;
import java.util.*;
public class CollectionsDemo {
	public static void main(String[] args) {
	    ArrayList<String> alist = new ArrayList<>();
		var data = List.of("EEE", "CCC", "BBB", "DDD", "AAA");
		for(String p : data)
		    alist.add(p);
		System.out.println("���alist���X�����l����...");
		System.out.println(alist);
		 
		Collections.sort(alist);
		System.out.println("\n�Ƨǫ᪺����...");
		System.out.println(alist);
		 
		Collections.reverse(alist);
		System.out.println("\n����ƦC������...");
		System.out.println(alist);
	}
}

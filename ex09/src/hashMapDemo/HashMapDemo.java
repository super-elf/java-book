package hashMapDemo;
import java.util.*;
public class HashMapDemo {
	public static void main(String[] args) {
	   var hmap = new HashMap<>();
	   hmap.put("張三谷", "牧師");
	   var post = Map.of("何九山", "教師", "李四斐", "警察", "周六圖", "教師");
	   hmap.putAll(post);
	   System.out.println("集合內容：" + hmap);
	   System.out.println("hmap集合的元素個數：" + hmap.size());
	
	   System.out.println("\n加入\"何九山\" ....");
	   if (hmap.containsKey("何九山"))
	      System.out.println("\"何九山\" 已存在，重複加入時職業欄資料會被覆蓋");
	   hmap.put("何九山", "軍人");
	   System.out.println("\"何九山\" 的職業更改為：" + hmap.get("何九山"));
	   System.out.println("加入\"曹五操\" ....");
	   String name = "曹五操";
	   if (hmap.containsKey(name))
	      System.out.println("\"" + name + "\" 已存在，不接受更改");
	   else
	      hmap.put(name, "律師");
	   System.out.println("移除\"周六圖\" ....");
	   hmap.remove("周六圖");
	
	   System.out.println("\n集合內容：");
	   for (Map.Entry e : hmap.entrySet()) {
	      System.out.println(e.getKey() + "=" + e.getValue());
	   }
	}
}

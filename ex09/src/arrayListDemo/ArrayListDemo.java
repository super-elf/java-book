package arrayListDemo;
import java.util.*;
public class ArrayListDemo {
	public static void main(String[] args) {
		System.out.println("～東部旅遊夜宿規劃～");
		var night = new ArrayList<>();
		var place = List.of("宜蘭", "花蓮", "天祥", "花蓮", "台東");
		for (String p : place)
		    night.add(p);
		System.out.println("初期規劃夜宿地點：" + night);
		System.out.println("初期規劃夜宿天數：" + night.size());
		night.add("知本");
		night.add(4, "池上");
		System.out.println("修訂後夜宿地點：" + night);
		System.out.println("夜宿天祥在第幾天："+(night.indexOf("天祥")+1));
		System.out.println("刪除花蓮第一個夜宿...");
		night.remove(night.indexOf("花蓮"));
		
		System.out.println("\n確定夜宿天數：" + night.size());
		System.out.println("～確定夜宿表列～");
		for (int i = 0; i < night.size(); i++)
		    System.out.println("第 " + (i+1) + " 天夜宿地點：" + night.get(i));
	}
}

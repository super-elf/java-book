package setDemo;
import java.util.*;
public class SetDemo {
	public static void main(String[] args) {
		var hset = new HashSet<>();
		hset.add("白虎");              //將字串常值資料存入集合物件中
		var chiaAnimal = Set.of("青龍", "白虎", "朱雀", "玄武");  //字串集合
		//String[] chiaAnimal = {"青龍", "白虎", "朱雀", "玄武"}; //字串陣列
		for (String p : chiaAnimal)   //將字串集合元素資料存入集合物件中
		hset.add(p);
		String myAni = "饕餮";
		hset.add(myAni);              //將字串變數資料存入集合物件中
		System.out.println("中國神獸：" + hset);  //顯示集合中的所有元素內容
	}
}

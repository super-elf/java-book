package iteratorDemo;
import java.util.*;
public class IteratorDemo {
	public static void main(String[] args) {
	    //建立tset集合物件
	    TreeSet<Integer> tset = new TreeSet<>();
		System.out.println("將1~40的整數存入tset集合物件中...");
		for(int i=1; i<=40; i++)
		    tset.add(i);
		System.out.println("開始時，tset集合物件內元素個數為：" + tset.size());
		//建立走訪器物件itera
		Iterator<Integer> itera = tset.iterator();
		System.out.println("\n非質數移除中...");
		itera.next();
		itera.remove();                 //1不是質數,先移除
		while(itera.hasNext()) {
		    int num = itera.next();
		    for(int j=2; j<num; j++) {
		       if(num % j == 0) {
		          itera.remove();           //因有其他因數,故非質數
		          break;
		       }
		    }
		}
		System.out.println("非質數移除完畢");
		System.out.println("最後，tset集合物件內元素個數為：" + tset.size());
		System.out.println("1~40的質數有：" + tset);
	}
}

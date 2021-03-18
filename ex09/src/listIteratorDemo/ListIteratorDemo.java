package listIteratorDemo;
import java.util.*;
public class ListIteratorDemo {
	public static void main(String[] args) {
	    System.out.println("建立alist集合物件...");
	    ArrayList<String> alist = new ArrayList<>();
	    String[] place = {"宜蘭", "花蓮", "天祥", "台東", "知本"};
	    for(String p : place)
	        alist.add(p);
	    System.out.println("顯示alist集合物件初始元素...");
	    System.out.println(alist);
	
	    ListIterator<String> litera = alist.listIterator();
	    System.out.println("\n修改alist集合物件元素...");
	    while(litera.hasNext()) {
	        litera.next();
	        if (litera.nextIndex()==3)
	            litera.set("瑞穗");
	    }
	
	    System.out.println("\n反向走訪alist集合物件元素...");
	    while(litera.hasPrevious())
	       System.out.print(litera.previous() + "  ");
	    System.out.println();
	
	    System.out.println("\n新增alist集合物件元素...");
	    litera = alist.listIterator(3);
	    litera.add("池上");
	 
	    System.out.println("\n顯示alist集合物件最終元素");
	    System.out.println(alist);
	}
}

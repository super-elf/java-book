package hashMapDemo;
import java.util.*;
public class HashMapDemo {
	public static void main(String[] args) {
	   var hmap = new HashMap<>();
	   hmap.put("�i�T��", "���v");
	   var post = Map.of("��E�s", "�Юv", "���|��", "ĵ��", "�P����", "�Юv");
	   hmap.putAll(post);
	   System.out.println("���X���e�G" + hmap);
	   System.out.println("hmap���X�������ӼơG" + hmap.size());
	
	   System.out.println("\n�[�J\"��E�s\" ....");
	   if (hmap.containsKey("��E�s"))
	      System.out.println("\"��E�s\" �w�s�b�A���ƥ[�J��¾�~���Ʒ|�Q�л\");
	   hmap.put("��E�s", "�x�H");
	   System.out.println("\"��E�s\" ��¾�~��אּ�G" + hmap.get("��E�s"));
	   System.out.println("�[�J\"�䤭��\" ....");
	   String name = "�䤭��";
	   if (hmap.containsKey(name))
	      System.out.println("\"" + name + "\" �w�s�b�A���������");
	   else
	      hmap.put(name, "�߮v");
	   System.out.println("����\"�P����\" ....");
	   hmap.remove("�P����");
	
	   System.out.println("\n���X���e�G");
	   for (Map.Entry e : hmap.entrySet()) {
	      System.out.println(e.getKey() + "=" + e.getValue());
	   }
	}
}

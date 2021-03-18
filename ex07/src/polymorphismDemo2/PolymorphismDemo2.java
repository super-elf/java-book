package polymorphismDemo2;

import java.util.Scanner;

interface Share {       //�w�qShare����
   double area();        //�ŧi�D���narea()��k
}

class Circle implements Share {    //Circle���O��@Share����
   private double radius;     //�b�|

   public Circle(double r) {
      this.radius = r;
   }

   public double area() {
      return 3.14 * radius * radius;
   }
}

class Tapezoid implements Share {      //Tapezoid���O��@Share����
   private double uBase, dBase, high;  //�W��,�U��,��

   public Tapezoid(double u, double d, double h) {
      this.uBase = u;
      this.dBase = d;
      this.high = h;
   }

   public double area() {
      return (uBase + dBase) * high / 2;
   }
}

public class PolymorphismDemo2 {
   public static void main(String[] args) {
	   double radius, uBase, dBase, high;
	   Share sha;       //�ŧiShare���O���Ѧ��ܼ�sha
	   Circle cir;      //�ŧiCircle���O������cir
	   //Tapezoid tap;    //�ŧiTapezoid���O������tap
	   Scanner scn = new Scanner(System.in);    //�إ�scn���󱵨���J���
	   while (true) {
	      System.out.print("�п�ܧΪ��G(1.���   2.���    0.���}) �H ");
	      int item = scn.nextInt();
	      if (item == 1) {
	         System.out.print("�п�J �b�| �H ");
	         radius = scn.nextDouble();
	         cir = new Circle(radius);
	         sha = cir;
	         System.out.print("��ΡG �b�|  = " + radius);
	      } else if (item == 2) {
	         System.out.print("�п�J �W�� �H ");
	         uBase = scn.nextDouble();
	         System.out.print("�п�J �U�� �H ");
	         dBase = scn.nextDouble();
	         System.out.print("�п�J �� �H ");
	         high = scn.nextDouble();
	         sha = new Tapezoid(uBase, dBase, high);
	         System.out.print("��ΡG�W�� = " + uBase + "�A�U�� = " + dBase 
	                          + "�A�� = " + high);
	      } else {
	         scn.close();
	         break;
	      }
	      //��@Share������area()��k
	      System.out.println("�A���n�� " + sha.area());
	   }
   }
}

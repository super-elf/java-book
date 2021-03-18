package polymorphismDemo1;

import java.util.Scanner;

abstract class Share {                       // ��H���O
   abstract double area(double X, double Y);  // ��H��k
}

class Triangle extends Share {       //Triangle���O�~��Share��H���O
   public double area(double H, double B) {
      return (H * B) / 2;
   }
}

class Rectangle extends Share {      //Rectangle���O�~��Share��H���O
   public double area(double H, double W) {
      return H * W;
   }
}

public class PolymorphismDemo1 {
   public static void main(String[] args) {
       double high, base;
       Share sha;                          //�ŧiShare���O���Ѧ��ܼ�sha
       Triangle tri = new Triangle();      //����Triangle���O������tri
       Rectangle rec = new Rectangle();    //����Rectangle���O������rec
	
	   Scanner scn = new Scanner(System.in);   //�إ�scn���󱵨���J���
	   while (true) {
	      System.out.print("�п�ܧΪ��G(1.�T����   2.�x��    0.���}) �H ");
	      int item = scn.nextInt();            
	      if (item == 1) {
	         System.out.print("�п�J �� �H ");
	         high = scn.nextDouble();
	         System.out.print("�п�J �� �H ");
	         base = scn.nextDouble();
	         System.out.print("�T���ΡG �� = " + high + "�A�� = " + base);
	         sha = tri;                        //sha�Ѧ��ܼƫ���tri����
	      } else if (item == 2) {
	         System.out.print("�п�J �� �H ");
		     high = scn.nextDouble();
		     System.out.print("�п�J �e �H ");
		     base = scn.nextDouble();
		     System.out.print("�x�ΡG �� = " + high + "�A�e = " + base);
		     sha = rec;                        //sha�Ѧ��ܼƫ���rec����
		  } else {
		     scn.close();
		     break;
		  }
		  //����Share���O��area()��k
          System.out.println("�A���n�� " + sha.area(high, base));
	   }
	}
}

package selfException;

class MyException extends Exception {      // MyException�~��Exception
   private String name;

   MyException(String name) {
     this.name = name;
   }

   public String toString() {       //�мgThrowable���O��toString()��k
     return "�o��MyException�ҥ~�F";
   }

   public String getMessage() {    //�мgThrowable���O��getMessage()��k
     return "�]�w�~���Фp��!!";
   }
   public String getLocalizedMessage(){   //�мggetLocalizedMessage()��k
     return "�~���]�w���i�H100000�H�W";
   }

   public void showData() {       //showMessage()��k�O�۩w����k
     System.out.println("���u" + name + "���~���]�w���~");
   }
}

class Employee {
   private int money;
   private String name;

   Employee(String name) {
     this.name = name;
     System.out.println("���u�G" + name);
   }

   void setMoney(int money) throws MyException {
     if (money < 100000)
       this.money = money;
     else
       throw new MyException(name);  //�ߥXMyException�۩w�ҥ~���O���������
   }

   void showData() {
     System.out.println("�~���G" + money + "\n");
   }
}

public class SelfException {
   public static void main(String[] args) {
     try {
       Employee e1 = new Employee("Peter");
       e1.setMoney(50000);
       e1.showData();
       Employee e2 = new Employee("Mary");
       e2.setMoney(100000);
       e2.showData();             //���椣�|����
     } catch (MyException e) {    //�ɮ��ۦ�w�q��MyException���O�ҥ~
       System.out.println(e.toString());
       System.out.println(e.getMessage());
       System.out.println(e.getLocalizedMessage());
       e.showData();
     }
   }
}
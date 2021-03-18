package selfException;

class MyException extends Exception {      // MyException繼承Exception
   private String name;

   MyException(String name) {
     this.name = name;
   }

   public String toString() {       //覆寫Throwable類別的toString()方法
     return "發生MyException例外了";
   }

   public String getMessage() {    //覆寫Throwable類別的getMessage()方法
     return "設定薪水請小心!!";
   }
   public String getLocalizedMessage(){   //覆寫getLocalizedMessage()方法
     return "薪水設定不可以100000以上";
   }

   public void showData() {       //showMessage()方法是自定的方法
     System.out.println("員工" + name + "的薪水設定錯誤");
   }
}

class Employee {
   private int money;
   private String name;

   Employee(String name) {
     this.name = name;
     System.out.println("員工：" + name);
   }

   void setMoney(int money) throws MyException {
     if (money < 100000)
       this.money = money;
     else
       throw new MyException(name);  //拋出MyException自定例外類別的物件實體
   }

   void showData() {
     System.out.println("薪水：" + money + "\n");
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
       e2.showData();             //此行不會執行
     } catch (MyException e) {    //補捉自行定義的MyException類別例外
       System.out.println(e.toString());
       System.out.println(e.getMessage());
       System.out.println(e.getLocalizedMessage());
       e.showData();
     }
   }
}
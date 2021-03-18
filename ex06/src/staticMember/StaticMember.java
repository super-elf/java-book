package staticMember;

class Ccar {                        //�T�����O
    private static int car_num;      //�ŧicar_num���p���R�A��Ʀ���   
    private double gas = 50;       
    private double tbo = 12;       
   
    private void setGas(double g) {
       if(g>30 && g<80) gas = g;
    }
    private void setTbo(double t) {
       if(t>4 && t<20) tbo = t;
    }

    public Ccar() {              
       car_num++;
    }            
    public Ccar(double g) {      
       setGas(g);               
       car_num++;
    }
    public Ccar(double g, double t) {  
       setGas(g);               
       setTbo(t);              
       car_num++;
    }
   
    public static void getObjectNum() {      //���}�R�A��k����
       System.out.print("�� " + car_num + "����,");
    }
   
    public void showValue() {                //���}�@���k����
       System.out.println("�̦h���o�q " + gas + ",�����Ӫo�q " + tbo);
    }
}

public class StaticMember {                    //�D���O
    public static void main(String[] args) {   //�D�{��
       Ccar car1 = new Ccar();                 
       Ccar.getObjectNum();
       car1.showValue();
       Ccar car2 = new Ccar(40.5);                
       car2.getObjectNum();                  //��ĳ���Ccar.getObjectNum();
       car2.showValue();
       Ccar car3 = new Ccar(64.5,9.2);                 
       car1.getObjectNum();                  //��ĳ���Ccar.getObjectNum();
       car3.showValue();
    }
}

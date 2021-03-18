package interfaceDemo1;

interface IMove {                   //IMove����
    public int ENGINE_NUM = 1;       //�����`��
    public void addSpeed(int s);     //�u�ŧi��������k�A�L�{���X
}

class PiliCar implements IMove {    //PiliCar���O��@IMove����
    private int speed;
    public void addSpeed(int s) {    //��@IMove������addSpeed��k���{���X
        System.out.println("�R�E���ثe�t�סG" + speed);
	    speed += s ;
	    System.out.println("�R�E��  �[�t��G" + speed);
    }
}

class BMXCar implements IMove {     //BMXCar���O��@IMove����
    private int speed;
    public void addSpeed(int s) {  //��@IMove������addSpeed��k���{���X
        System.out.println("BMX�ثe�t�סG" + speed);
        speed += s ;
        if(speed <= 200)
            System.out.println("BMX  �[�t��G" + speed);
        else
            System.out.println("BMX�̤j�t�� 200 �L�k�A�[�t�F");
    }
}

public class InterfaceDemo1 {
	public static void main(String[] args) {
		System.out.println("�Ҧ����l�� " + IMove.ENGINE_NUM + " �Ӥ����I");
		PiliCar car1 = new PiliCar();
		car1.addSpeed(150);
		car1.addSpeed(120);
		System.out.println("�R�E���� " + IMove.ENGINE_NUM + " �Ӥ����I");
		BMXCar car2 = new BMXCar();
		car2.addSpeed(150);
		car2.addSpeed(120);
		System.out.println("BMX�� " + IMove.ENGINE_NUM + " �Ӥ����I");
	}
}

package interfaceDemo2;
    
interface IMove {
    public void showSpeed();
}

interface IFly {
    public void showFly();
}

interface IAnimal extends IMove, IFly {  //IAnimal�����~��IMove�MIFly����
    public void showAttack() ;
}

class CAirPlane implements IMove, IFly {   //��@IMove�MIFly����
    public void showSpeed() {
        System.out.println("�����C�@���[�t�A�|�W�[ 20�����I");
    }
    public void showFly() {
        System.out.println("�������ֲ̧��ʤ覡�A�N�O����I");
    }
}

class CSiteYaMan implements IAnimal {     //��@IAnimal����
    public void showSpeed() {
        System.out.println("�ɨȤH�C�@���[�t�A�|�W�[ 30�����I");
    }
    public void showFly() {
        System.out.println("�ɨȤH�����t�פ���t�٧֡I");
    }
    public void showAttack() {
        System.out.println("�ɨȤH�����|�ϥ��t����\�I");
    }
}

public class InterfaceDemo2 {
	public static void main(String[] args) {
	    CAirPlane air1 = new CAirPlane(); //�إ�CAirPlane���O��air1����
		air1.showSpeed();         //�I�sCAirPlane���O��showSpeed()��k
		air1.showFly();           //�I�sCAirPlane���O��showFly()��k
		System.out.println();
		CSiteYaMan man1 = new CSiteYaMan();    //�إ�CSiteYaMan���O
		                                               //��man1����
		man1.showSpeed();      //�I�sCSiteYaMan���O��showSpeed()��k
		man1.showFly();        //�I�sCSiteYaMan���O��showFly()��k
		man1.showAttack();     //�I�sCSiteYaMan���O��showAttack()��k
	}
}

package pk22;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = new String("��ȣ��");
		String strVar2 = "��ȣ��";
		
		//������ ���Ǵ�
        if(strVar1==strVar2) {
        	System.out.println("���� String ��ü�� ����");
        }else {
        	System.out.println("�ٸ� String ��ü�� ����");
        }
        //���� ���Ǵ�
        if(strVar1.equals(strVar2)) {
        	System.out.println("���� String ��ü�� ����");
        }else {
        	System.out.println("�ٸ� String ��ü�� ����");
        }

	}

}

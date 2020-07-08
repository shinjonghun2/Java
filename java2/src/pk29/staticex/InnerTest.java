package pk29.staticex;



class OutClass{
	//�ʵ�(�ν��Ͻ� ����=�������=�Ӽ�)
	private int num=10;
	private static int sNum=20;
	private InClass inClass; //���� Ŭ������ ����ó�� Ȱ���ϱ� ���� ����

	//construct�� ���ؼ� ���� Ŭ���� ��ü ����
	public OutClass() {
		System.out.println("OutClass ��ü�� �����Ǿ����ϴ�.");
		System.out.println();
		inClass = new InClass(); //����Ŭ���� ����
	}
	class InClass{
		//���� Ŭ������ �ʵ�
		int inNum=100;
		/*�ܺο� �ν��Ͻ� ������ ����Ǿ� �ִ� static�� ������� ����ϴ°� ����������
	      �����̵ǰ� ������� ����ؾ� �ϴ� staticŸ���� ������ �ٸ������� �������� �� ���� */
		//static int sNum=300;
		//static int sInNum=200;// OutŬ������ �����ֱ⶧���� �ܵ����� InClass�� �����ɼ� ��� static ������ ��� �Ұ��� 
		//����Ϸ��� InClass�� staticŬ����������
		//static void sTest() {}
		//�޼���
		void inTest() {

			System.out.println("OutClass num = " + num + " (�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass inNum = " + inNum + " (���� Ŭ������ �ν��Ͻ� ����");
			System.out.println("OutClass sNum = " + sNum + " (�ܺ� Ŭ������ static ����)");
			System.out.println();
		}

	}

	static class InStaticClass{
		//�ʵ�
		int inNum = 100;
		static int sInNum=200;
		void inTest() {
			//num = 10; //�ܺ� �ν��Ͻ����� ������

			System.out.println("InStaticClass inNum = " +inNum + " (���� Ŭ������ �ν��Ͻ� ���� ���)");
			System.out.println("InStaticClass SInNum = " + sInNum + " (���� Ŭ������ ����ƽ ���� ���)");
			System.out.println("InStaticClass SNum = " + sNum + " (�ܺ� Ŭ������ ����ƽ ���� ���)");

		}

		static void sTest() {
			//�ν��Ͻ� �������� ��� �Ұ� 
			//num+=10;
			//inNum+=10;
			sNum=30;//static������ ��� ���� 
			System.out.println("OutClass SNum = " + sNum + " (�ܺ� Ŭ������ ����ƽ ���� ���)");
			System.out.println("InStaticClass SInNum = " + sInNum + " (���� Ŭ������ ����ƽ ���� ���)");
		}
	}
}



public class InnerTest {

	public static void main(String[] args) {
		OutClass out = new OutClass();
		OutClass.InClass in = out.new InClass();
		System.out.println("�ܺ� Ŭ���� ������ �̿��Ͽ� ���� Ŭ���� ����");
		in.inTest();

		OutClass.InStaticClass inst = new OutClass.InStaticClass();

		System.out.println("���� ���� Ŭ���� �Ϲ� �޼��� ȣ��");
		inst.inTest();
		System.out.println();
		System.out.println("���� ���� Ŭ������ ����ƽ �޼ҵ� ȣ��");
		//��ü���� ȣ��
		inst.sTest();
		System.out.println();
		System.out.println("���� ���� Ŭ������ ����ƽ �޼ҵ� ȣ��2");
		//Ŭ�������� ȣ��
		OutClass.InStaticClass.sTest();
	}

}

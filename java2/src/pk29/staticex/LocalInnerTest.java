package pk29.staticex;

class OutClass1{
	//�ʵ�
	int outNum=100;
	static int sNum=200;

	Runnable getRunnable(int i) {//�Ű������� final�� ó���Ǿ� �ٸ� Ŭ�������� ���Ұ�
		int num=100; //���� �������� ���ȭ final

		//�޼ҵ� ���ο� Ŭ���� ����
		class MyRunnable implements Runnable{

			int localnum = 10;
			

			@Override
			public void run() {
				//num=200;//��������
				//i=20;//�Ű����� 
				System.out.println("localNum : " + localnum + " (���� Ŭ������ �ν��Ͻ� ����) ");
				System.out.println("outNum : " + outNum + " (�ܺ� Ŭ������ �ν��Ͻ� ����)");
				System.out.println("OutClass-static : " + sNum + " (�ܺ� Ŭ������ ��������)" );

			}

		}
		return new MyRunnable();
	}
}


public class LocalInnerTest {

	public static void main(String[] args) {
		
		OutClass1 out = new OutClass1();
		Runnable runner = out.getRunnable(10);
		runner.run();

	}

}

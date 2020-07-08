package pk29.staticex;

class OutClass2{
	//�ʵ�
	int outNum=100;
	static int sNum=200;

	Runnable getRunnable(int i) {//�Ű������� final�� ó���Ǿ� �ٸ� Ŭ�������� ���Ұ�
		int num=100; //���� �������� ���ȭ final

		int localnum = 10;
		//�͸��� Ŭ����
		return new Runnable() {
			
			@Override
			public void run() {
				//num=200;//��������
				//i=20;//�Ű����� 
				System.out.println("localNum : " + localnum + " (���� Ŭ������ �ν��Ͻ� ����) ");
				System.out.println("outNum : " + outNum + " (�ܺ� Ŭ������ �ν��Ͻ� ����)");
				System.out.println("OutClass-static : " + sNum + " (�ܺ� Ŭ������ ��������)" );

				
			}
		};
	}
}
	//���ο��� �۵����� ��ü 	
//	Runnable run = new Runnable() {
//		
//		@Override
//		public void run() {
//			// TODO Auto-generated method stub
//			
//		}
//	};





public class AnonymousInnerTest {

	public static void main(String[] args) {
		OutClass2 out = new OutClass2();
		Runnable runner = out.getRunnable(10);
		runner.run();
	}
}

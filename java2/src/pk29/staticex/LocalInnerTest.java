package pk29.staticex;

class OutClass1{
	//필드
	int outNum=100;
	static int sNum=200;

	Runnable getRunnable(int i) {//매개변수도 final로 처리되어 다른 클래스에서 사용불가
		int num=100; //지역 변수이자 상수화 final

		//메소드 내부에 클래스 생성
		class MyRunnable implements Runnable{

			int localnum = 10;
			

			@Override
			public void run() {
				//num=200;//지역변수
				//i=20;//매개변수 
				System.out.println("localNum : " + localnum + " (내부 클래스의 인스턴스 변수) ");
				System.out.println("outNum : " + outNum + " (외부 클래스의 인스턴스 변수)");
				System.out.println("OutClass-static : " + sNum + " (외부 클래스의 정적변수)" );

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

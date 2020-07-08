package pk29.staticex;

class OutClass2{
	//필드
	int outNum=100;
	static int sNum=200;

	Runnable getRunnable(int i) {//매개변수도 final로 처리되어 다른 클래스에서 사용불가
		int num=100; //지역 변수이자 상수화 final

		int localnum = 10;
		//익명의 클래스
		return new Runnable() {
			
			@Override
			public void run() {
				//num=200;//지역변수
				//i=20;//매개변수 
				System.out.println("localNum : " + localnum + " (내부 클래스의 인스턴스 변수) ");
				System.out.println("outNum : " + outNum + " (외부 클래스의 인스턴스 변수)");
				System.out.println("OutClass-static : " + sNum + " (외부 클래스의 정적변수)" );

				
			}
		};
	}
}
	//내부에서 작동중인 객체 	
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

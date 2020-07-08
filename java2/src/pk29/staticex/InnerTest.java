package pk29.staticex;



class OutClass{
	//필드(인스턴스 변수=멤버변수=속성)
	private int num=10;
	private static int sNum=20;
	private InClass inClass; //내부 클래스를 변수처럼 활용하기 위한 선언

	//construct를 통해서 내부 클래스 객체 생성
	public OutClass() {
		System.out.println("OutClass 객체가 생성되었습니다.");
		System.out.println();
		inClass = new InClass(); //내부클래스 생성
	}
	class InClass{
		//내부 클래스의 필드
		int inNum=100;
		/*외부에 인스턴스 변수로 선언되어 있는 static을 변경없이 사용하는건 가능하지만
	      기준이되고 변경없이 사용해야 하는 static타입의 변수를 다른곳에서 재정의할 수 없다 */
		//static int sNum=300;
		//static int sInNum=200;// Out클래스에 속해있기때문에 단독으로 InClass가 생성될수 없어서 static 변수는 사용 불가능 
		//사용하려면 InClass가 static클래스여야함
		//static void sTest() {}
		//메서드
		void inTest() {

			System.out.println("OutClass num = " + num + " (외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass inNum = " + inNum + " (내부 클래스의 인스턴스 변수");
			System.out.println("OutClass sNum = " + sNum + " (외부 클래스의 static 변수)");
			System.out.println();
		}

	}

	static class InStaticClass{
		//필드
		int inNum = 100;
		static int sInNum=200;
		void inTest() {
			//num = 10; //외부 인스턴스변수 사용못함

			System.out.println("InStaticClass inNum = " +inNum + " (내부 클래스의 인스턴스 변수 사용)");
			System.out.println("InStaticClass SInNum = " + sInNum + " (내부 클래스의 스태틱 변수 사용)");
			System.out.println("InStaticClass SNum = " + sNum + " (외부 클래스의 스태틱 변수 사용)");

		}

		static void sTest() {
			//인스턴스 변수들은 사용 불가 
			//num+=10;
			//inNum+=10;
			sNum=30;//static변수는 사용 가능 
			System.out.println("OutClass SNum = " + sNum + " (외부 클래스의 스태틱 변수 사용)");
			System.out.println("InStaticClass SInNum = " + sInNum + " (내부 클래스의 스태틱 변수 사용)");
		}
	}
}



public class InnerTest {

	public static void main(String[] args) {
		OutClass out = new OutClass();
		OutClass.InClass in = out.new InClass();
		System.out.println("외부 클래스 변수를 이용하여 내부 클래스 생성");
		in.inTest();

		OutClass.InStaticClass inst = new OutClass.InStaticClass();

		System.out.println("정적 내부 클래스 일반 메서드 호출");
		inst.inTest();
		System.out.println();
		System.out.println("정적 내부 클래스의 스태틱 메소드 호출");
		//객체에서 호출
		inst.sTest();
		System.out.println();
		System.out.println("정적 내부 클래스의 스태틱 메소드 호출2");
		//클래스에서 호출
		OutClass.InStaticClass.sTest();
	}

}

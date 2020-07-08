package pk29.staticex;

public class A {
	A(){
		System.out.println("A객체가 생성됨");
	}
	//inner class중에서 인스턴스 멤버 클래스
	//static선언할수가 없다
	public class B {
		//필드
		int field1;//인스턴스 변수
		//private static int field2;//B단독이 아닌 A에 종속된 상태이기 때문에 선언을 할 수 없음 
		//선언하려면 B가 static클래스 이거나 B단독으로 사용해야 가능 
		//생성자
		B(){
			System.out.println("B객체가 생성됨");
		}	
		//메소드
		void method1() {

		}
		//static 메소드 
		//void static method2() {} //위에 변수와 같은이유로 메소드 생성 불가 
	}

	//inner class중에서 정적(static : DATA영역의 메모리 사용 ) 멤버 클래스
	static class C{
		C(){System.out.println("C 객체가 생성됨");}
		int field1;
		static int field2;//A에 종속되어있지만 C는 static클래스이기 때문에 static변수 사용가능
		
		void method1() {
			
		}
		static void method2() {}
	}

	void method() {
		//inner class중에서 로컬 클래스
		class D{
			D(){System.out.println("D객체가 생성됨");}
			int field1;
			//static int field2;
			void method5() {}
			//static void method2() {}
		}
		D d = new D();
		d.field1=3;
		d.method5();
	}

}

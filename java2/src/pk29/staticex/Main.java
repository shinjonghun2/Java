package pk29.staticex;



public class Main {

	public static void main(String[] args) {
		A a = new A();
		
		//인스턴스 멤버 클래스 객체 생성
	    A.B b = a.new B();
	    b.field1=3;
	    b.method1();
	    //정적 멤버 클래스 생성
	    A.C c = new A.C(); //static이므로 독립된 공간에서 작동하므로 생성자를 공유할수는 없다
	    c.field1=3;
	    c.method1();
	    //c.field2=5;
	    A.C.field2=3; // static을 끌고오는건 객체생성한것에서 끌고 올수도있지만 클래스에서 바로 끌고오는게 좋다 
	    A.C.method2();
	    //로컬 클래스 객체 생성
	    a.method();
	    
	   
	    }
}

package pk30.lambda;

interface PrintString{
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {
		
		//람다식을 변수에 대입 
		PrintString print = (str) -> System.out.println(str); 
		
		print.showString("Hello lambda_1");
		
		//함수형 람다 유형 1
		showMyString(print); //lambdaStr : 람다식 객체
		//  (str) -> System.out.println(str); 복사되어 print에 담겨있음
		
		//함수형 람다 유형2
		PrintString reStr = returnString(); 
		reStr.showString("hello");
	}

	public static void showMyString(PrintString p) {
		p.showString("Hello lambda_2");
	}
	public static PrintString returnString() {
		return (str) -> System.out.println(str+" World");
		
	}
}

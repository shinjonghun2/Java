package pk30.lambda;

interface PrintString{
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {
		
		//���ٽ��� ������ ���� 
		PrintString print = (str) -> System.out.println(str); 
		
		print.showString("Hello lambda_1");
		
		//�Լ��� ���� ���� 1
		showMyString(print); //lambdaStr : ���ٽ� ��ü
		//  (str) -> System.out.println(str); ����Ǿ� print�� �������
		
		//�Լ��� ���� ����2
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

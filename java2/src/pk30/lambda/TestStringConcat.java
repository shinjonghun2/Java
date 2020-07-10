package pk30.lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		
		//��ü���� ���
		StringConcatImpl str = new StringConcatImpl();
		
		str.makeString("��ü���� : " + s1, s2);
		
		//���ٽ�(������ ����)
		StringConcat concat1 = (s,v)->System.out.println(s+" "+v);
		concat1.makeString("���ٽ� : " + s1, s2);
		
		
		
		
		
		//�͸��� Ŭ����
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 +" " + s2);
				
			}
		};
		concat2.makeString("�͸��� Ŭ���� : " +s1, s2);
		
	}

}

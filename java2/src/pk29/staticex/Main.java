package pk29.staticex;



public class Main {

	public static void main(String[] args) {
		A a = new A();
		
		//�ν��Ͻ� ��� Ŭ���� ��ü ����
	    A.B b = a.new B();
	    b.field1=3;
	    b.method1();
	    //���� ��� Ŭ���� ����
	    A.C c = new A.C(); //static�̹Ƿ� ������ �������� �۵��ϹǷ� �����ڸ� �����Ҽ��� ����
	    c.field1=3;
	    c.method1();
	    //c.field2=5;
	    A.C.field2=3; // static�� ������°� ��ü�����ѰͿ��� ���� �ü��������� Ŭ�������� �ٷ� ������°� ���� 
	    A.C.method2();
	    //���� Ŭ���� ��ü ����
	    a.method();
	    
	   
	    }
}

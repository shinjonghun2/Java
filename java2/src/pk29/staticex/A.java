package pk29.staticex;

public class A {
	A(){
		System.out.println("A��ü�� ������");
	}
	//inner class�߿��� �ν��Ͻ� ��� Ŭ����
	//static�����Ҽ��� ����
	public class B {
		//�ʵ�
		int field1;//�ν��Ͻ� ����
		//private static int field2;//B�ܵ��� �ƴ� A�� ���ӵ� �����̱� ������ ������ �� �� ���� 
		//�����Ϸ��� B�� staticŬ���� �̰ų� B�ܵ����� ����ؾ� ���� 
		//������
		B(){
			System.out.println("B��ü�� ������");
		}	
		//�޼ҵ�
		void method1() {

		}
		//static �޼ҵ� 
		//void static method2() {} //���� ������ ���������� �޼ҵ� ���� �Ұ� 
	}

	//inner class�߿��� ����(static : DATA������ �޸� ��� ) ��� Ŭ����
	static class C{
		C(){System.out.println("C ��ü�� ������");}
		int field1;
		static int field2;//A�� ���ӵǾ������� C�� staticŬ�����̱� ������ static���� ��밡��
		
		void method1() {
			
		}
		static void method2() {}
	}

	void method() {
		//inner class�߿��� ���� Ŭ����
		class D{
			D(){System.out.println("D��ü�� ������");}
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

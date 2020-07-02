package pk23;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		//��ü�� �����ؼ� Ŭ�����̸� ȹ�� 
		Person person = new Person();
		//Object�� getClass()�޼ҵ带 ��� 
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		//Ŭ������ �����ؼ� Ŭ���� �̸��� ȹ�� 
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		//Ŭ���� �̸����� ��������
		Class pClass3 = Class.forName("pk23.Person");
		System.out.println(pClass3.getName());
		
		Constructor[] cons = pClass3.getConstructors();
		
		for(Constructor c : cons) {
			System.out.println(c);
		}
		System.out.println();
		
		Method[] methods = pClass3.getMethods();
		
		for(Method m : methods) {
			System.out.println(m);
		}
		
	}
}

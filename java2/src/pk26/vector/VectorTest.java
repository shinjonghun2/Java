package pk26.vector;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Object obj;
		//ũ�� 2�� �迭 ����
		Vector<Object> vec = new Vector<Object>(2);
		obj=10;
		vec.addElement(obj); //������Ʈ �߰�
		//vector �뷮 �� 
		System.out.println("�뷮#1 : " + vec.capacity());
		//vector ������Ʈ �� 
		System.out.println("ũ��#1 : " + vec.size());
		
		obj="Hi";
		vec.addElement(obj); //������Ʈ �߰�
		System.out.println("�뷮#2 : " + vec.capacity());
		System.out.println("ũ��#2 : " + vec.size());
		
		obj="Nice Day";
		vec.addElement(obj); //������Ʈ �߰�
		System.out.println("�뷮#3 : " + vec.capacity());
		System.out.println("ũ��#3 : " + vec.size());
	}
}

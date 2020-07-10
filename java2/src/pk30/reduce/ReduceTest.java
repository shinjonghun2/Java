package pk30.reduce;

import java.util.Arrays;

public class ReduceTest {

	public static void main(String[] args) {
		String[] greetings = {"�ȳ��ϼ���~~~", "hello","Good morning", "�ݰ����ϴ�^^^^"};
		
		//����� ���� �ǽ�
		//reduce�� ����(�ʱⰪ,�Ű�����,�����) //������
//		reduce("",(s1,s2)->
//		{if (s1.getBytes().length>= s2.getBytes().length) 
//			return s1;
//			else return s2;});
		
		//Stream�� ���� 
//		Arrays.stream(greetings).reduce("",(s1,s2)->
//		{if (s1.getBytes().length>= s2.getBytes().length) 
//			return s1;
//			else return s2;})
		
		//��� ���
		System.out.println(
		Arrays.stream(greetings).reduce("",(s1,s2)->
							{if (s1.getBytes().length>= s2.getBytes().length) 
								return s1;
								else return s2;}));
		System.out.println();
//--------------------------------------------------------------------------------------		
		//BinaryOperator�� ������ Ŭ���� �̿� �ǽ�
		//Ŭ������ �̿��Ҷ��� �ʱⰪ�� �����ȴ�
		String str = Arrays.stream(greetings).
		reduce(new CompareString()).get();
		System.out.println(str);
	}
	

}

package pk26.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		
		hashSet.add(new String("������"));
		hashSet.add(new String("������"));
		hashSet.add(new String("ȫ����"));
	//	hashSet.add(new String("������"));
	//	hashSet.add(new String("������"));
		
        boolean b1 = hashSet.add("������");
        System.out.println(b1);
        //�Է��ϴ� ���� ���Ƽ�(hashcode���� ����)  �Էµ��� ���� 
        boolean b2 = hashSet.add("������");
        System.out.println(b2);
        
		System.out.println(hashSet);
	}
}
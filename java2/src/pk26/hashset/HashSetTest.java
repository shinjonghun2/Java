package pk26.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		
		hashSet.add(new String("임정순"));
		hashSet.add(new String("박현경"));
		hashSet.add(new String("홍연희"));
	//	hashSet.add(new String("강감찬"));
	//	hashSet.add(new String("강감찬"));
		
        boolean b1 = hashSet.add("강감찬");
        System.out.println(b1);
        //입력하는 값이 같아서(hashcode값이 같음)  입력되지 않음 
        boolean b2 = hashSet.add("강감찬");
        System.out.println(b2);
        
		System.out.println(hashSet);
	}
}

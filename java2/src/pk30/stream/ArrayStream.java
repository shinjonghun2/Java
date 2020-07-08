package pk30.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayStream {

	public static void main(String[] args) {
	int[] arr = {1,2,3,4,5};
	Arrays.stream(arr).forEach(n->System.out.println(n));
	int s1=Arrays.stream(arr).sum();
	System.out.println("arr의 합계 : " + s1);
	System.out.println();
	
	//객체이름 : list
	List<Integer>list =new ArrayList<Integer>();
	list.add(10);
	list.add(40);
	list.add(20);
	list.add(30);
	list.add(50);
	list.stream().forEach(n->System.out.println(n));
	System.out.println();
	int sum = list.stream().mapToInt(n->n.intValue()).sum();
	System.out.println("ArrayList의 합계 : " + sum );
	System.out.println();
	list.stream().sorted().forEach(n->System.out.println(n));
	System.out.println();
	list.stream().sorted().filter(n->n.intValue()>=30).forEach(n->System.out.println(n));
	
	
	}

}

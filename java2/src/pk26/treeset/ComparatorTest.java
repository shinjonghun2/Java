package pk26.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		
		return (s1.compareTo(s2)) * -1; // 음수가 나오기때문에 내림차순 
	}
	
	
}
public class ComparatorTest {

	public static void main(String[] args) {
		Set<String>set = new TreeSet<String>(new MyCompare());
		set.add("aaa");
		set.add("ccc");
		set.add("bbb");
		
		System.out.println(set);

	}

}

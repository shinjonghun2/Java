package pk26.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add("DATABASE");
		list.add("Spring");
		
		//�� ��ü�� 
		System.out.println("�� ��ü�� : " + list.size());
		
		//for -> size ,get
		for(int i=0; i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i + " : " +str);
		}
		//���� 
		list.remove(2);
		list.remove(2);
		list.remove("Spring");
		
		//for -> size, get 
		System.out.println("--------���� �� ---------");
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " +str);
		}
	}
}

package pk26.arraylist;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Object obj;
		//empty 스택 생성 
		Stack<Object> st = new Stack<Object>();
		if(st.empty()) {
			for(int i=0; i<3; i++) {
				st.push(new String(" Hi! " + i));
				System.out.println("입력" + i + "번째 :" + st.peek());
			}
		}//of
		
		//stack에 있는것 하나 꺼내기 
		st.pop();
		System.out.println("현재 Top의 위치 (peek) : " + st.peek());
		st.pop();
		System.out.println("현재 Top의 위치 (peek) : " + st.peek());
		
		st.push(new String("Every body!"));
		System.out.println( st.peek());
		st.push(new String("Nice Day"));
		System.out.println(st.peek());
	}
}

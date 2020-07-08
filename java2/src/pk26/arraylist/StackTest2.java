package pk26.arraylist;

import java.util.ArrayList;

class MyStack{
	//Stack구조를 ArrayList를 사용해서 이용 
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len=arrayStack.size();
		if(len==0) {
			System.out.println("스택이 비었습니다");
			return null;
		}
		return(arrayStack.remove(len-1)); 
	}
}



public class StackTest2 {

	public static void main(String[] args) {
		MyStack stack =new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		stack.push("E");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
	}

}

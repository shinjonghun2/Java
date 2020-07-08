package pk26.arraylist;

import java.util.Stack;

public class StackExmple {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		//4번이상 push
		if(coinBox.empty()) {
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(200));
		coinBox.push(new Coin(300));
		coinBox.push(new Coin(400));
		coinBox.push(new Coin(500));
		}
		//coin이 없을때까지 pop하기 
		while(!coinBox.isEmpty()) {
			
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 " + coin.getValue()+"원");
			
		}
		
	}

}

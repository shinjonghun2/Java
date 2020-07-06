package pk26.vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		
		Board b1 = new Board("가","태백산맥","조경래");
		Board b2 = new Board("나","데미안","헤르만 헤세");
		Board b3 = new Board("다","어떻게 살 것인가","유시민");
		Board b4 = new Board("라","토지","박경리");
		Board b5 = new Board("마","어린왕자","생텍쥐베리");
		
		list.add(b1);
		//list.add(new Board("가","태백산맥","조경래"));
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		
		for(int i=0; i<list.size();i++) {
			Board board = list.get(i);
			System.out.println(board);
		}
		System.out.println("=======================================");
		list.remove(2);
		list.remove(3);
		
		for(int i=0; i<list.size();i++) {
			Board board = list.get(i);
			System.out.println(board);
		}

	}

}

package pk26.vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		
		Board b1 = new Board("��","�¹���","���淡");
		Board b2 = new Board("��","���̾�","�츣�� �켼");
		Board b3 = new Board("��","��� �� ���ΰ�","���ù�");
		Board b4 = new Board("��","����","�ڰ渮");
		Board b5 = new Board("��","�����","�����㺣��");
		
		list.add(b1);
		//list.add(new Board("��","�¹���","���淡"));
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

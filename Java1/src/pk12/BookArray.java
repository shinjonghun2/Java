package pk12;

public class BookArray {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}

		library[0] = new Book("�¹���","���淡");
		library[1] = new Book("���̾�","�츣�� �켼");
		library[2] = new Book("��� �� ���ΰ�","���ù�");
		library[3] = new Book("����","�ڰ渮");
		library[4] = new Book("�����","�����㺣��");
		
		for(int i=0; i<library.length; i++) {
			library[i].showBookinfo();
		}
		System.out.println();
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
	}
	
}

package pk12;

public class ObjectCopy {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("�¹���", "���淡");
		bookArray1[1] = new Book("���̾�", "�츣�� �켼");
		bookArray1[2] = new Book("��� �� ���ΰ�", "���ù�");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookinfo();
		}
		System.out.println();
		//���� ���� : system.arraycopy�� ���縦������ ������ ������ �ٲ�� ������ ���뵵 �ٲ�Եȴ�
		bookArray1[0].setBookname("����");
		bookArray1[0].setAuthor("�ڿϼ�");
		System.out.println("=====bookArray1=====");
		for(int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showBookinfo();
		}
		
		System.out.println("=====bookArray2=====");
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookinfo();
		}
		
	}
}

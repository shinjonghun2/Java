package pk25;

import java.util.*;
public class HashtableExample {

	public static void main(String[] args) {
		Map<String,String>map = new Hashtable<>();

		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter","12345");

		Scanner scan = new Scanner(System.in);

		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է��ϼ��� ");
			System.out.print("���̵�  : ");
			String id = scan.nextLine();
			System.out.print("��й�ȣ : ");
			String pw = scan.nextLine();
			System.out.println();
			//containsKey : HashMap���� �����ϴ� Key���� Ȯ���ϴ� �޼ҵ� 
			if(map.containsKey(id)) {
				if(map.get(id).equals(pw)) {
					System.out.println("�α��� �Ǿ����ϴ�.");
					break;
				}else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			}else {
				System.out.println("�Է��Ͻ� ���̵�� �������� �ʽ��ϴ�.");
			}

		}
	}
}

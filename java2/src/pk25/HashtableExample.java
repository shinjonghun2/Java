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
			System.out.println("아이디와 비밀번호를 입력하세요 ");
			System.out.print("아이디  : ");
			String id = scan.nextLine();
			System.out.print("비밀번호 : ");
			String pw = scan.nextLine();
			System.out.println();
			//containsKey : HashMap에서 제공하는 Key값을 확인하는 메소드 
			if(map.containsKey(id)) {
				if(map.get(id).equals(pw)) {
					System.out.println("로그인 되었습니다.");
					break;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			}else {
				System.out.println("입력하신 아이디는 존재하지 않습니다.");
			}

		}
	}
}

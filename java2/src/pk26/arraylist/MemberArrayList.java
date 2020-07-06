package pk26.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import pk26.Member;
public class MemberArrayList {

	private ArrayList<Member> arrayList; //ArrayList 선언
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>(); //멤버로 선언한 ArrayList가 인스턴스화 됨
	}
	
	public void addMember(Member member) { // ArrayList에 멤버 추가
			arrayList.add(member);
		
	}
	
	public boolean removeMember(int memberId) {// 멤버아이디를 매개변수로, 삭제여부를 반환
		
		for(int i=0; i<arrayList.size(); i++) {//해당 아이디를 가진 멤버를 ArrayList에서 찾음 
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if(tempId==memberId) { 			   //멤버아이디가 매개변수와 일치하면
				arrayList.remove(i);		   // 해당멤버를 삭제 
				return true;				   // true를 반환
			}
		}
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if(tempId==memberId) { 			   //멤버아이디가 매개변수와 일치하면
				arrayList.remove(member);		// 해당멤버를 삭제 
				return true;				   // true를 반환
				
		}
		
			
	}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
		System.out.println(arrayList);
	}
}

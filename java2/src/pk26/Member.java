package pk26;

import java.util.Comparator;

public class Member implements Comparator<Member> {

	private int memberId;
	private String memberName;
	private Member() {} // 디폴트 생성자 (Comparator<Member>)
	public Member(int memberId,String memberName) {
		this.memberId=memberId;
		this.memberName=memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) { //객체여부 확인 
			Member member = (Member)obj; //다운캐스팅
			if(this.memberId==member.memberId) 
				return true;
			else
				return false;
		}

		return false;
	}

	@Override
	public String toString() {
		return memberName + "님의 아이디는 : " + memberId + "입니다" ;
	}

	public int compare(Member member1,Member member2) { //implements comparator <E>

		return (member1.memberId - member2.memberId);  //오름차순 
	}
	public int compareTo(Member member) { // implements compareable <E> 했을때 
		
		return (this.memberId-member.memberId);
	}

	




}

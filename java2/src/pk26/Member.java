package pk26;

import java.util.Comparator;

//implements Comparator<Member>
public class Member  implements Comparable<Member>{

	private int memberId;
	private String memberName;
	
	//private Member() {} // 디폴트 생성자 (Comparator<Member>)
	
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
	public String toString() {
		return memberName + "님의 아이디는 : " + memberId + "입니다" ;
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

	//Member 클래스는 내부적으로 Compare가 되어 있지 않으므로 overrid해준다
	public int compareTo(Member member) { // implements compareable <E> 했을때 
		
		//return (this.memberId-member.memberId) ; //오름차순
      	return(this.memberId - member.memberId) * (-1); //내림 차순 
		//return(this.memberName.compareTo(member.memberName)); //이름 기준 오름차순 
		//return(this.memberName.compareTo(member.memberName)) * (-1);//이름 기준 내림차순
	}
	/*
	public int compare(Member member1,Member member2) { //implements comparator <E>

		return (member1.memberId - member2.memberId);  //오름차순 
	}*/

	




}

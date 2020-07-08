package pk26;

import java.util.Comparator;

//implements Comparator<Member>
public class Member  implements Comparable<Member>{

	private int memberId;
	private String memberName;
	
	//private Member() {} // ����Ʈ ������ (Comparator<Member>)
	
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
		return memberName + "���� ���̵�� : " + memberId + "�Դϴ�" ;
	}
	
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) { //��ü���� Ȯ�� 
			Member member = (Member)obj; //�ٿ�ĳ����
			if(this.memberId==member.memberId) 
				return true;
			else
				return false;
		}

		return false;
	}

	//Member Ŭ������ ���������� Compare�� �Ǿ� ���� �����Ƿ� overrid���ش�
	public int compareTo(Member member) { // implements compareable <E> ������ 
		
		//return (this.memberId-member.memberId) ; //��������
      	return(this.memberId - member.memberId) * (-1); //���� ���� 
		//return(this.memberName.compareTo(member.memberName)); //�̸� ���� �������� 
		//return(this.memberName.compareTo(member.memberName)) * (-1);//�̸� ���� ��������
	}
	/*
	public int compare(Member member1,Member member2) { //implements comparator <E>

		return (member1.memberId - member2.memberId);  //�������� 
	}*/

	




}

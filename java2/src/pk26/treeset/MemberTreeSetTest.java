package pk26.treeset;

import pk26.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet membertreeSet = new MemberTreeSet();
		
		Member memberLee = new Member(1001,"������");
		Member memberSon = new Member(1002,"�չα�");
		Member memberPark = new Member(1003,"�ڼ���");
		
		membertreeSet.addMember(memberLee);
		membertreeSet.addMember(memberSon);
		membertreeSet.addMember(memberPark);
		
		membertreeSet.showallMember();
		
		
		
		
	}

}

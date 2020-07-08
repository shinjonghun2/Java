package pk26.treeset;

import pk26.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet membertreeSet = new MemberTreeSet();
		
		Member memberLee = new Member(1001,"ÀÌÁö¿ø");
		Member memberSon = new Member(1002,"¼Õ¹Î±¹");
		Member memberPark = new Member(1003,"¹Ú¼­ÈÍ");
		
		membertreeSet.addMember(memberLee);
		membertreeSet.addMember(memberSon);
		membertreeSet.addMember(memberPark);
		
		membertreeSet.showallMember();
		
		
		
		
	}

}

package pk25.treemap;

import pk25.hashmap.MemberHashMap;
import pk26.Member;

public class TreeMapTest {

	public static void main(String[] args) {

		MemberTreeMap memberTreeMap = new MemberTreeMap();

		Member memberLee = new Member(1001,"ÀÌÁö¿ø");
		Member memberSon = new Member(1002,"¼Õ¹Î±¹");
		Member memberPark = new Member(1003,"¹Ú¼­ÈÍ");
		Member memberHong = new Member(1004,"È«±æµ¿");

		memberTreeMap.addMember(memberLee);
		memberTreeMap.addMember(memberSon);
		memberTreeMap.addMember(memberPark);
		memberTreeMap.addMember(memberHong);

		memberTreeMap.showallMember();

		memberTreeMap.removeMember(1004);

		memberTreeMap.showallMember();
	}

}

package pk26.hashset;

import pk26.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001,"������");
		Member memberSon = new Member(1002,"�չα�");
		Member memberPark = new Member(1003,"�ڼ���");

		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		
		memberHashSet.showallMember();
		System.out.println();

		//��ü �߰�(�ߺ����̵�)
		Member memberHong = new Member(1003,"ȫ�浿"); // 1003���̵� �ߺ� 

		memberHashSet.addMember(memberHong);
		memberHashSet.showallMember();
		
	}

}/*HashSet�� ���� ���Ǵ��Ͽ� �Է��ϴµ� equals�� hashcode�� ������ ������ ������ �������� �ߺ� ���θ� 
   �Ǵ��� ���� ��� �ߺ��� ����Ѵ�.*/
 //String�Ǵ� Integer���� �̹� JDK���� �������Ͽ��� JVM(�����Ͻ� �۵�)���� �����ϹǷ� �ߺ��� �����
 //������ compare�� ���Ͽ� ������ ���־�� �����ϴ�.(String�Ǵ� Integer���� �̹� �Ǿ�����)

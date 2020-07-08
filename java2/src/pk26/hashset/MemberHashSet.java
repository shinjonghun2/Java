package pk26.hashset;

import java.util.HashSet;
import java.util.Iterator;

import pk26.Member;

public class MemberHashSet {
	//HashSet Ÿ���� �ʵ� ����(�ν��Ͻ� ����)
	private HashSet<Member> hashSet;

	//������ overriding�� ���ؼ� HashSet�� ��ü����
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}
	//hashSet�� ��ü �߰�
	public void addMember(Member member) {
		hashSet.add(member);
	}

	//HashSet ���� get�� �������� ���� �׷��Ƿ� ��ȸ�ϴ� Iterator�� ���Ͽ� ���� �� �Ǵ��ؾ���
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = hashSet.iterator(); //get(i)�� �������� ����
		while(ir.hasNext()) { //hasNext : ���� ��ü ���� �Ǵ��Ͽ� �����ϴ� �޼ҵ� 
			Member member = ir.next();
			int tempId = member.getMemberId();
			if(tempId==memberId) { 			   //������̵� �Ű������� ��ġ�ϸ�
				hashSet.remove(member);		// �ش����� ���� 
				return true;				   //true��ȯ

			}
		}//while off 
		System.out.println(memberId + "���̵� �������� �ʽ��ϴ�");
		return false;
	}
	public void showallMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
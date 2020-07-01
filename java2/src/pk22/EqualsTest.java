package pk22;

public class EqualsTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "�̻��");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100, "�̻��");
		
		// ������ �ּ��� �� �ν��Ͻ� ��
		if(studentLee == studentLee2)
			System.out.println("studentLee�� studentLee2�� �ּҴ� �����ϴ�.");
		else
			System.out.println("studentLee�� studentLee2�� �ּҴ� �ٸ��ϴ�.");
		if(studentLee.equals(studentLee2))
			System.out.println("studentLee�� studentLee2�� �����մϴ�.");
		else
			System.out.println("studentLee�� studentLee2�� �������� �ʽ��ϴ�.");
		
		//�ٸ� �ּҸ� ���� �ִ� ��ü�� ������ ���� ��
		if(studentLee == studentSang)
			System.out.println("studentLee�� studentLee2�� �ּҴ� �����ϴ�.");
		else
			System.out.println("studentLee�� studentLee2�� �ּҴ� �ٸ��ϴ�.");
		
		if(studentLee.equals(studentSang))
			System.out.println("studentLee�� studentLee2�� �����մϴ�.");
		else
			System.out.println("studentLee�� studentLee2�� �������� �ʽ��ϴ�.");
		// �ν��Ͻ� ������ ��������� heap �޸� �ּ�
		System.out.println("studentLee�� hashcode �� : " + studentLee.hashCode());
		System.out.println("studentSang�� hashcode �� : " + studentSang.hashCode());
		// �ν��Ͻ� ���� �־����� ���� �ּ�
		System.out.println("studentLee�� �����ּ� �� : " + System.identityHashCode(studentLee) );
		System.out.println("studentSang�� ���� �ּ� �� : " + System.identityHashCode(studentSang) );
	}
}
		
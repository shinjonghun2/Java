package pk29.staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentNum("������");
		
		System.out.println(studentLee.studentName + "    �й� : " +studentLee.studentID );
		
		//static�� set�޼ҵ� �Ǵ� ������ �ָ� �ȵȴ�.
 		//System.out.println(Student.setSerialNum(1005));
		//Student.setSerialNum(1005);
		System.out.println(Student.getSerialNum());
		
		Student studentSon = new Student();
		studentSon.setStudentNum("�ռ���");
		System.out.println(Student.serialNum); //�ʱⰪ ���
		System.out.println(studentSon.studentName + "    �й� : " +studentSon.studentID );
	}

}

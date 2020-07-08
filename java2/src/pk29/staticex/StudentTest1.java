package pk29.staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentNum("이지원");
		
		System.out.println(studentLee.studentName + "    학번 : " +studentLee.studentID );
		
		//static의 set메소드 또는 변경을 주면 안된다.
 		//System.out.println(Student.setSerialNum(1005));
		//Student.setSerialNum(1005);
		System.out.println(Student.getSerialNum());
		
		Student studentSon = new Student();
		studentSon.setStudentNum("손수경");
		System.out.println(Student.serialNum); //초기값 출력
		System.out.println(studentSon.studentName + "    학번 : " +studentSon.studentID );
	}

}

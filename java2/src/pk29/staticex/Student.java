package pk29.staticex;

public class Student {
	//인스턴스 변수
	public static int serialNum = 1000;//데이터 영역에 별도로 생성
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student() {
		serialNum++;
		studentID=serialNum;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentNum(String name) {
		studentName=name;
	}
	
	//static 메소드
	public static int getSerialNum() {
		//static메소드는 자기자신이 선언한 변수(지역변수)이거나 static변수만 사용가능
		
		int i=10;//지역변수(stack메모리):메소드가 끝나면 없어짐 
		//studentName="aaa"; //인스턴스 변수(heap 메모리)이기 때문에 메모리가 달라서 쓸수 없음
		//serialNum++;//static변수(Data 메모리)여서 사용가능
		return serialNum;
	}
	public static void setSerialNum(int serialNum) {
		Student.serialNum=serialNum;
		
	}
}

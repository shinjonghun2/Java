package pk29.staticex;

public class Student {
	//�ν��Ͻ� ����
	public static int serialNum = 1000;//������ ������ ������ ����
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
	
	//static �޼ҵ�
	public static int getSerialNum() {
		//static�޼ҵ�� �ڱ��ڽ��� ������ ����(��������)�̰ų� static������ ��밡��
		
		int i=10;//��������(stack�޸�):�޼ҵ尡 ������ ������ 
		//studentName="aaa"; //�ν��Ͻ� ����(heap �޸�)�̱� ������ �޸𸮰� �޶� ���� ����
		//serialNum++;//static����(Data �޸�)���� ��밡��
		return serialNum;
	}
	public static void setSerialNum(int serialNum) {
		Student.serialNum=serialNum;
		
	}
}

package pk6;

public class PersonExample {

	public static void main(String[] args) {
		
		Person p1 = new Person("123456-1234567","홍길동");
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		
		p1.name="홍삼원";
		//final : fix되어있으므로 변경 불가
		//p1.nation="usa";
		//p1.ssn="123456-5689451";
		System.out.println(p1.name);
	}
}

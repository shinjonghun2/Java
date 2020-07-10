package pk30.reduce;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {

		TravelCustomer customerLee= new TravelCustomer("이순신", 40, 100);
		TravelCustomer customerKim= new TravelCustomer("김유신", 20, 100);
		TravelCustomer customerHong= new TravelCustomer("홍길동", 13, 50);

		List<TravelCustomer>customerList =new ArrayList<TravelCustomer>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		System.out.println("== 고객 명단 추가된 순서대로 출력 == ");
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		System.out.println();
		
		System.out.println("== 총 여행 비용 출력 ==");
		int sum =customerList.stream().mapToInt(n->n.getPrice()).sum();
		System.out.println("총 여행 비용 : " + sum);
		System.out.println();
		
		System.out.println("==20세 이상 고객명단정렬하여 출력 ==");
		//자료
		customerList.stream().filter(c->c.getAge()>=20).
		map(c->c.getName()).sorted().forEach(s->System.out.println(s));
		
	}

}

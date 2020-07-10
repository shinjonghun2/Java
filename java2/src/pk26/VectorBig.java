package pk26;

import java.util.Scanner;
import java.util.Vector;

//-1이 입력될때까지 vector에 자료(integer) 저장하고 최대값을 출력하는 알고리즘 
public class VectorBig {

	public static void printBig(Vector<Integer> v){
		int big=v.get(0);//비교대상이 없으므로 첫번째는 무조건 최대값 으로 저장됨
		
		for(int i=0; i<v.size();i++) {
			if(v.get(i)>big) { //더 큰수를 찾기위해 비교판단
				big=v.get(i);  //큰 수를 big변수에 저장하기
			}
		}
		System.out.println("가장 큰 수 : " + big);
	}
	
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		//Scanner객체생성
		Scanner scan = new Scanner(System.in);
		
		//입력
		System.out.println("-1을 입력하기 전까지 반복 입력");
		while(true) {
			
			System.out.print("정수입력 : ");
			int num = scan.nextInt();
			if(num==-1)
				break;
			v.add(num);
		}
		if(v.size()==0) {
			System.out.println("입력된 자료가 없습니다");
		}else {
			System.out.println("--가장 큰 수--");
			printBig(v);//가장 큰수를 출력
		}
		
		scan.close();
	}

}

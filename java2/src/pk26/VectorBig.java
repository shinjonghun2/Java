package pk26;

import java.util.Scanner;
import java.util.Vector;

//-1�� �Էµɶ����� vector�� �ڷ�(integer) �����ϰ� �ִ밪�� ����ϴ� �˰����� 
public class VectorBig {

	public static void printBig(Vector<Integer> v){
		int big=v.get(0);//�񱳴���� �����Ƿ� ù��°�� ������ �ִ밪 ���� �����
		
		for(int i=0; i<v.size();i++) {
			if(v.get(i)>big) { //�� ū���� ã������ ���Ǵ�
				big=v.get(i);  //ū ���� big������ �����ϱ�
			}
		}
		System.out.println("���� ū �� : " + big);
	}
	
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		//Scanner��ü����
		Scanner scan = new Scanner(System.in);
		
		//�Է�
		System.out.println("-1�� �Է��ϱ� ������ �ݺ� �Է�");
		while(true) {
			
			System.out.print("�����Է� : ");
			int num = scan.nextInt();
			if(num==-1)
				break;
			v.add(num);
		}
		if(v.size()==0) {
			System.out.println("�Էµ� �ڷᰡ �����ϴ�");
		}else {
			System.out.println("--���� ū ��--");
			printBig(v);//���� ū���� ���
		}
		
		scan.close();
	}

}
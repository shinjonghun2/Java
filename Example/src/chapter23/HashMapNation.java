package chapter23;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapNation {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<String,Integer>();
		
		
		System.out.println("�����̸��� �α��� �Է��ϼ��� . (�� : Korea 5000)");
		//�Է� ��
		while(true){//"�׸�"�� �Էµɶ����� �Է��� �ݺ�
			System.out.print("�����̸�, �α� >> ");
			//scanner�� �Է¹������� �����濡 ���� 
			String nation = scan.next();
			//�����濡 �׸��̶�� ���ڰ� ������ break
			if(nation.equals("�׸�")) {
				break;
			}
			//�α��� �Է¹޾� population�����濡 ���� 
			int population = scan.nextInt();
			nations.put(nation, population); //�ؽø� �����̸��� �α� ����
			
		}
		
		//�Է°˻���
		while(true) {
			System.out.print("�α� �˻�>>");
			String search = scan.next();
			if(search.equals("�׸�")) {
				break;
			}
			if(nations.get(search)!= null)
				System.out.println(search+ "�� �α��� " + nations.get(search));
			else {
				System.out.println(search + "����� �����ϴ�");
			}
		
			
			}
		scan.close();
	}
		
	}


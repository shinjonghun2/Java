package pk23;

import java.util.StringTokenizer;

public class StTokenizer {

	public static void main(String[] args) {
		String str = "Hava a Nice Day";
		//StringTokenizer
		//(�ڸ��� ���� ���ڿ�, �ڸ��� ���ع����� ����, �ڸ��� ������ ����������)
		
		
		StringTokenizer obj = new StringTokenizer(str," ",false);

		//StringTokenizer.hasMore()- Token�� ����Ǿ��ִ� �迭		
		while(obj.hasMoreTokens()) {
		String t = obj.nextToken();
		System.out.println(t);
		
		}
	}

}

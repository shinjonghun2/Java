package pk26.arraylist;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		Queue<Message> messageQueue = new LinkedList<Message>();
		//offer : ���� , poll :�������� 
		
		messageQueue.offer(new Message("sendMail","ȫ�浿"));
		messageQueue.offer(new Message("sendSMS","�Ӳ���"));
		messageQueue.offer(new Message("sendKakaotalk","ȫ�α�"));
		//empty   : �񵿱�ȭ�� �����ϸ鼭 ����ִ� ���� 0���� True�� ��ȯ
		//isEmpty : ����ȭ�� �����ϸ� null�� ���� (�� ��ü�� �� �����Ƿ� ��������� null������ �ʱ�ȭ��)
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "�Կ��� ������ ���½��ϴ�.");
				break;
			case "sendSMS":
				System.out.println(message.to + "�Կ��� ���ڸ� ���½��ϴ�.");
				break;
			case "sendKakaotalk":
			    System.out.println(message.to + "�Կ��� ���� ���½��ϴ�.");
				break;

			default:
				break;
			}
		}
		
	}
}

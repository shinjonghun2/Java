package pk26.arraylist;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		Queue<Message> messageQueue = new LinkedList<Message>();
		//offer : 삽입 , poll :꺼내오기 
		
		messageQueue.offer(new Message("sendMail","홍길동"));
		messageQueue.offer(new Message("sendSMS","임꺽정"));
		messageQueue.offer(new Message("sendKakaotalk","홍두깨"));
		//empty   : 비동기화를 제공하면서 비어있는 공간 0으로 True값 반환
		//isEmpty : 동기화를 제공하며 null값 인지 (즉 객체가 들어가 있으므로 비어있으면 null값으로 초기화됨)
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냈습니다.");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 문자를 보냈습니다.");
				break;
			case "sendKakaotalk":
			    System.out.println(message.to + "님에게 톡을 보냈습니다.");
				break;

			default:
				break;
			}
		}
		
	}
}

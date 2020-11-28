package structural.decorator;

public class SimpleNotification implements Notification {

	@Override
	public void sendNotification(String content) {
		System.out.println("Sending simple notification >> " + content);		
	}
	
}

package structural.decorator;

public class FacebookNotification extends MediaNotification {
	
	public FacebookNotification(Notification wrappee) {
		super(wrappee);
	}

	public void sendNotification(String content) {
		super.sendNotification(content);
		System.out.println("Sending Facebook notification >> " + content);
	}
	
}

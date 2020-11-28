package structural.decorator;

public class WhatsappNotification extends MediaNotification {

	public WhatsappNotification(Notification wrappee) {
		super(wrappee);
	}
	
	public void sendNotification(String content) {
		super.sendNotification(content);
		System.out.println("Sending Whatsapp notification >> " + content);
	}

}

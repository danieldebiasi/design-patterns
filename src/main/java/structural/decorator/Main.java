package structural.decorator;

public class Main {

	public static void main(String[] args) {
		
		MediaNotification mediaNotification = new FacebookNotification(
												new WhatsappNotification(
														new SimpleNotification()));
		
		mediaNotification.sendNotification("notification content");
	}
	
}

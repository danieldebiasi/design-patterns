package structural.decorator;

abstract class MediaNotification implements Notification {

	private Notification wrappee;
	
	public MediaNotification(Notification wrappee) {
		this.wrappee = wrappee;
	}
	
	@Override
	public void sendNotification(String content) {
		wrappee.sendNotification(content);		
	}

}

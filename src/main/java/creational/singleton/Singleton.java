package creational.singleton;

public class Singleton {

	private static Singleton singleton;
	private String singletonInfo = "default singleton info";
	
	private Singleton() {}
	
	public static Singleton getInstance( ) {
		if(singleton == null) {
			singleton = new Singleton();
		}
		
		return singleton;
	}
	
	public String getSingletonInfo() {
		return this.singletonInfo;
	}
	
	public void setSingletonInfo(String info) {
		this.singletonInfo = info;
	}
	
}

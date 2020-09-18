package creational.singleton;

public class Main {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		System.out.println("Singleton 1 info: " + s1.getSingletonInfo());
		System.out.println("Singleton 2 info: " + s2.getSingletonInfo());
		System.out.println("Singleton 3 info: " + s3.getSingletonInfo());
		
		s1.setSingletonInfo("new info singleton");
		
		System.out.println("Singleton 1 info: " + s1.getSingletonInfo());
		System.out.println("Singleton 2 info: " + s2.getSingletonInfo());
		System.out.println("Singleton 3 info: " + s3.getSingletonInfo());
	}
	
}

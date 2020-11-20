package structural.bridge;

public class Main {

	public static void main(String[] args) {
		//Remote remote = new Remote(new TvDevice());
		Remote remote = new Remote(new DvdDevice());
		
		remote.togglePower();
		
		remote.showCurrentVolume();
		remote.volumeUp();
		remote.showCurrentVolume();
		remote.volumeUp();
		remote.showCurrentVolume();
		remote.volumeDown();
		remote.showCurrentVolume();
		
		remote.togglePower();
	}
	
}

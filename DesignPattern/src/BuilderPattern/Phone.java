package BuilderPattern;

public class Phone {

	private String os;
	private int ram;
	private double screenSize;
	private int battery;
	
	
	public Phone(String os, int ram, double screenSize, int battery) {
		super();
		this.os = os;
		this.ram = ram;
		this.screenSize = screenSize;
		this.battery = battery;
	}


	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", screenSize=" + screenSize + ", battery=" + battery + "]";
	}
	
}

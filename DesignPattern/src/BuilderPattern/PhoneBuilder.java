package BuilderPattern;

public class PhoneBuilder {
	
	private String os;
	private int ram;
	private double screenSize;
	private int battery;
	
	
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setRam(int i) {
		this.ram = i;
		return this;
	}
	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	
	public Phone getPhone(){
		return new Phone(os,ram,screenSize,battery);
	}


}

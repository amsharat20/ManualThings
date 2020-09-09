package AbstractFactory;

public class Server {
	
	private String ram;
    private String hdd;
    private String CPU;
	
    public Server(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.CPU = cpu;
	}

	public String getRam() {
		return ram;
	}

	public String getHdd() {
		return hdd;
	}

	public String getCPU() {
		return CPU;
	}

}

package AbstractFactory;

public class FactoryServer implements ComputerAbstractFactory  {

	private String ram;
	private String hdd;
	private String cpu;
	
	public FactoryServer(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}

	@Override
	public Computer createComputer() {
		return new PC(ram,hdd,cpu);
	}
}

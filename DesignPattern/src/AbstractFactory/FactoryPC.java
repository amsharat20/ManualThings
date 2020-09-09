package AbstractFactory;

public class FactoryPC implements ComputerAbstractFactory {
	
	private String ram;
	private String hdd;
	private String cpu;
	
	public FactoryPC(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}

	@Override
	public Computer createComputer() {
		return new PC(ram,hdd,cpu);
	}

}

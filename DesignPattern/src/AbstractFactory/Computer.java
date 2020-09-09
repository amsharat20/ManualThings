package AbstractFactory;

public abstract class Computer {
	
	public abstract String getRam();
	public abstract String getHdd();
	public abstract String getCPU();
	
	
	@Override
	public String toString() {
		return "Computer [getRam()=" + getRam() + ", getHdd()=" + getHdd() + ", getCPU()=" + getCPU() + "]";
	}
	
	
	
}

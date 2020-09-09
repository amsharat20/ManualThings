package AbstractFactory;

public class FactoryComputer {
	

	public static Computer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
	}

}

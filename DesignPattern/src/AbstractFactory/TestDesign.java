package AbstractFactory;

public class TestDesign {

	public static void main(String[] args) {
		testAbstractFactory();
	}

	private static void testAbstractFactory() {
		Computer pc = FactoryComputer.getComputer(new FactoryPC("2 GB","500 GB","2.4 GHz"));
		Computer server = FactoryComputer.getComputer(new FactoryServer("16 GB","1 TB","2.9 GHz"));
		System.out.println("AbstractFactory PC Config::"+pc);
		System.out.println("AbstractFactory Server Config::"+server);
	}
}

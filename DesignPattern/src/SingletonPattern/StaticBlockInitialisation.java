package SingletonPattern;

//Both eager initialization and static block initialization creates the instance even before it’s being used

public class StaticBlockInitialisation {


	private static StaticBlockInitialisation instance;

	private StaticBlockInitialisation(){

	}
	
	//static block initialization for exception handling

	static {
		try {
			instance = new StaticBlockInitialisation();
		} catch (Exception e){
			throw new RuntimeException("Exception occured ");
		}
	}


	public static StaticBlockInitialisation getInstance(){
		return instance;
	}
}


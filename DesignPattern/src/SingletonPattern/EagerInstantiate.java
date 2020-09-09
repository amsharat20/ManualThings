package SingletonPattern;


//The instance of Singleton Class is created at the time of class loading

public class EagerInstantiate {
	
	private static final EagerInstantiate instance = new EagerInstantiate();
	
	private EagerInstantiate(){
		
	}
	
	public static EagerInstantiate getInstance(){
		return instance;
	}
	

}

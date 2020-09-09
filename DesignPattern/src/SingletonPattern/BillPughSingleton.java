package SingletonPattern;

public class BillPughSingleton {
	
private BillPughSingleton(){}
    
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    
    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }

}

//different approach to create the Singleton class using an inner static helper class
///the private inner static class that contains the instance of the singleton class.

//When the singleton class is loaded, SingletonHelper class is not loaded into memory and only when someone calls the getInstance method,
//this class gets loaded and creates the Singleton class instance.

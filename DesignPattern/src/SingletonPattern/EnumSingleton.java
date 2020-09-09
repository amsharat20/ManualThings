package SingletonPattern;

public enum EnumSingleton {
	
      INSTANCE;
    
    public static void doSomething(){
        //do something
    }

}

// use of Enum to implement Singleton design pattern as Java ensures 
// that any enum value is instantiated only once in a Java program

//The drawback is that the enum type is somewhat inflexible; for example, it does not allow lazy initialization.
package SingletonPattern;

import java.io.Serializable;

public class BreakSingletonSerialized implements Serializable {
	
	private static final long serialVersionUID = -7604766932017737115L;

    private BreakSingletonSerialized(){}
    
    private static class SingletonHelper{
        private static final BreakSingletonSerialized instance = new BreakSingletonSerialized();
    }
    
    public static BreakSingletonSerialized getInstance(){
        return SingletonHelper.instance;
    }
	
}


// destroys the singleton pattern, to overcome this scenario all we need to do it provide the implementation of readResolve()

// protected Object readResolve() {
//   return getInstance();
// }
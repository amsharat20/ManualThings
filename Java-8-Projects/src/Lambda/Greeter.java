package Lambda;

public class Greeter {
	
	public static void main(String[] args) {
		Greeter greet = new Greeter();
		
		HelloWorldGreeting hello = new HelloWorldGreeting();
		
		greet.greetMethod(hello);
	}

	public void greetMethod(Greeting greeting){
		greeting.perform();
	}
}

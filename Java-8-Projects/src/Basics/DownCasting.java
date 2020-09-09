package Basics;

public class DownCasting {

}

class Dog3 extends DownCasting {  
	static void method(DownCasting a) {  
		if(a instanceof Dog3){  
			Dog3 d=(Dog3)a;//downcasting  
			System.out.println("ok downcasting performed");  
		}  
	}  

	public static void main (String [] args) {  
		DownCasting a=new Dog3();  
		Dog3.method(a);  
	}  

}  

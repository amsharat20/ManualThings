package FactoryPattern;

public class FactoryMain {
	
	//Factory Design Method Pattern defines an interface or abstract class for creating an object 
	//but let the subclasses decide which class to instantiate

	public static void main(String[] args) {
		
	/*	OS obj = new Android();
		obj.OS();*/
		
		OperatingFactory factory = new OperatingFactory(); //factory object
		OS obj = factory.getInstance("Open");
		obj.OS();
		
	}
}

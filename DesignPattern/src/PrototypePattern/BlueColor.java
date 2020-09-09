package PrototypePattern;

public class BlueColor extends Color {

	public BlueColor()  
    { 
        this.colorName = "BLUE"; 
    } 
	
	@Override
	void addColor() {
		 System.out.println("BLUE color added"); 
	}
	
}

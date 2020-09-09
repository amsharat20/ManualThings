package PrototypePattern;

public class RedColor extends Color  {

	public RedColor()  
    { 
        this.colorName = "RED"; 
    } 
	
	@Override
	void addColor() {
		 System.out.println("RED color added"); 
	}

}

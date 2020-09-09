package DeepCopy;

import ShallowCopy.Test;

//Contains a reference of Test and implements clone with deep copy


public class TestDeep implements Cloneable {

	int a, b; 
	Test c = new Test(); 

	public Object clone() throws CloneNotSupportedException 
	{ 
		// Assign the shallow copy to new reference variable t 
		TestDeep t = (TestDeep)super.clone(); 

		t.c = new Test(); 

		// Create a new object for the field c and assign it to shallow copy obtained to make it a deep copy  
		return t; 
	} 
}

package ShallowCopy;


//  Shallow copy is method of copying an object and is followed by default in cloning.
//  In this method the fields of an old object X are copied to the new object Y.
//  While copying the object type field the reference is copied to Y i.e object Y will point to same location as pointed out by X. 
//  If the field value is a primitive type it copies the value of the primitive type.
//  Any changes made in referenced objects in object X or Y will be reflected in other object.


public class TestMain {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Test2 t1 = new Test2();
		
		t1.a =10;
		t1.b =20;
		
		t1.c.x =30;
		t1.c.y = 40;
		
		// t1.clone returns the shallow copy of the object t1
		Test2 t2 = (Test2) t1.clone();
		
		t2.a =300; // Creating a copy of object t1 and passing it to t2 

		t2.c.x =400; // Change in primitive type of t2 will not be reflected in t1 field 
		
		System.out.println(t1.a + " " + t1.b + " " +  t1.c.x + " " + t1.c.y); 
        System.out.println(t2.a + " " + t2.b + " " + t2.c.x + " " + t2.c.y);
	    
		
	}

}

package DeepCopy;




public class TestMainDeep {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
	
		TestDeep t1 = new TestDeep();
		
		t1.a =10;
		t1.b =20;
		
		t1.c.x =30;
		t1.c.y = 40;
		
		TestDeep t2 = (TestDeep) t1.clone();
		t2.a =300; 

		t2.c.x =400; // Change in primitive type of t2 will not be reflected in t1 field 
		
		// Change in object type field of t2 will not be reflected in t1(deep copy) 
	       
	       System.out.println(t1.a + " " + t1.b + " " +  t1.c.x + " " + t1.c.y); 
	       System.out.println(t2.a + " " + t2.b + " " +  t2.c.x + " " + t2.c.y); 
	      
	       
//we can see that a new object for Test class has been assigned to copy object that will be returned in clone method.
//Due to this t3 will obtain a deep copy of the object t1.
//So any changes made in ‘c’ object fields by t3 ,will not be reflected in t1
	       
	       
//If we use copy constructor, then we have to copy all of the data over explicitly 
//i.e. we have to reassign all the fields of the class in constructor explicitly
//But in clone method this work of creating a new copy is done by the method itself.
//So to avoid extra processing we use object cloning.
		
	}

}

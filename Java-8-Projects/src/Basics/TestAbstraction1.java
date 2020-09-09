package Basics;

public class TestAbstraction1 {


		public static void main(String args[]){  
			AbstractClassShape s=new Circle1();//In a real scenario, object is provided through method, e.g., getShape() method  
		s.draw();  
		} 
}

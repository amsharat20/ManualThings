package Basics;

public class SuperExPerson {

	int id;  
	String name;  
	SuperExPerson(int id,String name){  
		this.id=id;  
		this.name=name;  
	}  
}  
class Emp extends SuperExPerson{  
	float salary;  
	Emp(int id,String name,float salary){  
		super(id,name);//reusing parent constructor  
		this.salary=salary;  
	}  
	void display(){
		System.out.println(id+" "+name+" "+salary);
		}  
}  
  
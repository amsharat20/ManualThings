package BuilderPattern;

public class Shop {
	
	public static void main(String[] args) {
		
	 /*Phone p = new Phone("android","2gb",5.5,5000); //all parameters need to be passed without builder
	 
	 System.out.println(p);*/
		
		Phone p = new PhoneBuilder().setOs("Android").setRam(2).getPhone();
		System.out.println(p);
		
		
	}

}

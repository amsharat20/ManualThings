
public class demo {
	
	public static void main(String[] args) {
		
		String inputPhoneNum = "12345677899000";
		
		inputPhoneNum = inputPhoneNum.replaceAll(".(?=.{4})", "*");
		
		System.out.println(inputPhoneNum);
		
	}

}

package ObserverPattern;

public class Youtube {
	
	public static void main(String[] args) {
		
		Channel sharat = new Channel();
		
		Subscriber s1 = new Subscriber("Jenny");
		Subscriber s2 = new Subscriber("Harsh");
		Subscriber s3 = new Subscriber("Sonam");
		
		sharat.subscribe(s1);
		sharat.subscribe(s2);
		sharat.subscribe(s3);
		
		sharat.unSubscribe(s3);	
		
		s1.subscribeChannel(sharat);
		s2.subscribeChannel(sharat);
		s3.subscribeChannel(sharat);
		
		sharat.upload("First Video ");
		
	
	}

	
	

}

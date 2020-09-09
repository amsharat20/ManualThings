package ObserverPattern;

public class Subscriber implements Observer {
	
	private String name;
	private Channel channel =new Channel();
	
	/* (non-Javadoc)
	 * @see ObserverPattern.Observer#update()
	 */
	@Override
	public void update(){
		System.out.println("Hey " +name + " video uploaded : " + channel.title);
	}
	
	
	/* (non-Javadoc)
	 * @see ObserverPattern.Observer#subscribeChannel(ObserverPattern.Channel)
	 */
	@Override
	public void subscribeChannel(Channel ch){
		channel =ch;
	}


	public Subscriber(String name) {
		super();
		this.name = name;
	}

}

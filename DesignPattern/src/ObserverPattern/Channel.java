package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject  {
	
	List<Subscriber> subs = new ArrayList<>();
	 String title;
	
	/* (non-Javadoc)
	 * @see ObserverPattern.Subject#subscribe(ObserverPattern.Subscriber)
	 */
	@Override
	public void subscribe(Subscriber sub){
		subs.add(sub);
		
	}
	
	/* (non-Javadoc)
	 * @see ObserverPattern.Subject#unSubscribe(ObserverPattern.Observer)
	 */
	@Override
	public void unSubscribe(Observer sub){
		subs.remove(sub);
	}
	
	
	/* (non-Javadoc)
	 * @see ObserverPattern.Subject#notifySubs()
	 */
	@Override
	public void notifySubs(){
		for(Observer sub: subs){
			sub.update();
		}
	}
	
	/* (non-Javadoc)
	 * @see ObserverPattern.Subject#upload(java.lang.String)
	 */
	@Override
	public void upload(String title){
		this.title =title;
		notifySubs();
		
	}
	
	

}

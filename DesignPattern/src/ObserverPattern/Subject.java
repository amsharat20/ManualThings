package ObserverPattern;

public interface Subject {

	void subscribe(Subscriber sub);

	void unSubscribe(Observer sub);

	void notifySubs();

	void upload(String title);

}
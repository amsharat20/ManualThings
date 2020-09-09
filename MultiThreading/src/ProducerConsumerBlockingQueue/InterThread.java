package ProducerConsumerBlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class InterThread {
	public static void main(String[] args) {
		
		BlockingQueue queue = new LinkedBlockingQueue();

		new Producer(queue);
		new Consumer(queue);
	}
}
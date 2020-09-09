package ProducerConsumerBlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

	private final BlockingQueue queue;
	
	public Consumer(BlockingQueue queue){
		this.queue = queue;
		Thread t1 = new Thread(this, "Consumer");
		t1.start();
	}

	@Override
	public void run() {
		while(true){
			
				try {
					System.out.println("Consumed: " + queue.take());
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		
		try { Thread.sleep(2000); } catch (InterruptedException e) { 	e.printStackTrace();}
		}
	}
	
	
	
}
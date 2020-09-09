package ProducerConsumerWaitNotify;

public class Consumer implements Runnable{

	Queue queue;

	public Consumer(Queue queue){
		this.queue = queue;
		Thread t1 = new Thread(this, "Consumer");
		t1.start();
	}

	@Override
	public void run() {
		while(true){
			try {
				queue.get();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			try { 
				Thread.sleep(2000); 
			} catch (InterruptedException e) { 	
				e.printStackTrace();
			}
		}
	}



}
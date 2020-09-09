package ProducerConsumerWaitNotify;

class Producer implements Runnable{
	
	Queue queue;
	
	public Producer(Queue queue){
		this.queue = queue;
		Thread t1 = new Thread(this, "Producer");
		t1.start();
	}

	@Override
	public void run() {
		int i = 0;
		while(true){
			try {
				queue.put(i++);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		try { Thread.sleep(1000); } catch (InterruptedException e) { 	e.printStackTrace();}
		}
	}
}
package ProducerConsumerWaitNotify;

class Queue {

	int num;
	boolean valueset = false;
	
	public synchronized void put(int num) throws InterruptedException{
		while(valueset){
			wait();
		}
		System.out.println("Put : "+num);
		this.num = num;
		valueset = true;
		notify();
	}
	
	public synchronized void get() throws InterruptedException{
		while(!valueset){
			wait();
		}
		System.out.println("Get : "+num);
		valueset = false;
		notify();
	}
}



public class InterThread {
	public static void main(String[] args) {
		Queue queue = new Queue();
		new Producer(queue);
		new Consumer(queue);
	}
}
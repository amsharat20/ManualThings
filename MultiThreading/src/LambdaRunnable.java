
public class LambdaRunnable {
	
	public static void main(String[] args) throws InterruptedException {
		
		Runnable obj1 = new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<=5;i++){
					System.out.println("Hello");{
						try {
							Thread.sleep(50);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					
				}
			}
		};
   Thread obj2 = new Thread( () -> 
             {
				for(int i=1;i<=5;i++)
				{
					System.out.println("hi");{
						
							try {
								Thread.sleep(50);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					}
				}
		);
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
		
			/*t1.join();
			t2.join();*/
	
		System.out.println();
		
	}

}

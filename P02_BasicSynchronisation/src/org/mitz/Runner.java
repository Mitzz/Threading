package org.mitz;

public class Runner extends Thread{
	
	long sleepTime ;
	
	public Runner() {
		sleepTime = 100;
	}
	
	public Runner(long sleepTime) {
		this.sleepTime = sleepTime;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello " + i);
			
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

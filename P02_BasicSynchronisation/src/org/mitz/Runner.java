package org.mitz;

public class Runner extends Thread{
	private volatile boolean running = true;
	
	public void run() {
		
		while(running){
			System.out.println("Hello");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void shutdown(){
		running = false;
	}
}

package org.mitz;

public class Increment implements Processor{
	
	private int count1;
	private int count2;
	
	public synchronized void incrementCount1(){
		sleep(1);
		count1++;
	}
	
	public synchronized void incrementCount2(){
		sleep(1);
		count2++;
	}
	
	public void process(){
		
		for(int i = 0; i < 1000; i++){
			incrementCount1();
			incrementCount2();
		}
	}

	private void sleep(int i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void displayValues(){
		System.out.println("Counter one value: " + count1);
		System.out.println("Counter two value: " + count2);
	}
}

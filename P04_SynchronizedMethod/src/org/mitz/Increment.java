package org.mitz;

public class Increment {
	
	private int count1;
	private int count2;
	
	public void incrementCount1(){
		count1++;
	}
	
	public void incrementCount2(){
		count2++;
	}
	
	public void process(){
		sleep(100);
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

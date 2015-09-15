package org.mitz;

public class Increment {

	private int counter1;
	private int counter2;
	
	public void process(){
		for (int i = 0; i < 100; i++) {
			increment1();
			increment2();
		}
	}
	
	public void increment1(){
		sleep(1);
		counter1++;
	}
	
	public void increment2(){
		sleep(1);
		counter2++;
	}
	
	private void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void displayValues(){
		System.out.println("Counter 1: " + counter1);
		System.out.println("Counter 2: " + counter2);
	}
}
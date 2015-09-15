package org.mitz;

class Increment implements Processor{
	private int count;
	
	public void increment(){
		count++;
	}
	
	public void process(){
		sleep(10);
		for(int i = 0; i < 10000; i++)
			increment();
	}
	
	private void sleep(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public int getCount(){
		return count;
	}
}
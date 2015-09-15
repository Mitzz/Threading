package org.mitz;

public class Program {

	public static void main(String[] args) {
		
		Increment increment = new Increment();
		Stopwatch watch = new Stopwatch();
		
		Worker worker = new Worker(increment);
		
		Thread t1 = new Thread(worker);
		Thread t2 = new Thread(worker);
		Thread t3 = new Thread(worker);
		Thread t4 = new Thread(worker);
		Thread t5 = new Thread(worker);
		Thread t6 = new Thread(worker);
		
		t1.start(); t2.start();
		t3.start(); t4.start();
		t5.start(); t6.start();
		
		try {
			t1.join(); t2.join();
			t3.join(); t4.join();
			t5.join(); t6.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Time taken: " + watch.getElapsedTime());
		increment.displayValues();
		
	}
}

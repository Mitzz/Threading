package org.mitz;

public class Program {

	public static void main(String[] args) {
		Increment increment = new Increment();
		Worker worker = new Worker(increment);
		Thread t1 = new Thread(worker);
		Thread t2 = new Thread(worker);
		Stopwatch watch = new Stopwatch();
		
		t1.start();
		t2.start();
		
		try {
			t1.join(); t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Time Taken: " + watch.getElapsedTime());
		System.out.println("Count: " + increment.getCount());
	}
}
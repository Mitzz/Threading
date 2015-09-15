package org.mitz;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Program {

	public static void main(String[] args) {
		
		Increment increment = new Increment();
		Stopwatch watch = new Stopwatch();
		
		Worker worker = new Worker(increment);
		
		ExecutorService factory = Executors.newFixedThreadPool(6);
		
		for (int i = 0; i < 6; i++) {
			factory.submit(worker);
		}
		
		factory.shutdown();
		
		try {
			factory.awaitTermination(1, TimeUnit.MINUTES);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Time taken: " + watch.getElapsedTime());
		increment.displayValues();
		
	}
}

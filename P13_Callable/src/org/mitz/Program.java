package org.mitz;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Program {
	
	public static void main(String[] args) {
		Processor processor = new Processor();
		Worker worker = new Worker(processor);
		
		ExecutorService executorService = Executors.newCachedThreadPool();
		executorService.submit(worker);
		executorService.shutdown();
		
		try {
			executorService.awaitTermination(1, TimeUnit.MINUTES);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Some thing to add in stage 1");
	}

	
	
	
	
	
}

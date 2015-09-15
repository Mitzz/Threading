package org.mitz;

import java.util.Random;

public class Processor {
	
	public void process(){
		Random random = new Random();

		int duration = random.nextInt(4000);

		System.out.println("Time: " + duration);

		try {
			Thread.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Terminating thread.");
	}

}

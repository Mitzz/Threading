package org.mitz;

public class Program {

	public static void main(String[] args) {
		
		Increment increment = new Increment();
		Stopwatch watch = new Stopwatch();
		
		increment.process();
		increment.process();
		
		System.out.println("Time taken: " + watch.getElapsedTime());
		increment.displayValues();
		
	}
}

package org.mitz;

public class Program {

	public static void main(String[] args) {
		Stopwatch stopwatch = new Stopwatch();
		Increment increment = new Increment();
		
		increment.process();
		
		System.out.println("Time Taken: " + stopwatch.getElapsedTime());
		increment.displayValues();
	}
}

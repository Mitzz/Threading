package org.mitz;

public class Stopwatch {
	
	private long startTime;
	
	public Stopwatch(){
		startTime = System.currentTimeMillis();
	}
	
	public long getElapsedTime(){
		return (System.currentTimeMillis() - startTime);
	}

	
}

package org.mitz;

public class Worker implements Runnable{
	private Processor processor;
	
	public Worker(Processor processor) {
		this.processor = processor;
	}

	@Override
	public void run() {
		processor.process();
	}

}

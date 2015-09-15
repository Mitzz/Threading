package org.mitz;

public class Program{

	public static void main(String[] args) {
		Runner run1 = new Runner(200);
		run1.start();

		Runner run2 = new Runner();
		run2.start();
	}

}

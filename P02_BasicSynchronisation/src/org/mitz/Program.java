package org.mitz;

import java.util.Scanner;

public class Program{

	public static void main(String[] args) {
		Runner p1 = new Runner();
		
		p1.start();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Press Enter to terminate the thread");
		s.nextLine();
		
		p1.shutdown();
	}

}

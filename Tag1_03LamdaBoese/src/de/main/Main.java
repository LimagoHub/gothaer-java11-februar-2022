package de.main;

public class Main {

	private int y = 5;
	public static void main(String[] args) {
		new Main().run();

	}

	private void run() {
		Runnable runnable = demo();
		runnable.run();
		
		
	}
	
	private Runnable demo() {
		final int x = 2;
		return ()->System.out.println(10 * y++);
	}

	
//	private void foo() {
//		System.out.println(10);
//	}
}

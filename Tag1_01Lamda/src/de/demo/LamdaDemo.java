package de.demo;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class LamdaDemo {
	public static void main(String[] args) {
		new LamdaDemo().run();
	}

	private void run() {
		MyPtr pointer = this::foo;
		int ergebnis = pointer.bla();
		System.out.println(ergebnis);
		
		MyPtr xyz = new MyPtr() {
			public int bla() {
				return LamdaDemo.this.foo();
			}
		};
		ergebnis =  xyz.bla();
		System.out.println(ergebnis);
		
		
		Supplier<Integer> supplier1 = this::foo;
		ergebnis = supplier1.get();
		
		Consumer<String> consumer = System.out::println;
		consumer.accept("Hallo");
		
		MyOtherPtr brainFuck =  x-> System.out.println("BrainFuck: " + x);
		brainFuck.blupp("Demo.....");
	}
	
	private int foo() {
		return 42;
	}
	
	private void bar(String s) {
		System.out.println("Bar: " + s);
	}
	

	
	// SAM Single Abstract Method interface
	@FunctionalInterface
	interface MyPtr {
		int bla();
		
	}
	
	interface MyOtherPtr {
		void blupp(String s);
	}
}

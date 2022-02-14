package de.container;

import java.util.Iterator;
import java.util.function.Consumer;

public class Container {
	private final String strings[] = {"Eins","Zwei","Drei", "Vier"};
	
	private int index = 0;
	
	public String getActual() {
		return strings[index];
	}
	
	private void next() {
		index ++;
		index %= strings.length;
	}
	
	public void forEach(Consumer<String> consumer) {
		for (int i = 0; i < strings.length; i++) {
			consumer.accept(getActual());
			next();
		}
		
	}
}

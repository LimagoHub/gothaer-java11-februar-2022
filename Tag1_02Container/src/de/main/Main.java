package de.main;

import java.util.Iterator;
import java.util.List;

import de.container.Container;

public class Main {

	public static void main(String[] args) {
		Container container = new Container();
		
		container.forEach(System.out::println);

		container.forEach(s->System.out.println(s.toUpperCase()));
		
		List<Integer> ints = List.of(10,20,30,40);
		ints.forEach(System.out::println);
		
		ints.forEach(zahl->System.out.println(zahl * zahl));
		
	}

}

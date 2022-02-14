package de.main;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import de.tiere.*;

public class Main {

	public static void main(String[] args) {
		
		Comparator<Schwein> c = new Comparator<Schwein>() {

			@Override
			public int compare(Schwein o1, Schwein o2) {
				
				return o1.getName().compareTo(o2.getName());
			}
		};
		
		
		Set<Schwein> zahlen = new TreeSet<>(c);
		
		zahlen.add(new Schwein("Eins",10));
		zahlen.add(new Schwein("Zwei",12));
		zahlen.add(new Schwein("Drei",11));
		zahlen.add(new Schwein("Vier",15));
		zahlen.add(new Schwein("Fünf",13));
		
		
		zahlen.forEach(System.out::println);
	}
}

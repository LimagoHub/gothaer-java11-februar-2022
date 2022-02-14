package de.main;


import java.lang.System.Logger;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import de.tiere.*;

public class Main {

	Logger logger = System.getLogger(this.getClass().getName());
	
	public static void main(String[] args) {
		
		Comparator<Schwein> c = Comparator.nullsFirst(Comparator.naturalOrder());
		//c = c.thenComparing(Comparator.comparingInt(Schwein::getGewicht));
		
		Set<Schwein> zahlen = new TreeSet<>(c);
		
		zahlen.add(new Schwein("Eins",10));
		zahlen.add(new Schwein("Eins",12));
		zahlen.add(new Schwein("Eins",11));
		zahlen.add(new Schwein(null,11));
		zahlen.add(new Schwein("Drei",11));
		zahlen.add(new Schwein("Vier",15));
		zahlen.add(new Schwein("Fünf",13));
		
		
		zahlen.forEach(System.out::println);
	}
}

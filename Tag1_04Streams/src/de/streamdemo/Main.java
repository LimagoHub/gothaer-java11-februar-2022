package de.streamdemo;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		new Main().run();
	}

	private void run() {
		List<Schwein> liste = List.of(
				new Schwein("Piggy",10),
				new Schwein("Babe",12),
				new Schwein("Piggy",13),
				new Schwein("Rudi",10));
		
		Stream<Schwein> myStream = liste.stream();
		
//		List<String> ergebnis = myStream
//		
//		.filter(s->s.endsWith("ei"))
//		.collect(Collectors.toList());
		
		Map<String, IntSummaryStatistics> map = myStream
		.collect(Collectors.groupingBy(Schwein::getName, Collectors.summarizingInt(Schwein::getGewicht)));
		
		map.forEach((k,v)->System.out.printf("Summe von %s =%s\n", k,v.getAverage()));
		
	}
	
	
}

class Schwein {
	private String name;
	private int gewicht;
	public Schwein(String name, int gewicht) {
		super();
		this.name = name;
		this.gewicht = gewicht;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGewicht() {
		return gewicht;
	}
	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}
	@Override
	public String toString() {
		return "Schwein [name=" + name + ", gewicht=" + gewicht + "]";
	}
	
	
	
}


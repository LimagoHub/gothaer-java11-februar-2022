package de.limago.streamtest;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeGenerator {
	
	public List<Integer> findPrimesUpTo(final int range) {
		final IntStream intStream = IntStream.rangeClosed(2, range);
		return intStream
				.filter(this::isPrime)
				.mapToObj(p->Integer.valueOf(p))
				.collect(Collectors.toList());
	}
	
	private boolean isPrime(int possiblePrime) {
		if(possiblePrime == 1) return false;
		for (int i = 2; i <= possiblePrime / 2; i++) {
			if(possiblePrime % i == 0) return false;
		}
		return true;
	}

}

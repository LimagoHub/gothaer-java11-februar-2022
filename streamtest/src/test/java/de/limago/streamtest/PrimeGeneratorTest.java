package de.limago.streamtest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PrimeGeneratorTest {

	@InjectMocks private PrimeGenerator objectUnderTest;
	
	@Test
	void findPrimesUpTo_range1To20_returnsListOf8Primes() {
		
		List<Integer> result = objectUnderTest.findPrimesUpTo(20);
		
		assertThat(result,  contains(2,3,5,7,11,13,17,19));
		assertThat(result,  hasSize(8));
	}
}

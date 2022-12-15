package p5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EvenOddTest {
	@Test
	public void validateTwelve() {
		
		assertEquals(true,FindEvenOdd.validateEvenOdd(12));
	}
	@Test
	public void validateTwentyOne() {
		
		assertEquals(true,FindEvenOdd.validateEvenOdd(20));
	}
	
}

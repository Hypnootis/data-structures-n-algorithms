package dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BitOperatorTest {
	
	@Test
	void testCountBits() {
		assertEquals(1, BitOperator.countSetBits(2));
		assertEquals(1, BitOperator.countSetBits(1));
		assertEquals(1, BitOperator.countSetBits(256));
		assertEquals(2, BitOperator.countSetBits(17));
		assertEquals(5, BitOperator.countSetBits(55));
		assertEquals(30, BitOperator.countSetBits(-2));

	}


}

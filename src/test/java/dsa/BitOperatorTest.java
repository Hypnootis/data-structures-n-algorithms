package dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BitOperatorTest {
	
	@Test
	void testCountBits() {
		assertEquals(1, BitOperator.countSetBitsString(2));
		assertEquals(1, BitOperator.countSetBitsString(1));
		assertEquals(1, BitOperator.countSetBitsString(256));
		assertEquals(2, BitOperator.countSetBitsString(17));
		assertEquals(5, BitOperator.countSetBitsString(55));
		assertEquals(30, BitOperator.countSetBitsString(-2));

	}

}

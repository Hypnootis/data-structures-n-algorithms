package dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import dsa.bitoperations.BitOperator;

class BitOperatorTest {
	
	@Test
	void testCountBits() {
		assertEquals(1, BitOperator.countSetBitsString(2, false));
		assertEquals(1, BitOperator.countSetBitsString(1, false));
		assertEquals(1, BitOperator.countSetBitsString(256, false));
		assertEquals(2, BitOperator.countSetBitsString(17, false));
		assertEquals(5, BitOperator.countSetBitsString(55, false));
		assertEquals(30, BitOperator.countSetBitsString(-2, false));
	}

}

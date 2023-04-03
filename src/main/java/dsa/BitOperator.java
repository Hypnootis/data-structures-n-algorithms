package dsa;

public class BitOperator {

	public static int countSetBitsString(int number) {
		int manipulatedNum = number; 
		int setBits = 0;
		for (int i = 0; i < 31; i++) {
			if ((manipulatedNum & 1) == 1) { // charAt() returns a char, so checking for a char
				setBits++;
			}
			manipulatedNum >>= 1;
		}

		return setBits;
	}
}
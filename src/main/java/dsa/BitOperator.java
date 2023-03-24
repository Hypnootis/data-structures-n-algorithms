package dsa;

public class BitOperator {

	public static int countSetBits(int number) {
		String binaryString = Integer.toBinaryString(number);
		int setBits = 0;
		for (int i = 0; i < binaryString.length(); i++) {
			if (binaryString.charAt(i) == '1') { // charAt() returns a char, so checking for a char
				setBits++;
			}
		}

		return setBits;
	}
}
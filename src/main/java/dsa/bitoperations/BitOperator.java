package dsa.bitoperations;

public class BitOperator {

	public static int countSetBitsString(int number, boolean log) {
		int manipulatedNum = number; 
		int setBits = 0;
		for (int i = 0; i < 31; i++) {
			if ((manipulatedNum & 1) == 1) { 
				setBits++;
			}
			manipulatedNum >>= 1;
		}
		if (log) {
			System.out.println("Set bits: " + setBits);
		}

		return setBits;
	}

	public static int[] bitSplitter(int number, boolean log) {
		// Set log to true if you want to print the results
		int newNumber = number;
		int[] bits = new int[4];
		System.out.print("Bits in hexadecimal: ");
		for (int i = 0; i < 4; i++) {
			bits[i] = newNumber & 255;
			if (log) {
				System.out.printf("%x", bits[i]);
				System.out.print(" ");
			}
			newNumber >>= 8;
			}
		System.out.print("\n");
		return bits;
	}
}
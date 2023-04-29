import dsa.BitOperator;

public class Main {
    public static void main(String args[]) {
        int[][] vittu = paska(256);
        for (int i = 3; i >= 0; i--) {
            System.out.print("Byte " + (4 - i) + ": ");
            for (int j = 7; j >= 0; j--) {
                System.out.print(vittu[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static int[][] paska(int number) {
        int newNumber = number;
        int[][] bits = new int[4][8];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                if ((newNumber & 1) == 1) { 
                System.out.println("New number: " + newNumber);
                bits[i][j] = 1;
                } else {
                    bits[i][j] = 0;
                }
                newNumber >>= 1;
            }
        }
        return bits;
    }
}

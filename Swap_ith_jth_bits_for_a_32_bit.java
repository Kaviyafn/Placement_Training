import java.util.Scanner;

public class Swap_ith_jth_bits_for_a_32_bit {
    public static String toBinaryString32(int num) {
        StringBuilder binary = new StringBuilder();
        for (int i = 31; i >= 0; i--) {
            binary.append((num >>> i) & 1);
        }
        return binary.toString();
    }
    public static int swapBits(int num, int i, int j) {
        if (i < 0 || i > 31 || j < 0 || j > 31) {
            System.out.println("Error: Bit positions must be between 0 and 31.");
            return num;

        }

        int bit1 = (num >>> i) & 1;
        int bit2 = (num >>> j) & 1;

        if (bit1 != bit2) {
            num = num ^ ((1 << i) | (1 << j));
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        System.out.print("Enter first bit position to swap: ");
        int i = scanner.nextInt();

        System.out.print("Enter second bit position to swap: ");
        int j = scanner.nextInt();

        System.out.println("Before: " + toBinaryString32(num));

        num = swapBits(num, i, j);

        System.out.println("After:  " + toBinaryString32(num));

        scanner.close();
    }
}

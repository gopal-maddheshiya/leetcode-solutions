package arrays.lc7_reverse_integer;

public class _02_Optimized {

    public static int reverse(int x) {

        long reversed = 0;

        while (x != 0) {

            int digit = x % 10;

            reversed = reversed * 10 + digit;

            x /= 10;
        }

        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) reversed;
    }

    public static void main(String[] args) {
        int x = 123;
        System.out.println(reverse(x));
    }
}
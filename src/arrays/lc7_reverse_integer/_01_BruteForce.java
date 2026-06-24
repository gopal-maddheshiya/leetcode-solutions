package arrays.lc7_reverse_integer;

public class _01_BruteForce {

    public static int reverse(int x) {

        boolean isNegative = x < 0;

        String str = String.valueOf(Math.abs((long) x));

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        long result = Long.parseLong(sb.toString());

        if (isNegative) {
            result = -result;
        }

        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) result;
    }

    public static void main(String[] args) {
        int x = 123;
        System.out.println(reverse(x));
    }
}
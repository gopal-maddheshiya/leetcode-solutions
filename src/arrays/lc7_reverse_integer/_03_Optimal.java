package arrays.lc7_reverse_integer;

public class _03_Optimal {

    public static int reverse(int x) {

        int reversed = 0;

        while (x != 0) {

            int digit = x % 10;

            if (reversed > Integer.MAX_VALUE / 10 ||
                    (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            if (reversed < Integer.MIN_VALUE / 10 ||
                    (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            reversed = reversed * 10 + digit;

            x /= 10;
        }

        return reversed;
    }

    public static void main(String[] args) {
        int x = 123;
        System.out.println(reverse(x));
    }
}
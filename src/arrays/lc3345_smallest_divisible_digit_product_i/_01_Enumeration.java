package arrays.lc3345_smallest_divisible_digit_product_i;

public class _01_Enumeration {

    public static int digitProduct(int n) {
        int product = 1;

        while (n > 0) {
            int lastDigit = n % 10;
            product *= lastDigit;
            n = n / 10;
        }

        return product;
    }

    public static int smallestNumber(int n, int t) {
        while (digitProduct(n) % t != 0) {
            n++;
        }

        return n;
    }

    public static void main(String[] args) {
        int n = 15;
        int t = 3;

        System.out.println(smallestNumber(n, t));
    }
}
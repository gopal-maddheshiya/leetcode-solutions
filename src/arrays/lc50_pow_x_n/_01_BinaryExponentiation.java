package arrays.lc50_pow_x_n;

public class _01_BinaryExponentiation {
    public static double myPow(double x, int n) {
        long binForm = n;

        if (n < 0) {
            x = 1 / x;
            binForm = -binForm;
        }

        double ans = 1;

        while (binForm > 0) {
            if (binForm % 2 == 1) {
                ans *= x;
            }

            x *= x;
            binForm /= 2;

        }

        return ans;
    }

    public static void main(String[] args) {
        double x = 2.00000;
        int n = 10;
        System.out.println(myPow(x,n));
    }
}

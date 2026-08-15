package arrays.lc69_sqrt_x;

public class _01_BinarySearch {

    public static int mySqrt(int x) {

        if (x == 0 || x == 1) {
            return x;
        }

        int start = 1;
        int end = x;
        int ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid <= x / mid) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int x = 8;

        System.out.println(mySqrt(x));
    }
}
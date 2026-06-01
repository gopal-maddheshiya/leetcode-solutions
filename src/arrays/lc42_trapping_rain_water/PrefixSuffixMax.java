package arrays.lc42_trapping_rain_water;

public class PrefixSuffixMax {
    public class prefixsum {

        public static void main(String[] args) {
            int[] arr = {10, 20, -5, -7, -3, 2, 1, 20};
            int[] prefix = new int[arr.length];
            prefix[0] = arr[0];
            for (int i = 1; i < arr.length; i++) {
                prefix[i] = prefix[i - 1] + arr[i];
            }System.out.print("Prefix Sum Array: ");

            for (int num : prefix) {
                System.out.print(num + " ");
            }
        }
    }
}

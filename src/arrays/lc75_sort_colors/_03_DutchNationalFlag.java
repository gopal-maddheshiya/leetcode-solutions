package arrays.lc75_sort_colors;

import java.util.Arrays;

public class _03_DutchNationalFlag {
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sortColors(int[] numbs) {
        int low = 0, mid = 0, high = numbs.length - 1;

        while (mid <= high) {
            if (numbs[mid] == 0) {
                swap(numbs, low, mid);
                low++;
                mid++;
            } else if (numbs[mid] == 1) {
                mid++;
            } else {
                swap(numbs, mid, high);
                high--;
            }
        }
        System.out.println(Arrays.toString(numbs));
    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        sortColors(arr);
    }
}

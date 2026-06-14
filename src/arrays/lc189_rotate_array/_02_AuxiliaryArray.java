package arrays.lc189_rotate_array;

import java.util.Arrays;

public class _02_AuxiliaryArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            int newIdx = (i + k) % n;
            temp[newIdx] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotate(arr, k);
        System.out.println(Arrays.toString(arr));

    }
}

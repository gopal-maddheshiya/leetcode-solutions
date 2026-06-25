package arrays.lc27_remove_element;

import java.util.Arrays;

public class _01_BruteForce {

    public static int removeElement(int[] nums, int val) {

        int[] temp = new int[nums.length];
        int idx = 0;

        for (int num : nums) {
            if (num != val) {
                temp[idx++] = num;
            }
        }

        for (int i = 0; i < idx; i++) {
            nums[i] = temp[i];
        }

        return idx;
    }

    public static void main(String[] args) {

        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int k = removeElement(nums, val);

        System.out.println(k);

        System.out.println(Arrays.toString(Arrays.copyOf(nums, k)));
    }
}
package arrays.lc4_median_of_two_sorted_array;

import java.util.ArrayList;

public class _01_BruteForce {

    public static double median(int[] nums1, int[] nums2) {

        ArrayList<Integer> arr3 = new ArrayList<>();

        int n1 = nums1.length;
        int n2 = nums2.length;

        int i = 0;
        int j = 0;

        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                arr3.add(nums1[i++]);
            } else {
                arr3.add(nums2[j++]);
            }
        }

        while (i < n1) {
            arr3.add(nums1[i++]);
        }

        while (j < n2) {
            arr3.add(nums2[j++]);
        }

        int n = n1 + n2;

        if (n % 2 == 1) {
            return arr3.get(n / 2);
        }

        return ((double) arr3.get(n / 2)
                + (double) arr3.get(n / 2 - 1)) / 2.0;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        System.out.println("Median = " + median(nums1, nums2));

        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};

        System.out.println("Median = " + median(nums3, nums4));
    }
}
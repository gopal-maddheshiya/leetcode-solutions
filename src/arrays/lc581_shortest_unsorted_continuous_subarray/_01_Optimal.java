package arrays.lc581_shortest_unsorted_continuous_subarray;

public class _01_Optimal {
    public static int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int low = 0, high = n - 1;

        while (low + 1 < n && nums[low] <= nums[low + 1]) low++;
        while (high - 1 >= 0 && nums[high - 1] <= nums[high]) high--;

        if (low == n - 1) return 0;

        int wMin = Integer.MAX_VALUE, wMax = Integer.MIN_VALUE;

        for (int i = low; i <= high; i++) {
            wMin = Math.min(wMin, nums[i]);
            wMax = Math.max(wMax, nums[i]);
        }
        while (low - 1 >= 0 && nums[low - 1] > wMin) low--;
        while (high + 1 <= n - 1 && nums[high + 1] < wMax) high++;

        return high - low + 1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 4, 8, 10, 9, 15};
        System.out.println(findUnsortedSubarray(arr));
    }
}

package arrays.lc560_subarray_sum_equals_k;

public class _01_BruteForce {
    public static int subArraySum(int[] nums, int k){
        int n = nums.length;
        int count = 0;

        for(int i = 0; i < n; i++){
            int start = i;
            for(int j = i; j < n; j++){
                int end = j;
                int sum = 0;
                for(int m = start; m <= end; m++){
                    sum += nums[m];
                }
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int k = 2;
        System.out.println(subArraySum(nums, k));
    }
}

package arrays.lc238_product_of_array_except_self;

import java.util.Arrays;

public class _01_BruteForce {
    public static int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, 1);

        for(int i = 0; i < n; i++){

            for(int j = 0; j < n; j++){

                if(i != j){
                    ans[i] *= nums[j];
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
}

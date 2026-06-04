package arrays.lc53_maximum_subarray;

public class _03_KadaneAlgorithm {
    public static int maxSubarray(int[] numbs) {
        int maxSum = numbs[0];
        int currSum = numbs[0];

        for (int i = 1; i < numbs.length; i++) {
            currSum = Math.max(numbs[i], currSum + numbs[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubarray(arr));
    }
}

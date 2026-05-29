package arrays.lc3300_minimum_element_after_replacement_with_digit_sum;

public class DigitSum {
    public static int digitSum(int[] nums){
        int min = Integer.MAX_VALUE;
        for(int num : nums){
            int sum = 0;
            while(num > 0){
                sum += num % 10;
                num /= 10;
            }
            min = Math.min(min, sum);
        }
        return min;
    }
    public static void main(String[] args){
        int[] arr = {999,19,199};
        System.out.println(digitSum(arr));
    }
}

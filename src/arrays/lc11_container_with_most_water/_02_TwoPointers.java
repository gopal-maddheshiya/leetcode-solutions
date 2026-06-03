package arrays.lc11_container_with_most_water;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class _02_TwoPointers {
    public static int maxArea(int[] height){
        int n = height.length;
        int left = 0, right = n - 1;
        int maxWater = 0;

        while(left < right){

            int width = right - left;
            int heightOfBar = min(height[left], height[right]);
            int currWater = width * heightOfBar;
            maxWater = max(maxWater, currWater);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args){
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}

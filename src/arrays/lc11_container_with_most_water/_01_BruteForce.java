package arrays.lc11_container_with_most_water;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class _01_BruteForce {
    public static int maxArea(int[] height){
        int n = height.length;
        int maxWater = 0;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int width = j - i;
                int heightOfBar = min(height[i], height[j]);
                int currentWater = heightOfBar * width;
                maxWater = max(maxWater, currentWater);
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}

package arrays.lc75_sort_colors;

import java.util.Arrays;

public class _01_BruteForce {
    public static void sortColors(int[] numbs){
        Arrays.sort(numbs);
    }

    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
}

package arrays.lc75_sort_colors;

import java.util.Arrays;

public class _02_CountingSort {
    public static void sortColors(int[] numbs){
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int numb : numbs) {
            if (numb == 0) {
                count0++;
            } else if (numb == 1) {
                count1++;
            } else {
                count2++;
            }
        }
        int idx = 0;
        for(int i = 0; i < count0; i++){
            numbs[idx++] = 0;
        }
        for(int i = 0; i < count1; i++){
            numbs[idx++] = 1;
        }
        for(int i = 0; i < count2; i++){
            numbs[idx++] = 2;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
}

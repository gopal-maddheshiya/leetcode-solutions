package arrays.lc2144_minimum_cost_of_buying_candies_with_discount;

import java.util.Arrays;

public class _01_Sorting {
    public static int minimumCost(int[] cost) {

        int n = cost.length;
        Arrays.sort(cost);

        int total = 0;

        for (int i = n - 1; i >= 0; i--) {

            if (((n - 1 - i) % 3) != 2) {
                total += cost[i];
            }

        }
        return total;
    }

    public static void main(String[] args) {
        int[] cost = {6,5,7,9,2,2};
        System.out.println(minimumCost(cost));
    }
}

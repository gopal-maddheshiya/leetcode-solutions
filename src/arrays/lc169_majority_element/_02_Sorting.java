package arrays.lc169_majority_element;

import java.util.Arrays;

public class _02_Sorting {

    public static int MajorityElementOptimize(int[] numbs) {
        Arrays.sort(numbs);

        /*
            Long Approach:

            int n = numbs.length;
            int frequency = 1;
            int ans = arr[0];

            for (int i = 1; i < n; i++) {
                if (numbs[i] == numbs[i - 1]) {
                    frequency++;
                } else {
                    frequency = 1;
                    ans = numbs[i];
                }

                if (frequency > n / 2) {
                    return ans;
                }
            }

            return -1;
        */

        // Short Approach:
        // Majority element will always be present at middle index after sorting
        return numbs[numbs.length / 2];
    }

    public static void main(String[] args) {
        int[] numbs = {1, 1, 1, 2, 2, 2, 2};

        System.out.println(MajorityElementOptimize(numbs));
    }
}

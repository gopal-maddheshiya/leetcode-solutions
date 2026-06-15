package arrays.lc287_find_the_duplicate_number;

import java.util.*;

public class _02_HashSetSolution {
    public static int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int val : nums) {
            if (set.contains(val)) {
                return val;
            }

            set.add(val);
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2};
        System.out.println(findDuplicate(arr));
    }
}

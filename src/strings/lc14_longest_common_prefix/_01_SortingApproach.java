package strings.lc14_longest_common_prefix;

import java.util.Arrays;

public class _01_SortingApproach {

    public static String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];

        int i = 0;

        while (i < first.length() &&
                i < last.length() &&
                first.charAt(i) == last.charAt(i)) {
            i++;
        }

        return first.substring(0, i);
    }

    public static void main(String[] args) {

        String[] strs = {"flower", "flow", "flight"};

        System.out.println(longestCommonPrefix(strs));
    }
}
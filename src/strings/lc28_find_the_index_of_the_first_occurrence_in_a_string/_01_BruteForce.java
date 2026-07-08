package strings.lc28_find_the_index_of_the_first_occurrence_in_a_string;

public class _01_BruteForce {

    public static int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {
            boolean match = true;
            for (int j = 0; j < m; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        String haystack = "sadbutsad";
        String needle = "sad";

        System.out.println(strStr(haystack, needle));
    }
}
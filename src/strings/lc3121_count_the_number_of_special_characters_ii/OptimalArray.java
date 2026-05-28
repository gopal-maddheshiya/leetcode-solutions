package strings.lc3121_count_the_number_of_special_characters_ii;

import java.util.Arrays;

public class OptimalArray {
    public static int specialCharacter(String word) {
        int[] lastLower = new int[26];
        int[] firstUpper = new int[26];

        Arrays.fill(lastLower, -1);
        Arrays.fill(firstUpper, -1);

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);
            if (Character.isLowerCase(ch)) {
                int idx = ch - 'a';
                lastLower[idx] = i;
            }

            else {
                int idx = ch - 'A';
                if (firstUpper[idx] == -1) {
                    firstUpper[idx] = i;
                }
            }
        }
        int count = 0;

        for (int i = 0; i < 26; i++) {

                if (lastLower[i] != -1 &&
                    firstUpper[i] != -1 &&
                    lastLower[i] < firstUpper[i]){
                    count++;
                }
            }
        return count;
    }

    public static void main(String[] args) {
        String str = "aaAbcBC";
        System.out.println(specialCharacter(str));
    }
}

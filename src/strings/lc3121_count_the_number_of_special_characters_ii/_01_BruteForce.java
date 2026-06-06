package strings.lc3121_count_the_number_of_special_characters_ii;

public class _01_BruteForce {
    public static int specialCharacter(String word){

        int count = 0;

        for(int ch = 0; ch < 26; ch++){

            int lastLower = -1;
            int firstUpper = -1;

            for(int i = 0; i < word.length(); i++){

                if(word.charAt(i) == (char)('a' + ch)){
                    lastLower = i;
                }

                else if (word.charAt(i) == (char)('A' + ch) &&
                        firstUpper == -1){
                        firstUpper = i;
                }
            }
                 if(lastLower != -1 &&
                    firstUpper != -1 &&
                    lastLower < firstUpper){
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

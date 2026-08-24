package strings.lc242_valid_anagram;

public class _01_FrequencyArray {
    public static boolean isAnagram(String s, String t){
        int sl = s.length();
        int tl = t.length();

        if(sl != tl)
            return false;

        int[] arr = new int[26];

        for(int i = 0; i < sl; i++){
            arr[s.charAt(i) - 'a']++;
        }

        for(int j = 0; j < tl; j++){
            arr[t.charAt(j) - 'a']--;

            if(arr[t.charAt(j) - 'a'] < 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.print(isAnagram(s, t));
    }
}

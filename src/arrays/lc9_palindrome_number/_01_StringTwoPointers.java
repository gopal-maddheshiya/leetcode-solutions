package arrays.lc9_palindrome_number;

public class _01_StringTwoPointers {

    public static boolean isPalindrome(int x) {
        String xAsString = String.valueOf(x);

        int begin_ptr = 0;
        int end_ptr = xAsString.length() - 1;

        while (begin_ptr <= end_ptr) {
            if (xAsString.charAt(begin_ptr) == xAsString.charAt(end_ptr)) {
                begin_ptr++;
                end_ptr--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }
}
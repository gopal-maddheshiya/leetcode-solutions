package strings.lc43_multiply_strings;

public class _03_Optimal {

    public static String multiply(String num1, String num2) {

        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int m = num1.length();
        int n = num2.length();

        int[] result = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {

            for (int j = n - 1; j >= 0; j--) {

                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';

                int product = digit1 * digit2;

                int p1 = i + j;
                int p2 = i + j + 1;

                int sum = product + result[p2];

                result[p2] = sum % 10;
                result[p1] += sum / 10;
            }
        }

        StringBuilder ans = new StringBuilder();

        for (int digit : result) {

            if (!(ans.length() == 0 && digit == 0)) {
                ans.append(digit);
            }
        }

        return ans.toString();
    }
    public static void main(String[] args) {
        String num1 = "2", num2 = "5";
        System.out.println(multiply(num1, num2));
    }
}
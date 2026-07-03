package strings.lc43_multiply_strings;

public class _01_BruteForce {

    public static String multiply(String num1, String num2) {

        long n1 = Long.parseLong(num1);
        long n2 = Long.parseLong(num2);

        return String.valueOf(n1 * n2);
    }

    public static void main(String[] args) {
        String num1 = "2", num2 = "5";
        System.out.println(multiply(num1, num2));
    }
}
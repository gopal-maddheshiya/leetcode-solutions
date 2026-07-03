package strings.lc43_multiply_strings;

import java.math.BigInteger;

public class _02_Better {

    public static String multiply(String num1, String num2) {

        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);

        return n1.multiply(n2).toString();
    }
    public static void main(String[] args) {
        String num1 = "2", num2 = "5";
        System.out.println(multiply(num1, num2));
    }
}
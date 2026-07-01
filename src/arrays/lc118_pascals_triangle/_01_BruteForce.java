package arrays.lc118_pascals_triangle;

import java.util.*;

public class _01_BruteForce {

    private static int nCr(int n, int r) {
        int result = 1;

        for (int i = 0; i < r; i++) {
            result = result * (n - i);
            result = result / (i + 1);
        }

        return result;
    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {

            List<Integer> currentRow = new ArrayList<>();

            for (int col = 0; col <= row; col++) {
                currentRow.add(nCr(row, col));
            }

            triangle.add(currentRow);
        }

        return triangle;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
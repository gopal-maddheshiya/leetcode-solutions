package arrays.lc118_pascals_triangle;

import java.util.*;

public class _03_Optimal {

    private static List<Integer> generateRow(int row) {

        List<Integer> ans = new ArrayList<>();

        int value = 1;
        ans.add(value);

        for (int col = 1; col <= row; col++) {

            value = value * (row - col + 1);
            value = value / col;

            ans.add(value);
        }

        return ans;
    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {
            triangle.add(generateRow(row));
        }

        return triangle;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
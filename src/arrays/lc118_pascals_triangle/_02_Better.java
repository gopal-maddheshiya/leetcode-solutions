package arrays.lc118_pascals_triangle;

import java.util.*;

public class _02_Better {

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {

            List<Integer> current = new ArrayList<>();

            for (int col = 0; col <= row; col++) {

                if (col == 0 || col == row) {
                    current.add(1);
                } else {
                    current.add(
                            triangle.get(row - 1).get(col - 1)
                                    + triangle.get(row - 1).get(col)
                    );
                }
            }

            triangle.add(current);
        }

        return triangle;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
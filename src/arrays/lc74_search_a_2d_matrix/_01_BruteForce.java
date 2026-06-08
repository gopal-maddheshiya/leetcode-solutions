package arrays.lc74_search_a_2d_matrix;

public class _01_BruteForce {
    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int[] row : matrix) {
            for (int val : row) {
                if (val == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int key = 11;
        System.out.println(searchMatrix(arr, key));
    }
}

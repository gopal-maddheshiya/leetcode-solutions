package arrays.lc74_search_a_2d_matrix;

public class _02_BinarySearch {
    private static boolean searchInRow(int[][] matrix, int target, int row) {
        int n = matrix[0].length;
        int st = 0, end = n - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (target == matrix[row][mid]) {
                return true;
            } else if (target > matrix[row][mid]) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;

        int startRow = 0, endRow = m - 1;
        while (startRow <= endRow) {
            int midRow = startRow + (endRow - startRow) / 2;

            if (target >= matrix[midRow][0] && target <= matrix[midRow][n - 1]) {
                return searchInRow(matrix, target, midRow);
            } else if (target >= matrix[midRow][n - 1]) {
                startRow = midRow + 1;
            } else {
                endRow = midRow - 1;
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

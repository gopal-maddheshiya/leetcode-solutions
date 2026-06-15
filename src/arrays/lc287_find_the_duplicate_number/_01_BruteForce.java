package arrays.lc287_find_the_duplicate_number;

public class _01_BruteForce {
    public static int findDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[j];
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2};
        System.out.println(findDuplicate(arr));
    }
}
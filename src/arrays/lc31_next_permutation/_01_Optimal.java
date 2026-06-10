package arrays.lc31_next_permutation;

import java.util.Arrays;

public class _01_Optimal {

    public static void nextPermutation(int[] numbs) {
        int pivot = -1, n = numbs.length;

        for (int i = n - 2; i >= 0; i--) {
            if (numbs[i] < numbs[i + 1]) {
                pivot = i;
                break;
            }
        }

        if (pivot == -1) {
            reverse(numbs, 0, n - 1);
            return;
        }

        for (int i = n - 1; i > pivot; i--) {
            if (numbs[i] > numbs[pivot]) {
                swap(numbs, i, pivot);
                break;
            }
        }

        int i = pivot + 1, j = n - 1;
        while (i < j) {
            swap(numbs, i++, j--);
        }
    }

    private static void swap(int[] numbs, int i, int j) {
        int temp = numbs[i];
        numbs[i] = numbs[j];
        numbs[j] = temp;
    }

    private static void reverse(int[] numbs, int i, int j) {
        while (i < j) {
            swap(numbs, i++, j--);
        }
    }

    public static void main(String[] args) {
        int[] numbs = {1, 2, 3};

        nextPermutation(numbs);

        System.out.println(Arrays.toString(numbs));
    }
}
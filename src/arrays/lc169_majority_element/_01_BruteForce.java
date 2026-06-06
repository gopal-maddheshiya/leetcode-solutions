package arrays.lc169_majority_element;

public class _01_BruteForce {
    public static int MajorityElementBruteForce(int[] numbs) {
        int n = numbs.length;
        for (int val : numbs) {
            int frequency = 0;
            for (int ele : numbs) {
                if (val == ele) {
                    frequency++;
                }
                if (frequency > n / 2) {
                    return val;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbs = {1, 1, 1, 2, 2, 2, 2};
        System.out.println(MajorityElementBruteForce(numbs));
    }
}
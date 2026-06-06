package arrays.lc169_majority_element;

public class _03_MooreVoting {
    public static int MajorityElementByMooreAlgo(int[] numbs){
    int freq = 0;
    int ans = 0;
        for (int numb : numbs) {
            if (freq == 0) {
                ans = numb;
            }
            if (ans == numb) {
                freq++;
            } else {
                freq--;
            }
        }
    return ans;
 }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 2, 2};
        System.out.println(MajorityElementByMooreAlgo(arr));
    }
}
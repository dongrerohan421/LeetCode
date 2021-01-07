package kth_missing_positive_number;

public class Solution {
    public int findKthPositive(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i] - (i + 1);
            if (x >= k)
                return i + k;
        }
        return arr.length + k;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr = { 2, 3, 5 };
        int k = 3;

        solution.findKthPositive(arr, k);
    }
}

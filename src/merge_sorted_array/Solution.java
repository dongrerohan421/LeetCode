package merge_sorted_array;

public class Solution {
    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };

        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;

        mergeSortedArray.merge(nums1, m, nums2, n); // Output: [1,2,2,3,5,6]
    }
}

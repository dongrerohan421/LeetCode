package search_insert_position;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int nums[] = { 1, 3, 5, 6 };
        int target = 5;

        solution.searchInsertLinearScan(nums, target);
        solution.searchInsertBinarySearch(nums, target);

        int nums1[] = { 1, 3, 5, 6 };
        int target1 = 2;

        solution.searchInsertLinearScan(nums1, target1);
        solution.searchInsertBinarySearch(nums1, target1);

        int nums2[] = { 1, 3, 5, 6 };
        int target2 = 7;

        solution.searchInsertLinearScan(nums2, target2);
        solution.searchInsertBinarySearch(nums2, target2);
    }
}

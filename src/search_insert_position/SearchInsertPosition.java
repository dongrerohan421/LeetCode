package search_insert_position;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int nums[] = { 1, 3, 5, 6 };
        int target = 5;

        solution.searchInsertPosition(nums, target);

        int nums1[] = { 1, 3, 5, 6 };
        int target1 = 2;

        solution.searchInsertPosition(nums1, target1);

        int nums2[] = { 1, 3, 5, 6 };
        int target2 = 7;

        solution.searchInsertPosition(nums2, target2);
    }
}

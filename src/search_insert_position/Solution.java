package search_insert_position;

public class Solution {
    /**
     * Linear scan solution.
     * Time: O(n)
     * Space: O(1)
     */
    public int searchInsertLinearScan(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] >= target) {
                System.out.println("searchInsertLinearScan Output: " + i);
                return i;
            }
        }

        System.out.println("searchInsertLinearScan Output: " + nums.length);
        return nums.length;
    }

    /**
     * Binary search / lower-bound solution.
     * Time: O(log n)
     * Space: O(1)
     */
    public int searchInsertBinarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }

        System.out.println("searchInsertBinarySearch Output: " + left);
        return left;
    }
}

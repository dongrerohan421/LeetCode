package search_insert_position;

public class Solution {

    public int searchInsertPosition(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            
            int largestTarget = nums[nums.length - 1] - target;

            if (target == nums[i]) {
                System.out.println("Output: " + i);
                return i;
            } else if (nums[i] > target) {
                System.out.println("Output: " + i);
                return i;
            } else if (largestTarget < 0) {
                System.out.println("Output: " + nums.length);
                return nums.length;
            }
        }

        throw new IllegalArgumentException("No Search Insert Position solution");
    }
}

package create_target_array_in_the_given_order;

import java.util.ArrayList;

public class CreateTargetArrayInTheGivenOrder {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };
        createTargetArray(nums, index); // Output: [0,4,1,3,2]
        createTargetArray2(nums, index); // Output: [0,4,1,3,2]

        int[] nums2 = { 1, 2, 3, 4, 0 };
        int[] index2 = { 0, 1, 2, 3, 0 };
        createTargetArray(nums2, index2); // Output: [0,1,2,3,4]

        int[] nums3 = { 1 };
        int[] index3 = { 0 };
        createTargetArray(nums3, index3); // Output: [1]
    }

    // Time complexity: O(n), Runtime: 1 ms, Memory Usage: 42.5 MB
    private static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> aL = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            aL.add(index[i], nums[i]);
        }

        int[] target = new int[nums.length];
        for (int i = 0; i < target.length; i++) {
            target[i] = aL.get(i);
        }
        return target;
    }

    // Time complexity: O(n*n), Runtime: 1 ms, Memory Usage: 42.6 MB
    private static int[] createTargetArray2(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int idx = index[i];
            if (idx < i) {
                for (int j = i; j > idx; j--) {
                    target[j] = target[j - 1];
                }
            }
            target[idx] = nums[i];
        }
        return target;
    }
}

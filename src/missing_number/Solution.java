package missing_number;

public class Solution {

    public int MissingNumber(int[] nums) {
        int result = nums.length;

        for (int i = 0; i < nums.length; i++) {
            result ^= i;
            result ^= nums[i];
        }

        System.out.println("Output: " + result);
        return result;
    }

}

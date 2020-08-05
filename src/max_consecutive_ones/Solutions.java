package max_consecutive_ones;

public class Solutions {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int global = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                global = Math.max(count, global);
            } else {
                count = 0;
            }
        }
        return global;
    }
}
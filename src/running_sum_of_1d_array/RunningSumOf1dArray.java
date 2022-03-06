package running_sum_of_1d_array;

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        runningSum(nums); // output: [1, 3, 6, 10]
        runningSum2(nums); // output: [1, 3, 6, 10]
        int[] nums2 = { 1, 1, 1, 1, 1 };
        runningSum(nums2); // output: [1, 2, 3, 4, 5]
        runningSum2(nums2); // output: [1, 2, 3, 4, 5]
        int[] nums3 = { 3, 1, 2, 10, 1 };
        runningSum(nums3); // output: [3, 4, 6, 16, 17]
        runningSum2(nums3); // output: [3, 4, 6, 16, 17]
    }

    private static int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            runningSum[i] = sum;
        }
        return runningSum;
    }

    private static int[] runningSum2(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

}

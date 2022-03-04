package concatenation_of_array;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 1 };
        getConcatenation(nums); // output: [1,2,1,1,2,1]
        getConcatenation2(nums); // output: [1,2,1,1,2,1]
        getConcatenation3(nums); // output: [1,2,1,1,2,1]
        int[] nums2 = { 1, 3, 2, 1 };
        getConcatenation(nums2); // output: [1,3,2,1,1,3,2,1]
        getConcatenation2(nums2); // output: [1,3,2,1,1,3,2,1]
        getConcatenation3(nums2); // output: [1,3,2,1,1,3,2,1]
    }

    private static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0, j = 0; i < ans.length && j < n; i++) {
            if (i >= n) {
                ans[j + n] = nums[j];
                j++;
            } else {
                ans[i] = nums[i];
            }
        }

        return ans;
    }

    private static int[] getConcatenation2(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            // first half of output array
            ans[i] = nums[i];
            // second half of output array
            ans[i + n] = nums[i];
        }

        return ans;
    }

    private static int[] getConcatenation3(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i + n] = ans[i] = nums[i];
        }

        return ans;
    }
}

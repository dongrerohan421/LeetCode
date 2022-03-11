package decompress_run_length_encoded_list;

import java.util.Arrays;

public class DecompressRunLengthEncodedList {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        decompressRLElist(nums);
    }

    // Time complexity:O(n), Runtime: 1 ms, Memory Usage: 47.6 MB
    private static int[] decompressRLElist(int[] nums) {
        int arrSize = 0;
        for (int i = 0; i < nums.length; i += 2) {
            arrSize += nums[i];
        }

        int[] result = new int[arrSize];
        int startIdx = 0;
        for (int i = 0; i < nums.length; i += 2) {
            Arrays.fill(result, startIdx, startIdx + nums[i], nums[i + 1]);
            startIdx += nums[i];
        }
        return result;
    }
}

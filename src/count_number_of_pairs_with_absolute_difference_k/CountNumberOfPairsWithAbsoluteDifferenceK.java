package count_number_of_pairs_with_absolute_difference_k;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfPairsWithAbsoluteDifferenceK {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 1 };
        countKDifference(nums, 1); // output: 4
        int[] nums2 = { 1, 3 };
        countKDifference(nums2, 3); // output: 0
        int[] nums3 = { 3, 2, 1, 5, 4 };
        countKDifference2(nums3, 2); // output: 3
        countKDifference3(nums3, 2); // output: 3
        countKDifference4(nums3, 2); // output: 3
    }

    // Time complexity: O(n*n), Runtime: 6 ms, Memory Usage: 41.4 MB
    private static int countKDifference(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    count++;
                }
            }
        }
        return count;
    }

    // Time complexity: O(n*n), Runtime: 13 ms, Memory Usage: 44.1 MB
    private static int countKDifference2(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int diff = nums[i] - nums[j]; // To find difference
                int absNum = (diff < 0) ? -diff : diff; // To return absolute value
                if (absNum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    // Time complexity: O(n), Runtime: 3 ms, Memory Usage: 44.4 MB
    private static int countKDifference3(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            count += map.getOrDefault(i - k, 0) + map.getOrDefault(i + k, 0);
        }
        return count;
    }

    // Time complexity: O(n), Runtime: 2 ms, Memory Usage: 44.6 MB
    private static int countKDifference4(int[] nums, int k) {
        int ans = 0;
        int[] count = new int[101];

        for (int i : nums) {
            if (i + k <= 100)
                ans += count[i + k];

            if (i - k >= 1)
                ans += count[i - k];

            count[i]++;
        }
        return ans;
    }
}

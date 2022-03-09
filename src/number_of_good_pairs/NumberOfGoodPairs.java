package number_of_good_pairs;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1, 1, 3 };
        numIdenticalPairs(nums); // output: 4
        numIdenticalPairs2(nums); // output: 4
        numIdenticalPairs3(nums); // output: 4
        int[] nums2 = { 1, 1, 1, 1 };
        numIdenticalPairs(nums2); // output: 6
        numIdenticalPairs2(nums2); // output: 6
        int[] nums3 = { 1, 2, 3 };
        numIdenticalPairs(nums3); // output: 0
        numIdenticalPairs2(nums3); // output: 0
    }

    // Time complexity: O(n*n), Runtime: 1 ms, Memory Usage: 39.7 MB
    private static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    // Time complexity: O(n), SPACE : O(N), Runtime: 1 ms, Memory Usage: 42.3 MB
    private static int numIdenticalPairs2(int[] nums) {
        Map<Integer, Integer> hMap = new HashMap<>();
        int count = 0;
        for (int i : nums) {
            int friendCount = hMap.getOrDefault(i, 0);
            count += friendCount;
            hMap.put(i, friendCount + 1);
        }
        return count;
    }

    // Time complexity: O(n), SPACE : O(N), Runtime: 1 ms, Memory Usage: 41.7 MB
    private static int numIdenticalPairs3(int[] nums) {
        int ans = 0;
        int[] count = new int[101];

        for (int n : nums) {
            ans += count[n];
            count[n]++;
        }

        return ans;
    }
}

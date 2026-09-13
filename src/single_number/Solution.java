package single_number;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    // O(n) time, 𝑂(𝑛) space
    public int singleNumberUsingHashMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (var entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("Output: " + entry.getKey());
                return entry.getKey();
            }
        }
        throw new IllegalStateException(
                "Input does not contain exactly one single number");
    }

    // O(n) time, 𝑂(1) space
    public int singleNumberUsingXor(int[] nums) {
        int result = 0;

        for (int number : nums) {
            result ^= number;
        }
        System.out.println("Output: " + result);
        return result;
    }

}

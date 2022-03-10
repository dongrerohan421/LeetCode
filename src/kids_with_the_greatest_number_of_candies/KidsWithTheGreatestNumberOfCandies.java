package kids_with_the_greatest_number_of_candies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 1, 3 };
        kidsWithCandies(candies, 3); // Output: [true,true,true,false,true]
        kidsWithCandies2(candies, 3); // Output: [true,true,true,false,true]
        int[] candies2 = { 4, 2, 1, 1, 2 };
        kidsWithCandies(candies2, 1); // Output: [true,false,false,false,false]
        kidsWithCandies3(candies2, 1); // Output: [true,false,false,false,false]
        int[] candies3 = { 12, 1, 12 };
        kidsWithCandies(candies3, 10); // Output: [true,false,true]
    }

    // Time complexity: O(n), Runtime:0 ms, Memory Usage: 41.8 MB
    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxVal = Integer.MIN_VALUE;
        List<Boolean> result = new ArrayList<>(candies.length);

        // To find maxValue from input array
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > maxVal) {
                maxVal = candies[i];
            }
        }

        // To add vaues to result
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= maxVal) {
                result.add(i, true);
            } else {
                result.add(i, false);
            }
        }

        return result;
    }

    // Time complexity: O(n), Runtime:1 ms, Memory Usage: 43.9 MB
    private static List<Boolean> kidsWithCandies2(int[] candies, int extraCandies) {
        int max = -1;
        List<Boolean> result = new ArrayList<>(candies.length);

        // To find maxValue from input array
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(candies[i], max);
        }

        // To add vaues to result
        for (int i = 0; i < candies.length; i++) {
            result.add(candies[i] + extraCandies >= max);
        }

        return result;
    }

    // Using Java Streams, Runtime:6 ms, Memory Usage: 43.1 MB
    private static List<Boolean> kidsWithCandies3(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();

        return Arrays.stream(candies)
                .mapToObj(candy -> candy + extraCandies >= max)
                .collect(Collectors.toList());
    }
}

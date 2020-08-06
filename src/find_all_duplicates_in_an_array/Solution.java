package find_all_duplicates_in_an_array;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = Arrays.stream(nums) // IntStream
                .boxed() // Stream<Integer>
                .collect(Collectors.toList());

        return list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // perform group
                                                                                                        // by
                // count
                .entrySet().stream().filter(e -> e.getValue() > 1L) // using take only those element whose count is
                                                                    // greater than 1
                .map(e -> e.getKey()) // using map take only value
                .collect(Collectors.toList()); // convert group by result to list
    }
}
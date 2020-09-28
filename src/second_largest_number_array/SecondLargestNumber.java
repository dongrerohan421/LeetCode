package second_largest_number_array;

import java.util.Arrays;

public class SecondLargestNumber {
    public int secondLargestNumber(int[] arr) {
        Arrays.sort(arr);

        return arr[arr.length - 1 - 1];
    }
}

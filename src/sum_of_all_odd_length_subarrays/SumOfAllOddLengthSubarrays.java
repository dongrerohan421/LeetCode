package sum_of_all_odd_length_subarrays;

public class SumOfAllOddLengthSubarrays {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 5, 3 };
        sumOddLengthSubarrays(arr); // Output: 58
        int[] arr2 = { 1, 2 };
        sumOddLengthSubarrays(arr2); // Output: 3
        int[] arr3 = { 10, 11, 12 };
        sumOddLengthSubarrays(arr3); // Output: 66
    }

    // Time complexity: O(n), Space: O(1), Runtime: 1 ms, Memory Usage: 40.9 MB
    private static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int arrLen = arr.length;

        for (int i = 0; i < arrLen; i++) {
            int end = i + 1;
            int start = arrLen - i;
            int total = start * end;
            int odd = total / 2;
            if (total % 2 == 1) {
                odd++;
            }

            sum += odd * arr[i];
        }

        return sum;
    }
}

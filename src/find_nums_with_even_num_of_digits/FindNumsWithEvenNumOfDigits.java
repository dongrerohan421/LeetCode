package find_nums_with_even_num_of_digits;

public class FindNumsWithEvenNumOfDigits {
    public int findNumbers(int[] nums) {
        int max = 0;
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != 0) {
                nums[i] /= 10;
                ++counter;
            }
            if (counter % 2 == 0) {
                max += 1;
            }
            counter = 0;
        }
        return max;
    }
}
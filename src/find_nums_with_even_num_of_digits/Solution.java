package find_nums_with_even_num_of_digits;

public class Solution {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        int[] nums2 = { 555, 901, 482, 1771 };
        int[] nums3 = { 473, 315, 322, 431, 686, 264, 442 };
        FindNumsWithEvenNumOfDigits evenNumOfDigits = new FindNumsWithEvenNumOfDigits();
        System.out.println(evenNumOfDigits.findNumbers(nums));
        System.out.println(evenNumOfDigits.findNumbers(nums2));
        System.out.println(evenNumOfDigits.findNumbers(nums3));

    }
}

package missing_number;

public class MissingNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int nums[] = { 3, 0, 1 };
        solution.MissingNumber(nums);

        int nums1[] = { 0, 1 };
        solution.MissingNumber(nums1);

        int nums2[] = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        solution.MissingNumber(nums2);
    }
}

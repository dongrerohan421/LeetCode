package single_number;

public class SingleNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int nums[] = { 2, 2, 1 };
        solution.singleNumberUsingHashMap(nums);

        int nums1[] = { 4, 1, 2, 1, 2 };
        solution.singleNumberUsingXor(nums1);

        int nums2[] = { 1 };
        solution.singleNumberUsingXor(nums2);
    }
}

package build_array_from_permutation;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] nums = { 0, 2, 1, 5, 3, 4 };
        printArray(buildArray(nums));
        printArray(buildArray2(nums));
        int[] nums2 = { 5, 0, 1, 2, 3, 4 };
        printArray(buildArray(nums2));
        printArray(buildArray2(nums2));
    }

    private static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println("\n------------");
    }

    // method 1
    private static int[] buildArray(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // this is done to keep both old and new value together.
            // going by the example of [5,0,1,2,3,4]
            // after this nums[0] will be 5 + 6*(4%6) = 5 + 24 = 29
            // now for next index calulation we might need the original value of num[0]
            // which can be obtain by num[0]%6 = 29%6 = 5
            // if we want to get just he new value of num[0], we can get it by num[0]/6 =
            // 29/6 = 4
            nums[i] = nums[i] + n * (nums[nums[i]] % n);
        }

        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] / n;
        }

        return nums;
    }

    // method 2
    private static int[] buildArray2(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}

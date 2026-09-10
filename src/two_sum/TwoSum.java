package two_sum;

public class TwoSum {

	public static void main(String[] args) {
		Solution solution = new Solution();
		HashMapSolution hashMapSolution = new HashMapSolution();

		int[] nums = { 2, 7, 11, 15 };
		int target = 9;

		solution.twoSum(nums, target);
		hashMapSolution.twoSum(nums, target);
	}
}
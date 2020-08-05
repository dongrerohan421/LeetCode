package max_consecutive_ones;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        Solutions solutions = new Solutions();
        int[] nums = { 1, 0, 1, 1, 0, 1 };
        solutions.findMaxConsecutiveOnes(nums);

        int[] num = { 0 };
        solutions.findMaxConsecutiveOnes(num);
    }
}
package squares_of_a_sorted_array;

public class Solution {
    public static void main(String[] args) {
        int[] nums = { -4, -1, 0, 3, 10 };
        int[] nums2 = { -7, -3, 2, 3, 11 };

        SquaresOfASortedArray squaresOfASortedArray = new SquaresOfASortedArray();

        squaresOfASortedArray.sortedSquares(nums);
        squaresOfASortedArray.sortedSquares(nums2);
    }
}

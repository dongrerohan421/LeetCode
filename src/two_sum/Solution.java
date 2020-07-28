package two_sum;

import java.util.Arrays;

public class Solution {
	public int[] twoSum(int[] nums, int target) {
        int sum = 0;
        int[] result;
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                sum = nums[i] + nums[j];
                if(target == sum){
					System.out.println(Arrays.toString(new int[]{i,j}));
                    return new int[]{i,j};
                }
            }
        }
        
        return new int[2];
    }
}

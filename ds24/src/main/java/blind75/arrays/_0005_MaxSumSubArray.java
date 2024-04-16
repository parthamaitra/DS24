package blind75.arrays;

public class _0005_MaxSumSubArray {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int runningSum = 0;
        for(int i =0; i< nums.length; i++) {
            runningSum += nums[i];
            if(runningSum < 0) {
                runningSum = 0;
            }
            maxSum = Math.max(maxSum, runningSum);

        }
        return maxSum;
    }
}

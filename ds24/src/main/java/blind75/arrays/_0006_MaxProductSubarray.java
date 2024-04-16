package blind75.arrays;

public class _0006_MaxProductSubarray {
    public int maxProduct(int[] nums) {
        int leftProduct = 1;
        int rightProduct = 1;
        int answer = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i ++) {
            if(leftProduct == 0) {
                leftProduct = 1;
            }
            if(rightProduct == 0) {
                rightProduct = 1;
            }
            leftProduct = leftProduct * nums[i];
            rightProduct = rightProduct * nums[nums.length - i -1];
            answer =Math.max(rightProduct, Math.max(answer, leftProduct));

        }
        return answer;
    }
}

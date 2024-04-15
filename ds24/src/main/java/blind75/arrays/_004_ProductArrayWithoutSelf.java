package blind75.arrays;

public class _004_ProductArrayWithoutSelf {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int [] left = new int[len];
        int [] right = new int[len];
        int [] out = new int[len];

        left[0] = 1; //setting the value to 1 for the first element
        for(int i = 1; i<nums.length; i++) {
            left[i] = left[i -1] * nums[i-1];
        }
        right[len -1] = 1;//setting the right most value to 1
        for(int i = len -2; i >= 0; i--) {
            right[i] = right[i+1] * nums[i +1];
        }

        for(int i = 0; i <out.length; i++ ) {
            out[i] = left[i] * right[i];
        }
        return out;
    }
}

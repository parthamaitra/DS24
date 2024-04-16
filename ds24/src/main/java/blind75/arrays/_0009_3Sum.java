package blind75.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _0009_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> out = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            int j = i+1;
            int k = nums.length - 1;
            while(j <= k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    out.add(Arrays.asList(nums[i] , nums[j] , nums[k]));
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j-1]) {
                        j++;
                    }
                    while(j <k && nums[k] == nums[k+1]){
                        k--;
                    }
                }
                else if(sum < 0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return out;
    }
}

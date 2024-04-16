package blind75.arrays;

import java.util.HashSet;
import java.util.Set;

public class _0003_ContainsDuplicates {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i ++) {
            if(set.add(nums[i]) == false) {
                return true;
            }
        }
        return false;
    }
}

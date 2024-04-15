package blind75.arrays;

import java.util.HashMap;
import java.util.Map;

public class _0001_TwoSum {
    public int[] twoSum(int[] arr, int target) {
        int[] out = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i ++) {
            int key = target - arr[i];
            if(map.containsKey(key)) {
                out[0] = i;
                out[1] = map.get(key);
                return out;
            }
            else {
                map.put(arr[i], i);
            }
        }
        return out;
    }
}

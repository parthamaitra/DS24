package blind75.arrays;

public class _0007_MinimumInSortedArray {
    public int getMinFromSortedRotatedArray (int [] arr) {
        int result = Integer.MAX_VALUE;
        int low = 0;
        int high = arr.length -1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr [low] <= arr[mid] ) {
                result = Math.min(result, arr[low]);
                low = mid + 1;
            }
            else {
                result = Math.min(result, arr[mid]);
                high = mid -1;
            }
        }
        return result;
    }
}

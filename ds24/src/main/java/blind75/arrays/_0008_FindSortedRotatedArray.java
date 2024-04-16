package blind75.arrays;

public class _0008_FindSortedRotatedArray {
    public int findInSortedRotatedArray(int [] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while(low <= high) {
            int mid = (low+high)/2;
            if(arr[mid] == target){
                return mid;
            }
            //left portion is sorted
            else if( arr[low] <= arr[mid]){
                if(arr[low] <= target && target <= arr[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid +1;
                }
            }
            //right portion is sorted
            else if(arr[mid] <= arr[high]){
                if(arr[mid] <= target && target <= arr[high]){
                    low = mid + 1;
                }
                else{
                    high = mid -1;
                }

            }
        }
        return -1;
    }
}

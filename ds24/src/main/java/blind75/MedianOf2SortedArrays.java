package blind75;

public class MedianOf2SortedArrays {
    public static double getMedian(int[] a, int[]b){
        int len1 = a.length;
        int len2 = b.length;
        if(len1 > len2) {
            return getMedian(b, a);
        }
        int total = len1 + len2;
        int mid = total + 1 /2;

        int low = 0;
        int high = len1;

        while (low <= high) {
            int mid1 = (low + high)/2;
            int mid2 = mid - mid1;

            int l1 = (mid1 > 0 )? a[mid1 -1] : Integer.MIN_VALUE;
            int l2 = (mid2 > 0 )? b[mid2 -1] : Integer.MIN_VALUE;
            int r1 = (mid1 < len1)? a[mid1]: Integer.MAX_VALUE;
            int r2 = (mid2 < len2)? b[mid2]: Integer.MAX_VALUE;

            if(l1 <= r2 && l2<=r1){
                if(total %2 == 0){
                    return (Math.max(l1, l2) + Math.min(r1, r2))/2.0;
                }
                else {
                    return Math.max(l1, l2);
                }
            }
            if(l1 > r2 ){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return 0;
    }
}

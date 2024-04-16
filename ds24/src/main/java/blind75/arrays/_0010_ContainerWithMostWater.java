package blind75.arrays;

public class _0010_ContainerWithMostWater {
    public int maxArea(int[] height) {
        int low = 0; //putting the first pointer
        int high = height.length -1;//last pointer
        int maxWater = Integer.MIN_VALUE;
        while(low < high) {
            int currentWater = Math.min(height[low], height[high]) * (high - low);
            maxWater = Math.max(maxWater, currentWater);
            if(height[low] < height[high]) {
                low ++;
            }
            else {
                high --;
            }
        }
        return maxWater;
    }
}

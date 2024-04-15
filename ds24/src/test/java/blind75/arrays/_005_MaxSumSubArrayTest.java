package blind75.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _005_MaxSumSubArrayTest {
    private _005_MaxSumSubArray objUnderTest = new _005_MaxSumSubArray();

    @Test
    public void test() {
        int[] arr1 = {-2,1,-3,4,-1,2,1,-5,4};
        assertEquals(6, objUnderTest.maxSubArray(arr1));
    }

}
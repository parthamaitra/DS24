package blind75.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _0010_ContainerWithMostWaterTest {
    private _0010_ContainerWithMostWater objUnderTest = new _0010_ContainerWithMostWater();

    @Test
    public void test() {
        assertEquals(49, objUnderTest.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        assertEquals(1, objUnderTest.maxArea(new int[]{1,1}));
        assertEquals(17, objUnderTest.maxArea(new int [] {2,3,4,5,18,17,6}));
    }

}
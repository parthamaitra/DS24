package blind75.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _0007_MinimumInSortedArrayTest {
    private _0007_MinimumInSortedArray objUnderTest = new _0007_MinimumInSortedArray();

    @Test
    public void test() {
        assertEquals(2, objUnderTest.getMinFromSortedRotatedArray(new int[]{4,5,6,2,3}));
    }

}
package blind75.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _004_ProductArrayWithoutSelfTest {

    private _004_ProductArrayWithoutSelf objUnderTest = new _004_ProductArrayWithoutSelf();

    @Test
    public void test() {
        int[] arr1= {1,2,3,4};
        assertArrayEquals(new int[] {24,12,8,6}, objUnderTest.productExceptSelf(arr1));
    }

}
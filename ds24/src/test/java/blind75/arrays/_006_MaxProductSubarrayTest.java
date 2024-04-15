package blind75.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _006_MaxProductSubarrayTest {

    private _006_MaxProductSubarray objUnderTest = new _006_MaxProductSubarray();

    @Test
    public void test() {
        assertEquals(0, objUnderTest.maxProduct(new int [] {-2,0,-1}));
    }

}
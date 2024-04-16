package blind75.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _002_BestTimeToBuyAndSellStockTest {

    private _0002_BestTimeToBuyAndSellStock objUnderTest;

    @BeforeEach
    public void setup() {
        objUnderTest = new _0002_BestTimeToBuyAndSellStock();
    }

    @Test
    public void test() {
        int[] arr = {7,6,4,3,1};
        assertEquals(0, objUnderTest.maxProfit(arr));
        int[] arr2 = {7,1,5,3,6,4};
        assertEquals(5, objUnderTest.maxProfit(arr2));
    }

}
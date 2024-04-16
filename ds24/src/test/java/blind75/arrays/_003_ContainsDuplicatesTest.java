package blind75.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _003_ContainsDuplicatesTest {
    _0003_ContainsDuplicates objUnderTest = new _0003_ContainsDuplicates();
    @Test
    public  void test() {
        int[] arr1 = {1,2,3,1};
        assertTrue(objUnderTest.containsDuplicate(arr1));
    }


}
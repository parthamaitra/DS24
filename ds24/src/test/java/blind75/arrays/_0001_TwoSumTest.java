package blind75.arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;


public class _0001_TwoSumTest {
    private _0001_TwoSum objUnderTest;
    @BeforeEach
    public void setup(){
        objUnderTest = new _0001_TwoSum();
    }

    @Test
    public void testTwoSum(){
        int[] arr = {2, 4, 5, 6, 1};
        Arrays.stream(objUnderTest.twoSum(arr, 3)).forEach(System.out::println);

        assertArrayEquals(new int[]{4, 0},objUnderTest.twoSum(arr, 3) );
    }
}

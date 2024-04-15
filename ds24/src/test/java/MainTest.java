

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import blind75.Main;

public class MainTest {

    Main objUnderTest;
    @BeforeEach
    public void setUp() {
        System.out.println("Setting up...");
        objUnderTest = new Main();
    }
    @Test
    public void testMain() {
        System.out.println("Testing main...");
        objUnderTest.sayHi();
    }

    @Test
    public void testAdd() {
        System.out.println("Testing add...");
        int result = objUnderTest.add(1, 2);
        assert(result == 4);
    }
    
}

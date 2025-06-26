import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private static Main main;

    @BeforeAll
    public static void setup() {
        main = new Main();
        System.out.println("Test setup complete.");
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("Test teardown complete.");
    }


    @Test
    void sub() {
        int a = 5;
        int b = 7;

        int result = main.sub(a, b);

        assertEquals(-2, result);
    }

    @Test
    void isPositive() {
        int number = -3;

        boolean result = main.isPositive(number);

        assertFalse(result);
    }
}
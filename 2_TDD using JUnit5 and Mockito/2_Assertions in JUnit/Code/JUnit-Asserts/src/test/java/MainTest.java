import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void add() {
        assertEquals(5, Main.add(2, 3));
    }

    @Test
    void isEven() {
        assertTrue(Main.isEven(8));
    }

    @Test
    void isOdd() {
        assertFalse(Main.isEven(9));
    }

    @Test
    void getGreeting() {
        assertNotNull(Main.getGreeting("Jack"));
    }

    @Test
    void getGreetingNull() {
        assertNull(Main.getGreeting(null));
    }
}
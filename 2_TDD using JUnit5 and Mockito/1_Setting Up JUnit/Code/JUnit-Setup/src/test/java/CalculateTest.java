import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {

    @Test
    void sum() {
        assertEquals(6, new Calculate().sum(new int[]{1,2,3}));
    }

    @Test
    void product() {
        assertEquals(6, new Calculate().product(new int[]{1,2,3}));
    }
}
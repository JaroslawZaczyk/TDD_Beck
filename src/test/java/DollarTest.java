import money.Dollar;
import money.Money;
import org.junit.Test;

import static org.junit.Assert.*;

public class DollarTest {

    @Test
    public void multiplyTest() {
        Money five = Money.dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    public void equalityTest() {
        assertTrue(new Dollar(5).equals(new Dollar((5))));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}
import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersTest {

    @Test
    public void sum() {
        Numbers numbers = new Numbers();
        int actual = numbers.sum(6);
        int expected = 21;
        assertEquals(expected, actual);
    }
}